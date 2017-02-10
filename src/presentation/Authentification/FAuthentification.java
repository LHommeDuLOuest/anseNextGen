package presentation.Authentification;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import presentation.Start.*;
import domaine.Commun.ANSEJ;
import domaine.Observeur.Observateur;

public class FAuthentification extends JFrame implements ActionListener,Observateur{
	
    /**
	 * @uml.property  name="a"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private ANSEJ A;
	/**
	 * @uml.property  name="type"
	 */
	protected  String type = "rien" ;
	/**
	 * @uml.property  name="b1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JButton b1 = new JButton ("Annuler");
	/**
	 * @uml.property  name="b2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JButton b2 = new JButton ("Se connecter");
	/**
	 * @uml.property  name="nomText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField nomText = new JTextField(10);
	/**
	 * @uml.property  name="prenomText"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField prenomText = new JPasswordField(10);
	public String av_type(){
		return type ;
	}
    public FAuthentification (ANSEJ A){
    	this.A=A;
    	setTitle(" Application   ANSEJ");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
	JLabel nomLabel = new JLabel("Nom d'utilisateur ");
	
	nomText.setMaximumSize(nomText.getPreferredSize());
	Box hBox1 = Box.createHorizontalBox();
	hBox1.add(nomLabel);
	hBox1.add(Box.createHorizontalStrut(5));
	hBox1.add(nomText);
	JLabel prenomLabel = new JLabel("Mot de passe :" );

	prenomText.setMaximumSize(prenomText.getPreferredSize());
	Box hBox2 = Box.createHorizontalBox();
	hBox2.add(prenomLabel);
	hBox2.add(Box.createHorizontalStrut(20));
	hBox2.add(prenomText);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b1.setBackground(Color.blue);
	b1.setForeground(Color.white);
	b2.setBackground(Color.blue);
	b2.setForeground(Color.white);

	Box hBox3 = Box.createHorizontalBox();
	hBox3.add(b1);
	hBox3.add(Box.createHorizontalStrut(40));
	hBox3.add(b2);
	Box vBox = Box.createVerticalBox();
	vBox.add(hBox1);
	vBox.add(hBox2);
	vBox.add(Box.createGlue());
	vBox.add(hBox3);
	java.awt.Container c = getContentPane();
	c.add(vBox,BorderLayout.CENTER);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	 this.setSize(300,200);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);}

	
	public void actionPerformed(ActionEvent e) throws NullPointerException  {
		JButton boutonCliqué = (JButton) e.getSource();
		if (boutonCliqué == b2){
		// de la Calculatrice
			String T_USER ;
		String st1 = this.nomText.getText(); 
		String st2 = this.prenomText.getText();
		 if (st1.isEmpty()) {JOptionPane.showConfirmDialog(null,
				"Vous devez entrez votre nom d'utilisateur  Valide ",
				"Juste un test",
				JOptionPane.PLAIN_MESSAGE);}
		 else {
			if (st2.isEmpty()) {JOptionPane.showConfirmDialog(null,
					"Mot de passe obligatoire ",
					"Juste un test",
					JOptionPane.PLAIN_MESSAGE);}
			else { 
				A.getRegistre4().authentifier(st1,st2,this);
				
			      }}}	}	
	
	
	public void update() {
        FP_CA fpca= new FP_CA(A ,this.nomText.getText());
		fpca.setVisible(true);
	}
	
	public void update1() {
		FT_DI3_0 f = new FT_DI3_0();
		f.setVisible(true);
	}
	
	public void update2(){
		FT_DI fd = new FT_DI();
		fd.setVisible(true);
	}
	public void update4(int i, String j) {
		JOptionPane.showConfirmDialog(null,
				"cette utilisateur n'existe pas ",
				"Juste un test",
				JOptionPane.PLAIN_MESSAGE);
		
	}
	public void update(JFrame f) {
		// TODO Auto-generated method stub
		
	}
	

}

