package presentation.Start;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.Eligibilite.AF_ELIG;
import presentation.Inscription.FINSCRIPTION3;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import domaine.Commun.ANSEJ;
import presentation.AjouterCo.F_COPROMOTEURS;
import presentation.Authentification.FChngerMot;


  public class FP_CA extends JFrame implements ActionListener {
	  /**
	 * @uml.property  name="a"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ANSEJ A;
	  /**
	 * @uml.property  name="user"
	 */
	private String user;
	  
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
	 * @uml.property  name="jButton4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    JButton jButton4 = new JButton();
     /**
	 * @uml.property  name="jButton5"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    JButton jButton5 = new JButton();
     /**
	 * @uml.property  name="jButton6"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    JButton jButton6 = new JButton();
     /**
	 * @uml.property  name="jButton7"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    JButton jButton7 = new JButton();
     
  public FP_CA(ANSEJ A,String s) throws HeadlessException {
	  this.user =s;
	  this.A=A;
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
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
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
    jLabel1.setText("           ANSEJ");
    jLabel1.setBounds(new Rectangle(-1, 1, 130, 31));
    this.getContentPane().setLayout(null);
    jLabel2.setBackground(SystemColor.activeCaptionBorder);
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel2.setAlignmentY((float) 0.0);
    jLabel2.setOpaque(true);
    jLabel2.setText("                  Bienvenue sur votre espace de travail ");
    jLabel2.setBounds(new Rectangle(128, 0, 449, 31));
    jLabel3.setText("           ANSEJ");
    jLabel3.setBounds(new Rectangle(577, 0, 130, 31));
    jLabel3.setOpaque(true);
    jLabel3.setForeground(Color.blue);
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel3.setBackground(Color.orange);
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel4.setText("      Que voulez vous faire :");
    jLabel4.setBounds(new Rectangle(24, 78, 200, 40));
    jButton1.addActionListener(this);
    jButton1.setBackground(Color.blue);
    jButton1.setBounds(new Rectangle(256, 85, 252, 29));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton1.setForeground(Color.white);
    jButton1.setText("    Inscrire un nouveau promoteur");
    jButton2.setText("    Affecter l\'eligibilité");
    jButton2.setForeground(Color.white);
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setBackground(Color.blue);
    jButton2.setBounds(new Rectangle(256, 123, 252, 29));
    jButton3.setBackground(Color.blue);
    jButton3.setBounds(new Rectangle(257, 167, 252, 29));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton3.setForeground(Color.white);
    jButton3.setText("    Affecter le statut de réalisation");
    jButton3.addActionListener(this);
    jButton4.setBackground(Color.blue);
    jButton4.setBounds(new Rectangle(258, 209, 252, 29));
    jButton4.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton4.setForeground(Color.white);
    jButton4.setText("    Affecter le statut d\'exploiatation ");
    jButton5.setText("     Mettre  a jour un  P.N.R");
    jButton5.setForeground(Color.white);
    jButton5.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton5.setBackground(Color.blue);
    jButton5.setBounds(new Rectangle(258, 253, 252, 29));
    jButton6.setText("Modifier mot de passe");
    jButton6.addActionListener(this);
    jButton2.addActionListener(this);
    jButton6.setBackground(Color.blue);
    jButton6.setForeground(Color.white);
    jButton6.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton6.setBounds(new Rectangle(256,298 , 252, 29));
    jButton7.setBackground(Color.blue);
    jButton7.setBounds(new Rectangle(258, 341, 252, 29));
    jButton7.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton7.setForeground(Color.white);
    jButton7.setText("    Affecter des Copromoteurs");
    jButton7.addActionListener(this);
    
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton4, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jButton5, null);
    this.getContentPane().add(jButton6, null);
    this.getContentPane().add(jButton7, null);
    this.setJMenuBar(jMenuBar1);
  }

public void actionPerformed(ActionEvent e) {
	 Object ob = e.getSource();
		if (ob.equals(jMenuFileExit)){
			
			System.exit(0);    ;}
	  else {
		  if (ob.equals(jMenuHelpAbout)){JOptionPane.showConfirmDialog(null,
					"Déscription de la page  ",
					"Juste un test",
					JOptionPane.PLAIN_MESSAGE);}
	      
	      else{
	    
			JButton boutonCliqué = (JButton) e.getSource();
			if (boutonCliqué == jButton1){
			FINSCRIPTION3 fi3 = new FINSCRIPTION3 (A,this);
			fi3.setVisible(true);
			dispose();
			}
			else{
				if(boutonCliqué == jButton6){
					FChngerMot fc= new FChngerMot(A,this.user,this);
					fc.setVisible(true);
					dispose();
				}
				else{
					if(boutonCliqué == jButton2){
						AF_ELIG af = new AF_ELIG(A,this);
						af.setVisible(true);
						dispose();
					}
					else{
						if(boutonCliqué == jButton3){
							
						}
						else
							if(boutonCliqué == jButton7){
								F_COPROMOTEURS  ad= new F_COPROMOTEURS(A,this);
								ad.setVisible(true);
								dispose();
							}
				
			
			} }}}

  }
		}

  }
