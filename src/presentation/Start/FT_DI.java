package presentation.Start;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import domaine.Commun.ANSEJ;

import lesAutreCas.FSDirection;
import lesAutreCas.FT_DI3;



public class FT_DI extends JFrame implements ActionListener {
	/**
	 * @uml.property  name="jMenuBar1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JMenuBar jMenuBar1= new  JMenuBar ();
	  /**
	 * @uml.property  name="jMenuFile"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JMenu jMenuFile = new JMenu ();
	  /**
	 * @uml.property  name="jMenuHelp"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JMenu jMenuHelp = new JMenu ();
	  /**
	 * @uml.property  name="jMenuFileExit"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JMenuItem jMenuFileExit = new JMenuItem ();
	  /**
	 * @uml.property  name="jMenuHelpAbout"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JMenuItem jMenuHelpAbout = new JMenuItem ();
	/**
	 * @uml.property  name="jLabel1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel1 = new JLabel();
	  /**
	 * @uml.property  name="jLabel2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel2 = new JLabel();
	  /**
	 * @uml.property  name="jLabel3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel3 = new JLabel();
	  /**
	 * @uml.property  name="jLabel4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel4 = new JLabel();
	  /**
	 * @uml.property  name="jButton1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JButton jButton1 = new JButton();
	  /**
	 * @uml.property  name="jButton2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JButton jButton2 = new JButton();
	  /**
	 * @uml.property  name="jButton3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JButton jButton3 = new JButton();
	  public FT_DI() throws HeadlessException {
	    try {
	      jbInit();
	    }
	    catch(Exception e) {
	      e.printStackTrace();
	    }
	  }
	  private void jbInit() throws Exception {
	    this.setSize(700,500);
	   this.setResizable(false);
	   this.setLocationRelativeTo(null);
	   jMenuFile.setText("Fichier");
	   jMenuFileExit.setText("Quitter");
	   jMenuFileExit.addActionListener(this);
	   jMenuHelpAbout.addActionListener(this);
	   jMenuHelp.setText("Aide");
	    jMenuHelpAbout.setText("A propos");
	    jMenuFile.add(jMenuFileExit);
	    jMenuHelp.add(jMenuHelpAbout);
	    jMenuBar1.add(jMenuFile);
	    jMenuBar1.add(jMenuHelp);
	    jLabel1.setBackground(Color.orange);
	    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
	    jLabel1.setForeground(Color.blue);
	    jLabel1.setOpaque(true);
	    jLabel1.setText("     ANSEJ");
	    jLabel1.setBounds(new Rectangle(-1, 0, 93, 27));
	    this.getContentPane().setLayout(null);
	    jLabel2.setBounds(new Rectangle(607, 0, 93, 27));
	    jLabel2.setText("     ANSEJ");
	    jLabel2.setOpaque(true);
	    jLabel2.setForeground(Color.blue);
	    jLabel2.setFont(new java.awt.Font("Dialog", 1, 16));
	    jLabel2.setBackground(Color.orange);
	    jLabel3.setBackground(Color.lightGray);
	    jLabel3.setFont(new java.awt.Font("Dialog", 3, 18));
	    jLabel3.setOpaque(true);
	    jLabel3.setText("                                    Espace  direction ");
	    jLabel3.setBounds(new Rectangle(92, 0, 514, 27));
	    jLabel4.setFont(new java.awt.Font("Dialog", 1, 15));
	    jLabel4.setText("          Vous voulez acc�dez  � : ");
	    jLabel4.setBounds(new Rectangle(76, 120, 240, 39));
	    jButton1.setBackground(Color.orange);
	    jButton1.setBounds(new Rectangle(324, 128, 263, 31));
	    jButton1.setEnabled(true);
	    jButton1.setFont(new java.awt.Font("Dialog", 1, 13));
	    jButton1.setOpaque(true);
	    jButton1.setText("  Gestion Des Utilisateurs ");
	    jButton2.setText("    Fonctions Conseiller Accompagnateur");
	    jButton2.setOpaque(true);
	    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
	    jButton2.setEnabled(true);
	    jButton2.setBounds(new Rectangle(326, 195, 264, 29));
	    jButton2.setBackground(Color.orange);
	    jButton3.setText("    Suivie D�cisionnelle");
	    jButton3.setOpaque(true);
	    jButton3.setFont(new java.awt.Font("Dialog", 1, 13));
	    jButton3.setEnabled(true);
	    jButton3.setBounds(new Rectangle(325, 257, 266, 28));
	    jButton3.setBackground(Color.orange);
	    jButton1.addActionListener((ActionListener) this);
	    jButton2.addActionListener((ActionListener) this);
	    jButton3.addActionListener((ActionListener) this);
	    this.getContentPane().add(jLabel1, null);
	    this.getContentPane().add(jLabel2, null);
	    this.getContentPane().add(jLabel3, null);
	    this.getContentPane().add(jLabel4, null);
	    this.getContentPane().add(jButton1, null);
	    this.getContentPane().add(jButton3, null);
	    this.getContentPane().add(jButton2, null);
	    this.setJMenuBar(jMenuBar1);
	  }
public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	JButton boutonCliqu� = (JButton) e.getSource();
	if(boutonCliqu�==jButton3){
		FSDirection fsd = new FSDirection();
		fsd.setVisible(true);
	}
	else
		if(boutonCliqu�==jButton1){
			FT_DI3 ft = new FT_DI3();
			ft.setVisible(true);	
		}
	
	  
		   }

public static void main(String[] args) {
	ANSEJ A = new ANSEJ();
	FT_DI faut = new FT_DI();
	faut.setVisible(true);
}

	  
		   }





