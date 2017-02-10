package presentation.Inscription;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import domaine.Commun.Registre1;
import domaine.Observeur.Observateur;

public class FINSCRIPTION4 extends JFrame implements ActionListener,Observateur{
	
	/**
	 * @uml.property  name="t"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private JFrame t;
	/**
	 * @uml.property  name="nom"
	 */
	private String nom ;
	/**
	 * @uml.property  name="prenom"
	 */
	private String prenom;
	/**
	 * @uml.property  name="dn"
	 */
	private String dn;
	/**
	 * @uml.property  name="registre1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Registre1 registre1 ;
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
	 * @uml.property  name="jPanel1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JPanel jPanel1 = new JPanel();
	  /**
	 * @uml.property  name="jLabel6"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel6 = new JLabel();
	  /**
	 * @uml.property  name="jTextField1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField jTextField1 = new JTextField();
	  /**
	 * @uml.property  name="jLabel7"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel7 = new JLabel();
	  /**
	 * @uml.property  name="jTextField2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField jTextField2 = new JTextField();
	  /**
	 * @uml.property  name="jLabel8"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel8 = new JLabel();
	  /**
	 * @uml.property  name="jTextField3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField jTextField3 = new JTextField();
	  /**
	 * @uml.property  name="jPanel2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JPanel jPanel2 = new JPanel();
	  /**
	 * @uml.property  name="jTextArea1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextArea jTextArea1 = new JTextArea();
	  /**
	 * @uml.property  name="jLabel9"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel9 = new JLabel();
	  /**
	 * @uml.property  name="jTextField4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField jTextField4 = new JTextField();
	  /**
	 * @uml.property  name="jLabel10"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel10 = new JLabel();
	  /**
	 * @uml.property  name="jLabel11"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel11 = new JLabel();
	  /**
	 * @uml.property  name="jTextField5"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField jTextField5 = new JTextField();
	  /**
	 * @uml.property  name="jLabel12"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel12 = new JLabel();
	  /**
	 * @uml.property  name="jTextField6"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField jTextField6 = new JTextField();
	  /**
	 * @uml.property  name="jLabel13"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel13 = new JLabel();
	  /**
	 * @uml.property  name="jTextField7"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField jTextField7 = new JTextField();
	  /**
	 * @uml.property  name="jPanel3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JPanel jPanel3 = new JPanel();
	  /**
	 * @uml.property  name="jLabel14"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel14 = new JLabel();
	  /**
	 * @uml.property  name="jComboBox1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JComboBox jComboBox1 = new JComboBox();
	  /**
	 * @uml.property  name="jRadioButton1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JRadioButton jRadioButton1 = new JRadioButton();
	  /**
	 * @uml.property  name="jLabel15"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel15 = new JLabel();
	  /**
	 * @uml.property  name="jRadioButton2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JRadioButton jRadioButton2 = new JRadioButton();
	  /**
	 * @uml.property  name="buttonGroup1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	ButtonGroup buttonGroup1 = new ButtonGroup();
	  /**
	 * @uml.property  name="jLabel16"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel16 = new JLabel();
	  /**
	 * @uml.property  name="jComboBox2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JComboBox jComboBox2 = new JComboBox();
	  /**
	 * @uml.property  name="jLabel17"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel17 = new JLabel();
	  /**
	 * @uml.property  name="jTextField8"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField jTextField8 = new JTextField();
	  /**
	 * @uml.property  name="jLabel18"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel18 = new JLabel();
	  /**
	 * @uml.property  name="jComboBox3"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JComboBox jComboBox3 = new JComboBox();
	  
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
  public FINSCRIPTION4(String nom,String prenom ,String dn, Registre1 registre1,JFrame t) throws HeadlessException {
    try {
    	this.t=t;	
    	this.nom = nom ;
    	this.prenom = prenom ;
    	this.dn = dn ;
    	this.registre1 =registre1 ;
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  private void jbInit() throws Exception {
	  this.nom = nom ;
  	this.prenom = prenom ;
  	this.dn = dn ;
  	setTitle("warning3");
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
   jLabel3.setText("                 Espace  Conseiller accompagnateur");
   jLabel3.setBounds(new Rectangle(92, 0, 514, 27));
   jLabel5.setBackground(Color.orange);
   jLabel5.setFont(new java.awt.Font("SansSerif", 3, 13));
   jLabel5.setOpaque(true);
   jLabel5.setRequestFocusEnabled(true);
   jLabel5.setIconTextGap(4);
   jLabel5.setText("                                                                 " +
   "     Suivie des Promoteurs ");
   jLabel5.setBounds(new Rectangle(-5, 42, 703, 22));
   jLabel4.setBackground(Color.white);
   jLabel4.setFont(new java.awt.Font("Dialog", 1, 13));
   jLabel4.setOpaque(true);
   jLabel4.setRequestFocusEnabled(true);
   jLabel4.setVerifyInputWhenFocusTarget(true);
   jLabel4.setText("                      Inscription d\'un nouveau Promoteur ( Etape " +
   "final)");
   jLabel4.setBounds(new Rectangle(0, 64, 700, 21));
   jPanel1.setBorder(BorderFactory.createTitledBorder("Identification du promoteur"));
   jPanel1.setFont(new java.awt.Font("Dialog", 1, 14));
   jPanel1.setBackground(SystemColor.inactiveCaptionText);
   jPanel1.setBounds(new Rectangle(0, 84, 701, 55));
   jPanel1.setLayout(null);
   jLabel6.setFont(new java.awt.Font("Dialog", 1, 11));
   jLabel6.setText("  Adresse :");
   jLabel6.setBounds(new Rectangle(12, 25, 63, 18));
   jTextField1.setBackground(SystemColor.activeCaptionText);
   jTextField1.setText(nom);
   jTextField1.setBounds(new Rectangle(62, 23, 132, 17));
   jTextField1.enable(false);
   jTextField2.enable(false);
   jTextField3.enable(false);
   jLabel7.setBounds(new Rectangle(209, 25, 66, 18));
   jLabel7.setText("  Prenom :");
   jLabel7.setFont(new java.awt.Font("Dialog", 1, 11));
   jTextField2.setText(prenom);
   jTextField2.setBounds(new Rectangle(282, 22, 132, 18));
   jLabel8.setFont(new java.awt.Font("Dialog", 1, 11));
   jLabel8.setText("Date de naissance :");
   jLabel8.setBounds(new Rectangle(429, 24, 114, 18));
   jTextField3.setBounds(new Rectangle(555, 22, 132, 19));
   jTextField3.setText(this.dn);
   jPanel2.setBorder(BorderFactory.createTitledBorder("Coordonée du promoteur"));
   jPanel2.setBackground(SystemColor.inactiveCaptionText);
   jPanel2.setBounds(new Rectangle(-1, 138, 702, 122));
   jPanel2.setLayout(null);
   jTextArea1.setToolTipText("");
   jTextArea1.setText("");
   jTextArea1.setBounds(new Rectangle(100, 23, 210, 43));
   jLabel9.setBounds(new Rectangle(341, 23, 84, 18));
   jLabel9.setText("  Commune :");
   jLabel9.setFont(new java.awt.Font("Dialog", 1, 11));
   jTextField4.setBounds(new Rectangle(454, 23, 152, 19));
   jTextField4.setText("");
   jLabel10.setFont(new java.awt.Font("Dialog", 1, 11));
   jLabel10.setText("  Nom :");
   jLabel10.setBounds(new Rectangle(5, 26, 54, 18));
   jLabel11.setBounds(new Rectangle(16, 91, 77, 18));
   jLabel11.setText("  Télephone :");
   jLabel11.setFont(new java.awt.Font("Dialog", 1, 11));
   jTextField5.setText("");
   jTextField5.setBounds(new Rectangle(107, 89, 141, 19));
   jLabel12.setFont(new java.awt.Font("Dialog", 1, 11));
   jLabel12.setText("   Fax :");
   jLabel12.setBounds(new Rectangle(279, 91, 62, 18));
   jTextField6.setText("");
   jTextField6.setBounds(new Rectangle(348, 87, 141, 19));
   jLabel13.setBounds(new Rectangle(500, 89, 57, 18));
   jLabel13.setText("  Email :");
   jLabel13.setFont(new java.awt.Font("Dialog", 1, 11));
   jTextField7.setBounds(new Rectangle(551, 86, 141, 19));
   jTextField7.setText("b");
   jPanel3.setBorder(BorderFactory.createTitledBorder("Profil du Promoteur"));
   jPanel3.setBackground(SystemColor.inactiveCaptionText);
   jPanel3.setBounds(new Rectangle(-3, 260, 703, 241));
   jPanel3.setLayout(null);
   jLabel14.setFont(new java.awt.Font("Dialog", 1, 11));
   jLabel14.setText("  Situation Familiale :");
   jLabel14.setBounds(new Rectangle(9, 30, 124, 19));
   jComboBox1.setBackground(SystemColor.inactiveCaptionText);
   jComboBox1.setBounds(new Rectangle(138, 31, 130, 18));
   jComboBox1.addItem("Célibataire");
    jComboBox1.addItem("Marié");
   jRadioButton1.setBackground(SystemColor.textInactiveText);
   jRadioButton1.setText("  Oui ");
   jRadioButton1.setBounds(new Rectangle(393, 32, 58, 15));
   jLabel15.setBounds(new Rectangle(291, 30, 95, 19));
   jLabel15.setText("   Handicapé :");
   jLabel15.setBackground(SystemColor.inactiveCaption);
   jLabel15.setFont(new java.awt.Font("Dialog", 1, 11));
   jLabel15.setOpaque(false);
   jRadioButton2.setBounds(new Rectangle(480, 32, 59, 15));
   jRadioButton2.setBackground(SystemColor.textInactiveText);
   jRadioButton2.setText("Non");
    jLabel16.setBounds(new Rectangle(25, 86, 114, 19));
   jLabel16.setText("   Niveau d\'etude :");
   jLabel16.setFont(new java.awt.Font("Dialog", 1, 11));
   jComboBox2.setBackground(SystemColor.inactiveCaptionText);
   jComboBox2.setBounds(new Rectangle(137, 82, 130, 18));
   jComboBox2.addItem("Moyen");
   jComboBox2.addItem("Secondaire");
   jComboBox2.addItem("Bac");
   jComboBox2.addItem("Bac+1");
   jComboBox2.addItem("Bac+2");
   jComboBox2.addItem("Bac+3");
   jComboBox2.addItem("Bac+4");
   jComboBox2.addItem("Bac+5(OU PLUS )");
   jLabel17.setFont(new java.awt.Font("Dialog", 1, 11));
   jLabel17.setText("      Spécialité :");
   jLabel17.setBounds(new Rectangle(34, 128, 98, 19));
   jTextField8.setBounds(new Rectangle(138, 126, 185, 19));
   jTextField8.setText("a");
   jLabel18.setBounds(new Rectangle(279, 80, 173, 19));
   jLabel18.setText("    Expérinece Professionnel :");
   jLabel18.setFont(new java.awt.Font("Dialog", 1, 11));
   jComboBox3.setBackground(SystemColor.inactiveCaptionText);
   jComboBox3.setBounds(new Rectangle(478, 81, 163, 18));
    jComboBox3.addItem("Sans Expérience ");
     jComboBox3.addItem("Expérience < 3 ans ");
      jComboBox3.addItem("Expérience 3 ans(OU PLUS)");
      
   
   jButton1.addActionListener(this);
   jButton2.addActionListener(this);
   jButton1.setText(" ok ");
   jButton2.setText("  Annuler");
   jButton1.setBackground(Color.green);
   jButton2.setBackground(Color.blue);
   jButton1.setBounds(new Rectangle(389, 154, 144, 22));
   jButton2.setBounds(new Rectangle(180, 154, 144, 22));
   jButton1.setFont(new java.awt.Font("Dialog", 1, 13));
   jButton2.setFont(new java.awt.Font("Dialog", 1, 13));
   jButton1.setForeground(Color.yellow);
   jButton2.setForeground(Color.white);
   buttonGroup1.add(jRadioButton1);
    buttonGroup1.add(jRadioButton2);
   this.getContentPane().add(jLabel1, null);
   this.getContentPane().add(jLabel2, null);
   this.getContentPane().add(jLabel3, null);
   this.getContentPane().add(jLabel5, null);
   this.getContentPane().add(jLabel4, null);
   this.getContentPane().add(jPanel1, null);
   jPanel1.add(jTextField1, null);
   jPanel1.add(jLabel7, null);
   jPanel1.add(jTextField2, null);
   jPanel1.add(jLabel8, null);
   jPanel1.add(jTextField3, null);
   jPanel1.add(jLabel10, null);
   this.getContentPane().add(jPanel2, null);
   jPanel2.add(jTextArea1, null);
   jPanel2.add(jLabel6, null);
   jPanel2.add(jLabel9, null);
   jPanel2.add(jTextField4, null);
   jPanel2.add(jLabel11, null);
   jPanel2.add(jTextField5, null);
   jPanel2.add(jLabel12, null);
   jPanel2.add(jTextField6, null);
   jPanel2.add(jLabel13, null);
   jPanel2.add(jTextField7, null);
   this.getContentPane().add(jPanel3, null);
   jPanel3.add(jLabel14, null);
   jPanel3.add(jComboBox1, null);
   jPanel3.add(jLabel15, null);
   jPanel3.add(jRadioButton1, null);
   jPanel3.add(jRadioButton2, null);
   jPanel3.add(jLabel16, null);
   jPanel3.add(jComboBox2, null);
   jPanel3.add(jLabel18, null);
   jPanel3.add(jComboBox3, null);
   
   jPanel3.add(jButton1, null);
   jPanel3.add(jButton2, null);
   jPanel3.add(jTextField8, null);
   jPanel3.add(jLabel17, null);
   this.setJMenuBar(jMenuBar1)	;
  }
	public void actionPerformed(ActionEvent arg0) {int ch ;
	 Object ob = arg0.getSource();
		if (ob.equals(jMenuFileExit)){
			
			System.exit(0);    ;}
	  else {
		  if (ob.equals(jMenuHelpAbout)){JOptionPane.showConfirmDialog(null,
					"Déscription de la page  ",
					"Juste un test",
					JOptionPane.PLAIN_MESSAGE);}
		  else {
			  JButton boutonCliqué = (JButton) arg0.getSource();
				if (boutonCliqué == jButton2){
	             dispose();
	             t.show();
	             }
	             else{
				if (boutonCliqué == jButton1){
					System.out .println("j'essaye de creer le vecteur");
					Vector liste = new Vector();
					System.out .println("le vecteur a ete creer");
					liste.addElement( this.getnom());
					liste.addElement (this.getprenom());
					liste.addElement (this.getdn());
					liste.addElement (this.getadresse());
					liste.addElement (this.getcommune());
					liste.addElement (this.gettelephone());
					liste.addElement( this.getfaxe());
					liste.addElement (this.getemail());
					liste.addElement( this.gets_familiale());
					liste.addElement( this.gethandicape());
					liste.addElement( this.getn_etude());
					liste.addElement( this.gete_professionel());
					liste.addElement( this.getspecialite());
					
					System.out.println(liste.elementAt(1)+"oui la");
					this.registre1.SaisirttInfo(liste,this);
					dispose();
					t.show();
					
				}
					
					}}}}
	

	
	public Object getnom() {
	
		return jTextField1.getText() ;
	}
	 Object getprenom() {
	
		return jTextField2.getText();
	}
	public Object getdn() {
		
		return jTextField3.getText();
	}
	public Object getadresse() {
	
		return jTextArea1.getText();
	}
	public Object getcommune() {
		
		return jTextField4.getText();
	}
	public Object gettelephone() {
		return jTextField5.getText();
	}
	public Object getfaxe() {
		return jTextField6.getText();
	}
	public Object getemail() {
		return jTextField7.getText();
		}
	public Object gets_familiale() {
		
		return jComboBox1.getSelectedItem();
	}
	public Object gethandicape() {
		return "Non";
	}
	public Object getn_etude() {
		
	return	jComboBox2.getSelectedItem();
	}
	public Object gete_professionel() {
		
		return jComboBox3.getSelectedItem();
	}
	public Object getspecialite() {
		
		return jTextField8.getText();
	}
	
	
	
	public void update() {
		dispose();
		JOptionPane.showConfirmDialog(null,
				"Inscription reussie  ",
				"Juste un test",
				JOptionPane.PLAIN_MESSAGE);

		}
	public void update1() {
		// TODO Auto-generated method stub
		
	}
	public void update2() {
		// TODO Auto-generated method stub
		
	}
	public void update4(int i, String j) {
		// TODO Auto-generated method stub
		
	}
	public void update(JFrame f) {
		// TODO Auto-generated method stub
		
	}

}

