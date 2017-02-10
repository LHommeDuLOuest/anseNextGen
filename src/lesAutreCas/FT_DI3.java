package lesAutreCas;

import javax.swing.*;

import domaine.Commun.ANSEJ;

import presentation.Start.FT_DI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FT_DI3 extends JFrame implements ActionListener {
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
 * @uml.property  name="jMenuDirection"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JMenuItem jMenuDirection = new JMenuItem();
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
   
  /**
 * @uml.property  name="jLabel5"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel5 = new JLabel();
  /**
 * @uml.property  name="jButton4"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JButton jButton4 = new JButton();
  public FT_DI3() throws HeadlessException {
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
   jMenuDirection.setText("Acceuil Direction");
   jMenuFileExit.setText("Quitter");
   jMenuFileExit.addActionListener(this);
   jMenuDirection.addActionListener(this);
   jMenuHelpAbout.addActionListener(this);
   jMenuHelp.setText("Aide");
    jMenuHelpAbout.setText("A propos");
    jMenuFile.add(jMenuFileExit);
    jMenuFile.add(jMenuDirection);
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
    jLabel3.setText("                              Espace  Administrateur ");
    jLabel3.setBounds(new Rectangle(92, 0, 514, 27));
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 15));
    jLabel4.setText("                          Vous voulez  : ");
    jLabel4.setBounds(new Rectangle(76, 120, 240, 39));
    jButton1.setBackground(Color.orange);
    jButton1.setBounds(new Rectangle(323, 133, 263, 31));
    jButton1.setEnabled(true);
    jButton1.setFont(new java.awt.Font("Dialog", 1, 13));
    jButton1.setOpaque(true);
    jButton1.setText("  Créer un nouveau utilisateur");
    jButton2.setText("    Modifier Mot de passe utilisateur");
    jButton2.setOpaque(true);
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setEnabled(true);
    jButton2.setBounds(new Rectangle(326, 195, 264, 29));
    jButton2.setBackground(Color.orange);
    jButton3.setText("    Supprimer un utilisateur");
    jButton3.setOpaque(true);
    jButton3.setFont(new java.awt.Font("Dialog", 1, 13));
    jButton3.setEnabled(true);
    jButton3.setBounds(new Rectangle(325, 257, 266, 28));
    jButton3.setBackground(Color.orange);
    jLabel5.setBackground(Color.orange);
    jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12));
    jLabel5.setOpaque(true);
    jLabel5.setRequestFocusEnabled(true);
    jLabel5.setText("                                                                 " +
    "                   GERER LES UTILISATEURS ");
    jLabel5.setBounds(new Rectangle(-5, 42, 703, 22));
    jButton4.setBackground(Color.orange);
    jButton4.setBounds(new Rectangle(324, 315, 266, 28));
    jButton4.setEnabled(true);
    jButton4.setFont(new java.awt.Font("Dialog", 1, 13));
    jButton4.setOpaque(true);
    jButton4.setText("    Voir Tous  les  utilisateurs ");
    jButton1.addActionListener(this);
    jButton2.addActionListener(this);
    jButton3.addActionListener(this);
    jButton4.addActionListener(this);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jLabel5, null);
    this.getContentPane().add(jButton4, null);
    this.getContentPane().add(jButton1, null);
    this.setJMenuBar(jMenuBar1);
    }
  public void actionPerformed(ActionEvent e) {
	  Object ob = e.getSource();
		if (ob.equals(jMenuFileExit)){
			
			System.exit(0);    }
	  else {
		  if(ob.equals(jMenuDirection)) {this.setVisible(false);
			  FT_DI ft_di = new FT_DI ();
			  ft_di.setVisible(true);
		  }
	  
	       else{  if (ob.equals(jMenuHelpAbout)){JOptionPane.showConfirmDialog(null,
					"Déscription de la page  ",
					"Juste un test",
					JOptionPane.PLAIN_MESSAGE);}
		  else{  JButton boutonCliqué = (JButton) e.getSource();
	   if (boutonCliqué == jButton1){this.setVisible(false);
		   FD_CU fd_cu = new FD_CU();
		   fd_cu.setVisible(true);
	   }
	   else {
		   if (boutonCliqué == jButton2){this.setVisible(false);
		   FD_MM fd_mm = new FD_MM();
		   fd_mm.setVisible(true);
		 }
		   else 
			   if(boutonCliqué == jButton3){this.setVisible(false);
			   FD_SU fd_su = new FD_SU();
			   fd_su.setVisible(true);
			 }
			   else {}
	   }  
		  }}}}
  
  public static void main(String[] args) {
		ANSEJ A = new ANSEJ();
		FT_DI3 faut = new FT_DI3();
		faut.setVisible(true);
	}
}




