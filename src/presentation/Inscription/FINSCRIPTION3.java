package presentation.Inscription;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import domaine.Commun.Registre1;
import domaine.Commun.ANSEJ;
import domaine.Observeur.Observateur;

public class FINSCRIPTION3 extends JFrame implements ActionListener,Observateur{
	/**
	 * @uml.property  name="g"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JFrame g;
	/**
	 * @uml.property  name="a"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ANSEJ A;
	/**
	 * @uml.property  name="registre1"
	 * @uml.associationEnd  
	 */
	private Registre1 registre1;
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
 * @uml.property  name="jLabel5"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel5 = new JLabel();
/**
 * @uml.property  name="jLabel4"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel4 = new JLabel();
/**
 * @uml.property  name="jLabel6"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel6 = new JLabel();
/**
 * @uml.property  name="jLabel7"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel7 = new JLabel();
/**
 * @uml.property  name="jLabel8"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel8 = new JLabel();
/**
 * @uml.property  name="jTextField1"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JTextField jTextField1 = new JTextField();
/**
 * @uml.property  name="jButton1"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JButton jButton1 =new JButton() ;
/**
 * @uml.property  name="jButton2"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JButton jButton2 = new JButton();

/**
 * @uml.property  name="jTextField2"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JTextField jTextField2 = new JTextField();
/**
 * @uml.property  name="jComboBox1"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox1 = new JComboBox();
/**
 * @uml.property  name="jLabel9"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel9 = new JLabel();
/**
 * @uml.property  name="jLabel10"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel10 = new JLabel();
/**
 * @uml.property  name="jComboBox2"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox2 = new JComboBox();
/**
 * @uml.property  name="jLabel11"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel11 = new JLabel();
/**
 * @uml.property  name="jComboBox3"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox3 = new JComboBox();
public FINSCRIPTION3(ANSEJ A,JFrame g) throws HeadlessException {
try {
	this.g=g; 
	this.A=A;
  jbInit();
}
catch(Exception e) {
  e.printStackTrace();
}
}
private void jbInit() throws Exception {
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

this.setSize(700,500);
this.setResizable(false);
this.setLocationRelativeTo(null);
jMenuFile.setText("Fichier");
jMenuFileExit.setText("Quitter");

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
jLabel3.setText("                 Espace  Conseiller accompagnateur");
jLabel3.setBounds(new Rectangle(92, 0, 514, 27));
jLabel5.setBackground(Color.orange);
jLabel5.setFont(new java.awt.Font("SansSerif", 3, 13));
jLabel5.setOpaque(true);
jLabel5.setRequestFocusEnabled(true);
jLabel5.setIconTextGap(4);
jLabel5.setText("                Suivie des Promoteurs ");
jLabel5.setBounds(new Rectangle(-5, 42, 703, 22));
jLabel6.setBackground(Color.white);
jLabel4.setBackground(Color.white);
jLabel4.setFont(new java.awt.Font("Dialog", 1, 13));
jLabel4.setOpaque(true);
jLabel4.setRequestFocusEnabled(true);
jLabel4.setVerifyInputWhenFocusTarget(true);
jLabel4.setText("                      Inscription d\'un nouveau Promoteur ( Etape " +
"1 )");
jLabel4.setBounds(new Rectangle(0, 64, 700, 21));
jLabel6.setFont(new java.awt.Font("Dialog", 1, 11));
jLabel6.setText("     Nom du Promoteur");
jLabel6.setBounds(new Rectangle(87, 127, 124, 26));
jLabel7.setBounds(new Rectangle(81, 178, 141, 23));
jLabel7.setText("              Prenom");
jLabel7.setFont(new java.awt.Font("Dialog", 1, 11));
jLabel7.setToolTipText("");
jLabel8.setBounds(new Rectangle(35, 229, 161, 26));
jLabel8.setText("       Date de Naissance : ");
jLabel8.setFont(new java.awt.Font("Dialog", 1, 11));
jTextField1.setText("");
jTextField1.setBounds(new Rectangle(273, 127, 160, 22));

jButton1.setBackground(Color.orange);
jButton1.setBounds(new Rectangle(389, 321, 97, 26));
jButton1.setFont(new java.awt.Font("Dialog", 1, 12));
jButton1.setText("  Suivant");
jButton2.setText(" Annuler");
jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
jButton2.setBounds(new Rectangle(190, 322, 91, 26));
jButton2.setBackground(Color.orange);
jButton2.addActionListener(this);
jButton1.addActionListener(this);
jTextField2.setBounds(new Rectangle(273, 178, 160, 22));
jTextField2.setText("");
jComboBox1.setBounds(new Rectangle(244, 234, 44, 21));
jLabel9.setText("Jour:");
jLabel9.setBounds(new Rectangle(191, 234, 41, 21));
jLabel10.setText("Mois:");
jLabel10.setBounds(new Rectangle(300, 234, 39, 18));
jComboBox2.setBounds(new Rectangle(343, 233, 45, 20));
jLabel11.setText("Année:");
jLabel11.setBounds(new Rectangle(403, 233, 44, 18));
jComboBox3.setBounds(new Rectangle(459, 234, 78, 19));
int i =1  ;
for (i=1 ;i <= 31; i++){
  jComboBox1.addItem(i);
}
for (i=1;i<=12;i++){ jComboBox2.addItem(i);
}
for (i=1960;i<=1999;i++){ jComboBox3.addItem(i);
}


this.getContentPane().add(jLabel1, null);
this.getContentPane().add(jLabel2, null);
this.getContentPane().add(jLabel3, null);
this.getContentPane().add(jLabel5, null);
this.getContentPane().add(jLabel4, null);
this.getContentPane().add(jButton2, null);
this.getContentPane().add(jButton1, null);
this.getContentPane().add(jTextField1, null);
this.getContentPane().add(jLabel8, null);
this.getContentPane().add(jLabel6, null);
this.getContentPane().add(jLabel7, null);
this.getContentPane().add(jComboBox2, null);
this.getContentPane().add(jLabel11, null);
this.getContentPane().add(jLabel10, null);
this.getContentPane().add(jComboBox3, null);
this.getContentPane().add(jComboBox1, null);
this.getContentPane().add(jLabel9, null);
this.getContentPane().add(jTextField2, null);
this.setJMenuBar(jMenuBar1);
this.setJMenuBar(jMenuBar1);}
public JTextField getnom(){return jTextField1 ;}
	public JTextField getprenom(){return jTextField2;}
	public String getdn(){
		String st1= new String () ;
		String st2 = new String () ;
		String st3 = new String ();
		String st4 = new String () ;
		st1 = st1.valueOf(jComboBox1.getSelectedItem());
		st2 = st2.valueOf(jComboBox2.getSelectedItem());
		st3 = st3.valueOf(jComboBox3.getSelectedItem());
		st4 = st1+"/"+st2+"/"+st3 ;
		System.out.print(st4);
		return st4 ;}
	
	public void actionPerformed(ActionEvent arg) {
		int ch ;
		this.registre1=A.getRegistre1();
		 Object ob = arg.getSource();
			if (ob.equals(jMenuFileExit)){
				
				System.exit(0);    ;}
		  else {
			  if (ob.equals(jMenuHelpAbout)){JOptionPane.showConfirmDialog(null,
						"Déscription de la page  ",
						"Juste un test",
						JOptionPane.PLAIN_MESSAGE);}
			  
			  
			    else {
				  JButton boutonCliqué = (JButton) arg.getSource();
					if (boutonCliqué == jButton1){
						String T1 = jTextField1.getText();
						String T2 = jTextField2.getText();
						String T3 = this.getdn();
						System.out.println(T1);
						registre1.CreerInscription();
						registre1.Saisir(T1,T2,T3,this);
							}
					else 
						if(boutonCliqué == jButton2){
							dispose();
							g.show();
						}
					}
			  }    
	}
	public void update(JFrame r) {
		// TODO Auto-generated method stub
		FINSCRIPTION4 G = new FINSCRIPTION4(this.getnom().getText(),this.getprenom().getText(),this.getdn(),this.registre1,r);
		G.setVisible(true);
	}
	public void update1() {
		// TODO Auto-generated method stub
		
	}
	public void update2() {
		// TODO Auto-generated method stub
		
	}
	
	public void update4(int i, String s) {
		// TODO Auto-generated method stub
		
	}
	public void update() {
		// TODO Auto-generated method stub
		
	}

}

