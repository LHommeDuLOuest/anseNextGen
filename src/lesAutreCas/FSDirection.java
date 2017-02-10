package lesAutreCas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.SystemColor;
import javax.swing.*;

import domaine.Commun.ANSEJ;


import presentation.Start.FT_DI;


public class FSDirection extends JFrame implements ActionListener {
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
	 * @uml.property  name="jMenuFileAcceuilD"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JMenuItem jMenuFileAcceuilD = new JMenuItem ();
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
JButton jButton1 = new JButton ();
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
  /**
 * @uml.property  name="jLabel5"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel5 = new JLabel();
  /**
 * @uml.property  name="jLabel6"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel6 = new JLabel();
  /**
 * @uml.property  name="jButton4"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JButton jButton4 = new JButton();
  public FSDirection() throws HeadlessException {
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
	   jMenuFileAcceuilD.addActionListener(this);
	   jMenuHelp.setText("Aide");
	    jMenuHelpAbout.setText("A propos");
	    jMenuFileAcceuilD.setText("Acceuil direction");
	    jMenuFile.add(jMenuFileAcceuilD);
	    jMenuFile.add(jMenuFileExit);
	    jMenuHelp.add(jMenuHelpAbout);
	    jMenuBar1.add(jMenuFile);
	    jMenuBar1.add(jMenuHelp);
    jLabel1.setBackground(Color.orange);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(Color.blue);
    jLabel1.setOpaque(true);
    jLabel1.setText("           ANSEJ");
    jLabel1.setBounds(new Rectangle(0, 0, 130, 31));
    this.getContentPane().setLayout(null);
    jLabel2.setBackground(SystemColor.activeCaptionBorder);
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 16));
    jLabel2.setAlignmentY((float) 0.0);
    jLabel2.setOpaque(true);
    jLabel2.setText("                                         Espace Direction  ");
    jLabel2.setBounds(new Rectangle(128, 0, 449, 31));
    jLabel3.setText("           ANSEJ");
    jLabel3.setBounds(new Rectangle(577, 0, 130, 31));
    jLabel3.setOpaque(true);
    jLabel3.setForeground(Color.blue);
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel3.setBackground(Color.orange);
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel4.setText("      Que voulez vous rechercher :");
    jLabel4.setBounds(new Rectangle(8, 94, 245, 40));
    jButton1.addActionListener(this);
    jButton2.addActionListener(this);
    jButton3.addActionListener(this);
    jButton1.setBackground(Color.blue);
    jButton1.setBounds(new Rectangle(274, 96, 252, 29));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton1.setForeground(Color.white);
    jButton1.setText("     Les profils des promoteurs");
    jButton2.setText("  L\'etat d\'avancement des promoteurs ");
    jButton2.setForeground(Color.white);
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setBackground(Color.blue);
    jButton2.setBounds(new Rectangle(274, 157, 252, 29));
    jButton3.setBackground(Color.blue);
    jButton3.setBounds(new Rectangle(275, 221, 252, 29));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton3.setForeground(Color.white);
    jButton3.setText("    Coordonnées des promoteurs ");
    jLabel5.setBackground(Color.white);
    jLabel5.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel5.setOpaque(true);
    jLabel5.setText("                Fonctions  Recherche sur les Promoteurs");
    jLabel5.setBounds(new Rectangle(1, 30, 699, 23));
    jLabel6.setBounds(new Rectangle(27, 296, 170, 40));
    jLabel6.setText("       ou effectuer une :");
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton4.setText("    Une recherche plus Avancée ");
    jButton4.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton4.setForeground(Color.black);
    jButton4.setBounds(new Rectangle(223, 301, 252, 29));
    jButton4.setBackground(Color.orange);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jLabel6, null);
    this.getContentPane().add(jButton4, null);
    this.getContentPane().add(jLabel5, null);
    this.setJMenuBar(jMenuBar1);}
  

public void actionPerformed(ActionEvent e) {
	String requete1 = "select  nom , prenom,N_ETUDE ,HANDICAPE,EXPERIENCE,SPECIALITE FROM PROMOTEURS01";
    String requete2 = "select nom,prenom,DN,MATRICULE ,ETAT FROM PROMOTEURS01";
    String requete3 =  "select nom,prenom,DN,ADRESSE,COMMUNE,TEL,EMAIL from promoteurs01";	
	 Object ob = e.getSource();
		if (ob.equals(jMenuFileExit)){
			
			System.exit(0);    ;}
	  else {
		  if (ob.equals(jMenuHelpAbout)){JOptionPane.showConfirmDialog(null,
					"Déscription de la page  ",
					"Juste un test",
					JOptionPane.PLAIN_MESSAGE);}
		   
			   
		  else {
			  if (ob.equals(jMenuFileAcceuilD)){
               this.setVisible(false);
				  FT_DI ftdi = new FT_DI();
				  ftdi.setVisible(true);}
			  else{
				    
					JButton boutonCliqué = (JButton) e.getSource();
					if (boutonCliqué == jButton1){
						F_cher_users  z = new F_cher_users (requete1);}
						else { 
							if (boutonCliqué == jButton2){F_cher_users  z = new F_cher_users (requete2);}
							else { 
								if (boutonCliqué == jButton3){F_cher_users  z = new F_cher_users (requete3);}
								else { 
									if (boutonCliqué == jButton4){}
					}  
			  }
	
}


}}}}
public static void main(String[] args) {
	ANSEJ A = new ANSEJ();
	FSDirection faut = new FSDirection();
	faut.setVisible(true);}
}


