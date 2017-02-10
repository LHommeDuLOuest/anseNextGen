package presentation.Eligibilite;

import javax.swing.*;

import domaine.Commun.ANSEJ;
import domaine.Commun.Registre2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import domaine.Observeur.Observateur;
public class AF_ELIG extends JFrame implements ActionListener,Observateur{
	/**
	 * @uml.property  name="ef"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JFrame ef;
	/**
	 * @uml.property  name="a"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ANSEJ A;
	/**
	 * @uml.property  name="registre2"
	 * @uml.associationEnd  
	 */
	private Registre2 registre2;
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
 * @uml.property  name="jPanel2"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JPanel jPanel2 = new JPanel();
  /**
 * @uml.property  name="jLabel10"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel10 = new JLabel();
  /**
 * @uml.property  name="buttonGroup1"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
ButtonGroup buttonGroup1 = new ButtonGroup();
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
 * @uml.property  name="jLabel15"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel15 = new JLabel();
  /**
 * @uml.property  name="jComboBox2"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox2 = new JComboBox();
  /**
 * @uml.property  name="jLabel16"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel16 = new JLabel();
  /**
 * @uml.property  name="jComboBox3"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox3 = new JComboBox();
  /**
 * @uml.property  name="jLabel6"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel6 = new JLabel();
  /**
 * @uml.property  name="jTextField3"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JTextField jTextField3 = new JTextField();
  /**
 * @uml.property  name="jLabel9"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel9 = new JLabel();
  /**
 * @uml.property  name="jLabel17"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel17 = new JLabel();
  /**
 * @uml.property  name="jComboBox4"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox4 = new JComboBox();
  /**
 * @uml.property  name="jLabel18"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel18 = new JLabel();
  /**
 * @uml.property  name="jComboBox5"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox5 = new JComboBox();
  /**
 * @uml.property  name="jLabel19"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel19 = new JLabel();
  /**
 * @uml.property  name="jComboBox6"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox6 = new JComboBox();
  /**
 * @uml.property  name="jLabel11"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel11 = new JLabel();
  /**
 * @uml.property  name="jCheckBox1"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JCheckBox jCheckBox1 = new JCheckBox();
  /**
 * @uml.property  name="jCheckBox2"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JCheckBox jCheckBox2 = new JCheckBox();
  /**
 * @uml.property  name="jLabel12"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel12 = new JLabel();
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
 * @uml.property  name="jTextArea1"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JTextArea jTextArea1 = new JTextArea();
  /**
 * @uml.property  name="jComboBox7"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="java.lang.String"
 */
JComboBox jComboBox7 = new JComboBox();
  /**
 * @uml.property  name="jLabel13"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel13 = new JLabel();
  /**
 * @uml.property  name="jLabel110"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel110 = new JLabel();
  /**
 * @uml.property  name="jLabel111"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel111 = new JLabel();

  public AF_ELIG(ANSEJ A,JFrame ef) throws HeadlessException {
	  this.A=A;
	  this.ef=ef;
    try {
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
	    
    jLabel17.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel17.setText("Jour :");
    jLabel17.setBounds(new Rectangle(156, 74, 38, 20));
    jLabel9.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel9.setText("  Date séssion C.L.E.F :");
    jLabel9.setBounds(new Rectangle(19, 73, 132, 21));
    jTextField3.setText("");
    jTextField3.setBounds(new Rectangle(195, 29, 132, 18));
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel6.setText("Numero de la C.L.E.F :");
    jLabel6.setBounds(new Rectangle(45, 32, 132, 21));
    jComboBox3.setBounds(new Rectangle(454, 107, 66, 17));
    jLabel16.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel16.setRequestFocusEnabled(true);
    jLabel16.setText("Année :");
    jLabel16.setBounds(new Rectangle(387, 106, 49, 21));
    jComboBox2.setBounds(new Rectangle(315, 107, 50, 18));
    jLabel15.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel15.setText("Mois :");
    jLabel15.setBounds(new Rectangle(259, 106, 43, 23));
    jComboBox1.setBounds(new Rectangle(194, 107, 50, 17));
    jLabel14.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel14.setText("Jour :");
    jLabel14.setBounds(new Rectangle(154, 104, 38, 27));
    this.setSize(700,500);
   this.getContentPane().setBackground(UIManager.getColor("inactiveCaptionText"));
    this.setResizable(false);
   this.setLocationRelativeTo(null);

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
    jLabel5.setBounds(new Rectangle(-5, 42, 705, 22));
    jLabel4.setBackground(Color.white);
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel4.setOpaque(true);
    jLabel4.setRequestFocusEnabled(true);
    jLabel4.setVerifyInputWhenFocusTarget(true);
    jLabel4.setText("                      Affecter décision d\'éligibilité");
    jLabel4.setBounds(new Rectangle(0, 64, 700, 21));
    jPanel1.setBorder(BorderFactory.createTitledBorder("Identification du promoteur"));
    jPanel1.setFont(new java.awt.Font("Dialog", 1, 14));
    jPanel1.setBackground(SystemColor.window);
    jPanel1.setBounds(new Rectangle(0, 84, 701, 156));
    jPanel1.setLayout(null);
    jTextField1.setBackground(SystemColor.WHITE);
    jTextField1.setText("");
    jTextField1.setBounds(new Rectangle(194, 21, 132, 19));
    jLabel7.setBounds(new Rectangle(76, 60, 66, 18));
    jLabel7.setText("  Prenom :");
    jLabel7.setFont(new java.awt.Font("Dialog", 1, 12));
    jTextField2.setText("");
    jTextField2.setBounds(new Rectangle(194, 59, 132, 19));
    jLabel8.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel8.setText("Date de naissance :");
    jLabel8.setBounds(new Rectangle(25, 109, 114, 18));
    jPanel2.setBorder(BorderFactory.createTitledBorder("Décision et Motif"));
    jPanel2.setBackground(SystemColor.control);
    jPanel2.setBounds(new Rectangle(0, 238, 702, 265));
    jPanel2.setLayout(null);
    jLabel10.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel10.setText("  Nom :");
    jLabel10.setBounds(new Rectangle(96, 23, 54, 18));
    jComboBox4.setBounds(new Rectangle(194, 74, 50, 18));
    jLabel18.setBounds(new Rectangle(261, 74, 43, 21));
    jLabel18.setText("Mois :");
    jLabel18.setFont(new java.awt.Font("Dialog", 1, 10));
    jComboBox5.setBounds(new Rectangle(318, 73, 50, 17));
    jLabel19.setBounds(new Rectangle(390, 73, 49, 21));
    jLabel19.setText("Année :");
    jLabel19.setRequestFocusEnabled(true);
    jLabel19.setFont(new java.awt.Font("Dialog", 1, 10));
    jComboBox6.setBounds(new Rectangle(454, 75, 66, 17));
    jLabel11.setBounds(new Rectangle(47, 111, 132, 21));
    jLabel11.setText("   Motif de la décsion :");
    jLabel11.setFont(new java.awt.Font("Dialog", 1, 12));
    jCheckBox1.setBackground(SystemColor.inactiveCaptionText);
    jCheckBox1.setFont(new java.awt.Font("Serif", 1, 12));
    jCheckBox1.setText(" Profil inadapté");
    jCheckBox1.setBounds(new Rectangle(188, 112, 117, 19));
    jCheckBox2.setBounds(new Rectangle(188, 138, 125, 19));
    jCheckBox2.setText("Activité Surchargé");
    jCheckBox2.setBackground(SystemColor.inactiveCaptionText);
    jCheckBox2.setFont(new java.awt.Font("Serif", 1, 12));
    jLabel12.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel12.setText("    Autre Motif :");
    jLabel12.setBounds(new Rectangle(323, 110, 89, 21));
    jButton1.setBackground(Color.orange);
    jButton1.setBounds(new Rectangle(156, 179, 135, 24));
    jButton1.addActionListener(this);
    jButton2.addActionListener(this);
    jButton1.setFont(new java.awt.Font("SansSerif", 1, 12));
    jButton1.setText(" Annuler");
    jButton2.setText("  Affecter ");
    jButton2.setBackground(Color.orange);
    jButton2.setBounds(new Rectangle(387, 180, 136, 24));
    jButton2.setFont(new java.awt.Font("SansSerif", 1, 12));
    jTextArea1.setText("");
    jTextArea1.setBounds(new Rectangle(418, 115, 267, 46));
    jComboBox7.setBounds(new Rectangle(461, 27, 128, 19));
    jLabel13.setBounds(new Rectangle(372, 27, 75, 21));
    jLabel13.setText("  Décision :");
    jLabel13.setFont(new java.awt.Font("Dialog", 1, 12));
    int i =1  ;
    for (i=1 ;i <= 31; i++){
      jComboBox1.addItem(i);
    }
    for (i=1;i<=12;i++){ jComboBox2.addItem(i);
    }
    for (i=1960;i<=1999;i++){ jComboBox3.addItem(i);
   }
    for (i=1 ;i <= 31; i++){
        jComboBox4.addItem(i);
      }
      for (i=1;i<=12;i++){ jComboBox5.addItem(i);
      }
      for (i=1997;i<=2009;i++){ jComboBox6.addItem(i);
     }
      jComboBox7.addItem ("ELIGIBLE");
      jComboBox7.addItem ("NON ELIGIBLE");
      // les petit commentaire cas défavorable
      jLabel110.setBounds(new Rectangle(320, 127, 98, 21));
      jLabel110.setText("    (Cas décision");
      jLabel110.setFont(new java.awt.Font("Dialog", 1, 10));
      jLabel111.setFont(new java.awt.Font("Dialog", 1, 10));
      jLabel111.setText("    défavorable )");
     
      jLabel111.setBounds(new Rectangle(324, 139, 98, 21));
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel5, null);
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(jPanel1, null);
    this.setJMenuBar(jMenuBar1);
    jPanel1.add(jLabel8, null);
    jPanel1.add(jLabel14, null);
    jPanel1.add(jComboBox1, null);
    jPanel1.add(jLabel15, null);
    jPanel1.add(jLabel16, null);
    jPanel1.add(jComboBox2, null);
    jPanel1.add(jComboBox3, null);
    jPanel1.add(jTextField1, null);
    jPanel1.add(jTextField2, null);
    jPanel1.add(jLabel10, null);
    jPanel1.add(jLabel7, null);
    this.getContentPane().add(jPanel2, null);
    jPanel2.add(jLabel19, null);
    jPanel2.add(jComboBox5, null);
    jPanel2.add(jComboBox4, null);
    jPanel2.add(jLabel18, null);
    jPanel2.add(jLabel6, null);
    jPanel2.add(jTextField3, null);
    jPanel2.add(jCheckBox1, null);
    jPanel2.add(jCheckBox2, null);
    jPanel2.add(jLabel11, null);
    jPanel2.add(jLabel12, null);
    jPanel2.add(jButton2, null);
    jPanel2.add(jButton1, null);
    jPanel2.add(jLabel17, null);
    jPanel2.add(jLabel9, null);
    jPanel2.add(jTextArea1, null);
    jPanel2.add(jComboBox6, null);
    jPanel2.add(jComboBox7, null);
    jPanel2.add(jLabel13, null);
    jPanel2.add(jLabel110, null);
    jPanel2.add(jLabel111, null);
  }
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
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
		if(boutonCliqué == jButton1){
			dispose();
			ef.show();
		}
		else
		if (boutonCliqué == jButton2){
			String st1= new String () ;String st4= new String () ;
			String st2 = new String () ;String st5= new String () ;
			String st3 = new String ();String st6= new String () ;
			String date1 = new String () ;String date2= new String () ;
		    st1 = st1.valueOf(jComboBox1.getSelectedItem());
			st2 = st2.valueOf(jComboBox2.getSelectedItem());
			st3 = st3.valueOf(jComboBox3.getSelectedItem());
			date1 = st1+"/"+st2+"/"+st3 ;
			st4 = st4.valueOf(jComboBox4.getSelectedItem());
			st5 = st5.valueOf(jComboBox5.getSelectedItem());
			st6 = st6.valueOf(jComboBox6.getSelectedItem());
				date2 = st1+"/"+st2+"/"+st3 ;
			// verification des dates 
				
			
				
		if ((st1.equals("31"))&&(st2.equals("2"))||(st2.equals("4"))||(st2.equals("6"))||(st2.equals("8"))||(st2.equals("10"))||(st2.equals("12")))
		{JOptionPane.showConfirmDialog(null,
						"Entrer une date valide",
						"Juste un test",JOptionPane.PLAIN_MESSAGE);}
		else if ((st2.equals("2"))&&((st1.equals("30")))){
			JOptionPane.showConfirmDialog(null,
					"Entrer une date valide",
					"Juste un test",JOptionPane.PLAIN_MESSAGE);
		}

		
		    else 
		if ((st4.equals("31"))&&(st5.equals("2"))||(st5.equals("4"))||(st6.equals("6"))||(st5.equals("8"))||(st5.equals("10"))||(st5.equals("12")))
		{JOptionPane.showConfirmDialog(null,
						"Entrer une date valide",
						"Juste un test",JOptionPane.PLAIN_MESSAGE);}
		else if ((st5.equals("2"))&&((st1.equals("30")))){
			JOptionPane.showConfirmDialog(null,
					"Entrer une date valide",
					"Juste un test",JOptionPane.PLAIN_MESSAGE);}
			else
			 
			{// insére ton traitement ici lyes 
				System.out.println ("a toi lyes");
				String T1 = jTextField1.getText();
				String T2 = jTextField2.getText();
				String T3 = date1;
				String NumSession =jTextField3.getText();
				String DateSession =date2;
				String decision = (String) jComboBox7.getSelectedItem();
				String motif =jTextArea1.getText();
				System.out.println("je suis dans la fenetre eligibilite1");
				System.out.println(T1);
				this.registre2 =A.getRegistre2();
				this.registre2.creerEligibilite();
				registre2.affecterEligibilite(T1,T2,T3,NumSession,DateSession,decision,motif,this);
			}
		   
}}

}}
public void update() {
	// TODO Auto-generated method stub
	
}
public void update1() {
	// TODO Auto-generated method stub
	
}
public void update2() {
	// TODO Auto-generated method stub
	
}
public void update4(int i, String object) {
	// TODO Auto-generated method stub
	
}
public void update(JFrame f) {
	// TODO Auto-generated method stub
	
}}


/**
 * <p>Titre : </p>
 * <p>Description : </p>
 * <p>Copyright : Copyright (c) 2009</p>
 * <p>Société : </p>
 * @author non attribuable
 * @version 1.0
 */



