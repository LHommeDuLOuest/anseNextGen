package presentation.Inscription;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import domaine.Commun.Registre1;

public class FMessage extends JFrame {
	
	/**
	 * @uml.property  name="tnom"
	 * @uml.associationEnd  
	 */
	private JTextField tnom   ;
	
	public  FMessage(){
		super () ;
	    build ();
	}
	
	private void build (){
		setTitle ("WARNING ");
		setSize (900,500);
		setLocationRelativeTo (null);
		setResizable (false) ;
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContentPane ());
	}
	
	private JPanel buildContentPane ()
	{
	JPanel p = new JPanel () ;
	p.setLayout(new FlowLayout());
	p.setBackground(Color.white);
    tnom = new JTextField();
    tnom.setText("le promoteur a ete inserer avec succés");
    p.add(tnom);
	return p ;
	}

}

