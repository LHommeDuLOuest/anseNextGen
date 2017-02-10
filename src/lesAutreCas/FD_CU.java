package lesAutreCas;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import presentation.Start.FT_DI3_0;



public class FD_CU extends JFrame implements ActionListener {
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
	 * @uml.property  name="jComboBox1"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="java.lang.String"
	 */
	JComboBox jComboBox1 = new JComboBox();
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
	JButton jButton3= new JButton() ;
	  /**
	 * @uml.property  name="jButton4"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	JButton jButton4 = new JButton();
	  public FD_CU() throws HeadlessException {
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
	    jLabel3.setText("                              Espace  Administrateur ");
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
	    jLabel4.setText("                  Creation d\'un nouveau utilisateur :");
	    jLabel4.setBounds(new Rectangle(0, 64, 700, 21));
	    jLabel6.setFont(new java.awt.Font("Dialog", 1, 11));
	    jLabel6.setText("     Nom d\'utlisateur");
	    jLabel6.setBounds(new Rectangle(121, 112, 124, 26));
	    jLabel7.setBounds(new Rectangle(124, 152, 112, 26));
	    jLabel7.setText("      Mot de passe");
	    jLabel7.setFont(new java.awt.Font("Dialog", 1, 11));
	    jLabel8.setBounds(new Rectangle(75, 192, 170, 26));
	    jLabel8.setText("      Confirmation Mot de passe");
	    jLabel8.setFont(new java.awt.Font("Dialog", 1, 11));
	    jLabel9.setFont(new java.awt.Font("Dialog", 1, 11));
	    jLabel9.setText("      Type d\'utilisateur :");
	    jLabel9.setBounds(new Rectangle(101, 231, 155, 26));
	    jTextField1.setText("");
	    jTextField1.setBounds(new Rectangle(273, 110, 160, 22));
	    jPasswordField1.setText("");
	    jPasswordField1.setBounds(new Rectangle(272, 150, 161, 23));
	    jPasswordField2.setBounds(new Rectangle(272, 192, 162, 23));
	    jPasswordField2.setText("");
	    jComboBox1.setAutoscrolls(false);
	    jComboBox1.setPreferredSize(new Dimension(26, 21));
	    jComboBox1.setRequestFocusEnabled(true);
	    jComboBox1.setToolTipText("");
	    jComboBox1.setInputVerifier(null);
	    jComboBox1.setVerifyInputWhenFocusTarget(true);
	    jComboBox1.setActionCommand("comboBoxChanged");
	    jComboBox1.setLightWeightPopupEnabled(true);
	    jComboBox1.setMaximumRowCount(8);
	    jComboBox1.setPopupVisible(false);
	    jComboBox1.setSelectedItem(null);
	    jComboBox1.setBounds(new Rectangle(272, 234, 164, 20));
	    jComboBox1.addItem("Conseiller Accompagnateur");
	    jComboBox1.addItem("Administrateur");
	    jComboBox1.addItem("Directeur");
	    jButton1.setBackground(Color.orange);
	    jButton1.setBounds(new Rectangle(389, 321, 93, 26));
	    jButton1.setFont(new java.awt.Font("Dialog", 1, 12));
	    jButton1.setText(" Créer");
	    jButton2.setText(" Annuler");
	    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
	    jButton2.setBounds(new Rectangle(190, 322, 93, 26));
	    jButton2.setBackground(Color.orange);
	    
	    jButton3.setText("   Liste des utilisateurs");
	    jButton3.setFont(new java.awt.Font("Dialog", 1, 11));
	    jButton3.setBounds(new Rectangle(405, 394, 163, 26));
	    jButton3.setBackground(Color.orange);
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
	    this.getContentPane().add(jLabel9, null);
	    this.getContentPane().add(jPasswordField2, null);
	    this.getContentPane().add(jLabel8, null);
	    this.getContentPane().add(jPasswordField1, null);
	    this.getContentPane().add(jTextField1, null);
	    this.getContentPane().add(jLabel6, null);
	    this.getContentPane().add(jLabel7, null);
	    this.getContentPane().add(jComboBox1, null);
	    this.getContentPane().add(jButton4, null);
	    this.getContentPane().add(jButton3, null);
	    this.getContentPane().add(jLabel11, null);
	    this.setJMenuBar(jMenuBar1);
	  }

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		int ch ;
		String st1 = this.jTextField1.getText(); 
		String st2 = this.jPasswordField1.getText();
		String st3 = this.jPasswordField2.getText();
		String st4 = (String) this.jComboBox1.getSelectedItem();
		if (st4.equals("Conseiller Accompagnateur")){
			st4 = "CA";
		}
		int v ;
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
		if (boutonCliqué == jButton4){
			this.setVisible(false);
			ch= Admin.getS();
			if (ch==1){FT_DI3_0 f0 = new FT_DI3_0();
			f0.setVisible(true);}
			else {FT_DI3 f0 = new FT_DI3();
			f0.setVisible(true);}
		}
		else { if (boutonCliqué == jButton3){
			F_cher_users  z = new F_cher_users ("select * from users");
		}
		else {if (boutonCliqué == jButton1){
			   if (st1.isEmpty()){JOptionPane.showConfirmDialog(null,
						"Saisser un nouveau nom d'utilisateur ",
						"Juste un test",
						JOptionPane.PLAIN_MESSAGE);
			   }
			   else {
				   if ((st2.isEmpty()||st3.isEmpty())){
				   JOptionPane.showConfirmDialog(null,
							"Le mot de passe et sa confirmation sont obligatoire",
							"Juste un test",
							JOptionPane.PLAIN_MESSAGE);
				   jPasswordField1.setText("");
				   jPasswordField2.setText("");
				   }
				   else {
					   if (!st2.equals(st3)){
						   JOptionPane.showConfirmDialog(null,
									"le mot de passe et sa confirmation devront etre les méme",
									"Juste un test",
									JOptionPane.PLAIN_MESSAGE); 
						   jPasswordField1.setText("");
						   jPasswordField2.setText("");}
					   else {
						   Execute2 EX = new Execute2 ();
					       try {
							v = EX.creer_user(st1, st2, st4);
							if (v==1){JOptionPane.showConfirmDialog(null,
									" création d'utilisateur réussi",
									"Juste un test",
									JOptionPane.PLAIN_MESSAGE);}
							else if (v==0){JOptionPane.showConfirmDialog(null,
									"Cet utilisateur existe donner un autre nom d'utilisateur",
									"Juste un test",
									JOptionPane.PLAIN_MESSAGE);}
							jTextField1.setText(""); 
							jPasswordField1.setText("");
							   jPasswordField2.setText("");
						} catch (SQLException e1) {System.out.println(e1.getMessage());
							// TODO Auto-generated catch block
							JOptionPane.showConfirmDialog(null,
									" création d'utilisateur non réussi",
									"Juste un test",
									JOptionPane.PLAIN_MESSAGE);
						}	} 
					   }
					   }
						}
					   }
				   }
      }	   }
	}}


