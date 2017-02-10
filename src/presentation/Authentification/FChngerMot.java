/*package presentation.Authentification;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import domaine.Commun.ANSEJ;
import domaine.Commun.Registre4;

public class FChngerMot extends JFrame implements ActionListener{
	private String s;
	private ANSEJ A;
	private Registre4 registre4;
	/*private JButton bouton1;
	private JTextField cptUser;
	private JTextField ancienPwd;
	private JTextField newPwd;
	private JTextField confirmation;
	
	
	public  FChngerMot(ANSEJ A,String s){
		super () ;
		this.s=s;
		this.A=A;
	    build ();
	}
	
	private void build (){
		setTitle ("Changer le mot de passe ");
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
    cptUser = new JTextField(30);
    ancienPwd = new JTextField(30);
    newPwd = new JTextField(30);
    confirmation = new JTextField(30);
    bouton1 = new JButton("ok");
    bouton1.addActionListener(this);
    p.add(cptUser);
    p.add(ancienPwd);
    p.add(newPwd);
    p.add(confirmation);
    p.add(bouton1);
	return p ;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob = arg0.getSource();
		if(ob==bouton1){
		this.registre4=A.getRegistre4();
		System.out.println("§§§§§§§§§§§§"+s+"je suis ds la fentre changer mot de pass");
		this.registre4.creerUtilisateur(this.s);
		Vector<String> v = new Vector<String>();
		v.addElement(this.getCptUser());
		v.addElement(this.getAncienPwd());
		v.addElement(this.getNewPwd());
		v.addElement(this.getConfirmation());
		this.registre4.changePwd(v);	
		}	
	}
	
	public String getCptUser(){
		return this.cptUser.getText();
	}
	public String getAncienPwd(){
		return this.ancienPwd.getText();
	}
	public String getNewPwd(){
		return this.newPwd.getText();
	}
	public String getConfirmation(){
		return this.confirmation.getText();
	}

}*/

package presentation.Authentification;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import lesAutreCas.Admin;
import lesAutreCas.Execute2;
import lesAutreCas.FT_DI3;
import lesAutreCas.F_cher_users;
import presentation.Start.FT_DI3_0;
import domaine.Observeur.Observateur;
import domaine.Commun.ANSEJ;
import domaine.Commun.Registre4;

public class FChngerMot extends JFrame implements ActionListener,Observateur{
	/**
	 * @uml.property  name="s"
	 */
	private String s;
	/**
	 * @uml.property  name="a"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ANSEJ A;
	/**
	 * @uml.property  name="registre4"
	 * @uml.associationEnd  
	 */
	private Registre4 registre4;
	/**
	 * @uml.property  name="g"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JFrame g;
	/*private JButton bouton1;
	private JTextField cptUser;
	private JTextField ancienPwd;
	private JTextField newPwd;
	private JTextField confirmation;
	
	
	public  FChngerMot(ANSEJ A,String s){
		super () ;
		this.s=s;
		this.A=A;
	    build ();
	}
	
	private void build (){
		setTitle ("Changer le mot de passe ");
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
    cptUser = new JTextField(30);
    ancienPwd = new JTextField(30);
    newPwd = new JTextField(30);
    confirmation = new JTextField(30);
    bouton1 = new JButton("ok");
    bouton1.addActionListener(this);
    p.add(cptUser);
    p.add(ancienPwd);
    p.add(newPwd);
    p.add(confirmation);
    p.add(bouton1);
	return p ;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob = arg0.getSource();
		if(ob==bouton1){
		this.registre4=A.getRegistre4();
		System.out.println("§§§§§§§§§§§§"+s+"je suis ds la fentre changer mot de pass");
		this.registre4.creerUtilisateur(this.s);
		Vector<String> v = new Vector<String>();
		v.addElement(this.getCptUser());
		v.addElement(this.getAncienPwd());
		v.addElement(this.getNewPwd());
		v.addElement(this.getConfirmation());
		this.registre4.changePwd(v);	
		}	
	}
	
	public String getCptUser(){
		return this.cptUser.getText();
	}
	public String getAncienPwd(){
		return this.ancienPwd.getText();
	}
	public String getNewPwd(){
		return this.newPwd.getText();
	}
	public String getConfirmation(){
		return this.confirmation.getText();
	}

}*/
	
	
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
	 * @uml.property  name="jLabel9"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel9 = new JLabel();
	  /**
	 * @uml.property  name="jLabel11"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JLabel jLabel11 = new JLabel();
	  /**
	 * @uml.property  name="jTextField1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JTextField jTextField1 = new JTextField();
	  /**
	 * @uml.property  name="jPasswordField1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JPasswordField jPasswordField1 = new JPasswordField();
	  /**
	 * @uml.property  name="jPasswordField2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JPasswordField jPasswordField2 = new JPasswordField();
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
	 * @uml.property  name="jButton4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JButton jButton4 = new JButton();
	  /**
	 * @uml.property  name="jComboBox1"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="java.lang.String"
	 */
	JComboBox jComboBox1 = new JComboBox();
	  public FChngerMot(ANSEJ A,String s,JFrame g) throws HeadlessException {
		  this.A=A;
		  this.s =s;
		  this.g=g;
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
	   jButton1.addActionListener(this);
	   jButton2.addActionListener(this);
	   jButton3.addActionListener(this);
	   jButton4.addActionListener(this);
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
	    jLabel3.setText("      Modifier mot de passe C.A ");
	    jLabel3.setBounds(new Rectangle(92, 0, 514, 27));
	    jLabel5.setBackground(Color.orange);
	    jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12));
	    jLabel5.setOpaque(true);
	    jLabel5.setRequestFocusEnabled(true);
	    jLabel5.setText("                                                                 " +
	    "                   GERER LES UTILISATEURS ");
	    jLabel5.setBounds(new Rectangle(-5, 42, 703, 22));
	    jLabel6.setBackground(Color.white);
	    jLabel4.setBackground(Color.white);
	    jLabel4.setFont(new java.awt.Font("Dialog", 1, 13));
	    jLabel4.setOpaque(true);
	    jLabel4.setText("                    Modifier le Mot de passe d\'un utilisateur");
	    jLabel4.setBounds(new Rectangle(0, 64, 700, 21));
	    jLabel6.setFont(new java.awt.Font("Dialog", 1, 11));
	    jLabel6.setText("         Nom d\'utlisateur");
	    jLabel6.setBounds(new Rectangle(87, 110, 124, 26));
	    jLabel7.setBounds(new Rectangle(87, 150, 141, 26));
	    jLabel7.setText("      Ancien Mot de passe");
	    jLabel7.setFont(new java.awt.Font("Dialog", 1, 11));
	    jLabel7.setToolTipText("");
	    jLabel8.setBounds(new Rectangle(76, 190, 170, 26));
	    jLabel8.setText("      Nouveau  Mot de passe");
	    jLabel8.setFont(new java.awt.Font("Dialog", 1, 11));
	    jLabel9.setFont(new java.awt.Font("Dialog", 1, 11));
	    jLabel9.setText("      Type d\'utilisateur :");
	    jLabel9.setBounds(new Rectangle(86, 237, 155, 26));
	    jTextField1.setText("");
	    jTextField1.setBounds(new Rectangle(273, 110, 160, 22));
	    jPasswordField1.setText("");
	    jPasswordField1.setBounds(new Rectangle(272, 150, 161, 23));
	    jPasswordField2.setBounds(new Rectangle(272, 192, 162, 23));
	    jPasswordField2.setText("");
	    jButton1.setBackground(Color.orange);
	    jButton1.setBounds(new Rectangle(389, 321, 97, 26));
	    jButton1.setFont(new java.awt.Font("Dialog", 1, 12));
	    jButton1.setText("  Modifier");
	    jButton2.setText(" Annuler");
	    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
	    jButton2.setBounds(new Rectangle(190, 322, 91, 26));
	    jButton2.setBackground(Color.orange);
	    jComboBox1.setBounds(new Rectangle(272, 239, 163, 21));
	    jComboBox1.addItem("Conseiller Accompagnateur");
	    /*jComboBox1.addItem("Administrateur");*/
	   /* jComboBox1.addItem("Directeur");*/
	    /*jButton3.setText("   Liste des utilisateurs");
	    jButton3.setFont(new java.awt.Font("Dialog", 1, 11));
	    jButton3.setBounds(new Rectangle(405, 394, 163, 26));
	    jButton3.setBackground(Color.orange);*/
	    jButton4.setBackground(Color.orange);
	    jButton4.setBounds(new Rectangle(127, 395, 201, 26));
	   
	    jButton4.setFont(new java.awt.Font("Dialog", 1, 11));
	    jButton4.setText(" Retour a Géstion  utilisateurs");
	   
	    jLabel11.setBackground(Color.white);
	    jLabel11.setOpaque(true);
	    jLabel11.setBounds(new Rectangle(2, 366, 698, 3));
	    this.getContentPane().add(jLabel1, null);
	    this.getContentPane().add(jLabel2, null);
	    this.getContentPane().add(jLabel3, null);
	    this.getContentPane().add(jLabel5, null);
	    this.getContentPane().add(jLabel4, null);
	    this.getContentPane().add(jButton2, null);
	    this.getContentPane().add(jButton1, null);
	    this.getContentPane().add(jPasswordField2, null);
	    this.getContentPane().add(jPasswordField1, null);
	    this.getContentPane().add(jTextField1, null);
	    this.getContentPane().add(jComboBox1, null);
	    this.getContentPane().add(jLabel6, null);
	    this.getContentPane().add(jLabel7, null);
	    this.getContentPane().add(jLabel8, null);
	    this.getContentPane().add(jLabel9, null);
	    /*this.getContentPane().add(jButton4, null);*/
	    /*this.getContentPane().add(jButton3, null);*/
	    this.getContentPane().add(jLabel11, null);
	    this.setJMenuBar(jMenuBar1);
	  }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int v2 ;int ch ;
		String st1 = this.jTextField1.getText(); 
		String st2 = this.jPasswordField1.getText();
		String st4 = this.jPasswordField2.getText();
		String st3 = (String) this.jComboBox1.getSelectedItem();
		if (st3.equals("Conseiller Accompagnateur")){
			st3 = "CA";}
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
                  //traitement des clique sur les boutons					
		 if (boutonCliqué == jButton4){
			 this.setVisible(false);
				ch= Admin.getS();
				if (ch==1){FT_DI3_0 f0 = new FT_DI3_0();
				f0.setVisible(true);}
				else {FT_DI3 f0 = new FT_DI3();
				f0.setVisible(true);
	  		}}
		 else { if (boutonCliqué == jButton3){
			 F_cher_users  z = new F_cher_users ("select * from users");
			}
		 else {
			 if (boutonCliqué==jButton2){
				 dispose();
				 g.show();
			 }
			
	  	else{
		   if (boutonCliqué == jButton1){
			   if (st1.isEmpty()){
				   JOptionPane.showConfirmDialog(null,
						"Indiquer l'utilisateur  auquel modifier mot de passe ",
						"Juste un test",
						JOptionPane.PLAIN_MESSAGE);
			   }
			   else {
				   if ((st2.isEmpty())){
				   JOptionPane.showConfirmDialog(null,
							"L'ancien Mot de passe est obligatoire",
							"Juste un test",
							JOptionPane.PLAIN_MESSAGE);}
				   else {
					   if ((st4.isEmpty())){
					   JOptionPane.showConfirmDialog(null,
								"Indiquer un nouveau Mot de passe",
								"Juste un test",
								JOptionPane.PLAIN_MESSAGE);}
					   
					   else {
						   
						   System.out.println("555555555555555555555555555555555");
						   this.registre4=A.getRegistre4();
					   System.out.println("§§§§§§§§§§§§"+s+"je suis ds la fentre changer mot de pass");
					   this.registre4.creerUtilisateur(this.s);
					   Vector<String> v1 = new Vector<String>();
					   v1.addElement(st1);
					   v1.addElement(st2);
					   v1.addElement(st4);
					   v1.addElement(st4);
					   this.registre4.changePwd(v1,this);} 
					   dispose();
				       g.show();
				   
			   }}}

         }
		 }}}}
			}
	
	
	public void update2(){
		System.out.println("77777777777 je suis ds update2() de fchanger mot de passe //////////////");
		JOptionPane.showConfirmDialog(null,
				"cet utilisateur n'existe pas",
				"Juste un test",
				JOptionPane.PLAIN_MESSAGE);
	}
	public void update(){
		JOptionPane.showConfirmDialog(null,
				"erreur dans les champs de saisie",
				"Juste un test",
				JOptionPane.PLAIN_MESSAGE);}
	public void update1() {
		// TODO Auto-generated method stub
		
	}
	public void update4(int i, String s) {
		// TODO Auto-generated method stub
		
	}
	public void update(JFrame f) {
		// TODO Auto-generated method stub
		
	}
	
	


   }




