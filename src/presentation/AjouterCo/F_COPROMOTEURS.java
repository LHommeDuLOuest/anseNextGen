package presentation.AjouterCo;

import javax.swing.*;

import domaine.Commun.ANSEJ;
import domaine.Observeur.Observateur;

import presentation.Start.FP_CA;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
public class F_COPROMOTEURS extends JFrame implements ActionListener,Observateur {
	/**
	 * @uml.property  name="a"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ANSEJ A;
	/**
	 * @uml.property  name="g"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private JFrame g;
	
	
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
 * @uml.property  name="jPanel3"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JPanel jPanel3 = new JPanel();
  /**
 * @uml.property  name="jPanel4"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JPanel jPanel4 = new JPanel();
  /**
 * @uml.property  name="jLabel11"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel11 = new JLabel();
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
 * @uml.property  name="jTextField4"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JTextField jTextField4 = new JTextField();
  /**
 * @uml.property  name="jLabel12"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel12 = new JLabel();
  /**
 * @uml.property  name="jComboBox4"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox4 = new JComboBox();
  /**
 * @uml.property  name="jComboBox5"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox5 = new JComboBox();
  /**
 * @uml.property  name="jComboBox6"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox6 = new JComboBox();
  /**
 * @uml.property  name="jLabel13"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel13 = new JLabel();
  /**
 * @uml.property  name="jTextField5"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JTextField jTextField5 = new JTextField();
  /**
 * @uml.property  name="jLabel20"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel20 = new JLabel();
  /**
 * @uml.property  name="jTextField6"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JTextField jTextField6 = new JTextField();
  /**
 * @uml.property  name="jLabel110"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel110 = new JLabel();
  /**
 * @uml.property  name="jLabel17"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel17 = new JLabel();
  /**
 * @uml.property  name="jLabel18"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel18 = new JLabel();
  /**
 * @uml.property  name="jLabel19"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel19 = new JLabel();
  /**
 * @uml.property  name="jLabel111"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel111 = new JLabel();
  /**
 * @uml.property  name="jComboBox7"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox7 = new JComboBox();
  /**
 * @uml.property  name="jLabel112"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel112 = new JLabel();
  /**
 * @uml.property  name="jComboBox8"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox8 = new JComboBox();
  /**
 * @uml.property  name="jLabel113"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel113 = new JLabel();
  /**
 * @uml.property  name="jComboBox9"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox9 = new JComboBox();
  /**
 * @uml.property  name="jComboBox10"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox10 = new JComboBox();
  /**
 * @uml.property  name="jTextField7"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JTextField jTextField7 = new JTextField();
  /**
 * @uml.property  name="jLabel114"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel114 = new JLabel();
  /**
 * @uml.property  name="jLabel115"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel115 = new JLabel();
  /**
 * @uml.property  name="jPanel5"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JPanel jPanel5 = new JPanel();
  /**
 * @uml.property  name="jLabel21"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel21 = new JLabel();
  /**
 * @uml.property  name="jComboBox11"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox11 = new JComboBox();
  /**
 * @uml.property  name="jLabel116"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel116 = new JLabel();
  /**
 * @uml.property  name="jLabel117"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel117 = new JLabel();
  /**
 * @uml.property  name="jLabel118"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JLabel jLabel118 = new JLabel();
  /**
 * @uml.property  name="jTextField8"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JTextField jTextField8 = new JTextField();
  /**
 * @uml.property  name="jComboBox12"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
JComboBox jComboBox12 = new JComboBox();
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
  public F_COPROMOTEURS(ANSEJ A,JFrame g) throws HeadlessException {
	  this.A=A;
	  this.g=g;
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  private void jbInit() throws Exception {
	  this.setResizable(false);
	  this.setLocationRelativeTo(null);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  jComboBox3.setBounds(new Rectangle(395, 60, 66, 16));  
    
    jLabel16.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel16.setRequestFocusEnabled(true);
    jLabel16.setText("Année :");
    jLabel16.setBounds(new Rectangle(351, 58, 49, 19));
    jComboBox2.setBounds(new Rectangle(291, 60, 50, 17));
    jLabel15.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel15.setText("Mois :");
    jLabel15.setBounds(new Rectangle(252, 57, 43, 23));
    jComboBox1.setBounds(new Rectangle(193, 60, 50, 17));
    jLabel14.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel14.setText("Jour :");
    jLabel14.setBounds(new Rectangle(153, 59, 38, 21));
    this.setSize(700,500);
   this.getContentPane().setBackground(SystemColor.inactiveCaptionText);
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
    jLabel5.setBounds(new Rectangle(-5, 28, 705, 23));
    jLabel4.setBackground(Color.white);
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel4.setOpaque(true);
    jLabel4.setRequestFocusEnabled(true);
    jLabel4.setToolTipText("");
    jLabel4.setVerifyInputWhenFocusTarget(true);
    jLabel4.setText("                      Associer des copromoteurs ");
    jLabel4.setBounds(new Rectangle(-2, 51, 700, 15));
    jPanel1.setBorder(BorderFactory.createTitledBorder("Identification du promoteur gérant"));
    jPanel1.setFont(new java.awt.Font("Dialog", 1, 11));
    jPanel1.setBackground(SystemColor.inactiveCaptionText);
    jPanel1.setBounds(new Rectangle(0, 68, 701, 96));
    jPanel1.setLayout(null);
    /*jTextField1.setBackground(SystemColor.activeCaptionText);*/
    jTextField1.setText("");
    jTextField1.setBounds(new Rectangle(194, 21, 132, 20));
    jLabel7.setBounds(new Rectangle(333, 22, 66, 18));
    jLabel7.setText("  Prenom :");
    jLabel7.setFont(new java.awt.Font("Dialog", 1, 12));
    jTextField2.setText("");
    jTextField2.setBounds(new Rectangle(407, 22, 155, 19));
    jLabel8.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel8.setText("Date de naissance :");
    jLabel8.setBounds(new Rectangle(37, 60, 114, 18));
    jPanel2.setFont(new java.awt.Font("Dialog", 1, 11));
    jPanel2.setBorder(BorderFactory.createTitledBorder("  "));
    jPanel2.setBackground(SystemColor.inactiveCaptionText);
    jPanel2.setBounds(new Rectangle(0, 160, 702, 343));
    jPanel2.setLayout(null);
    jLabel10.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel10.setText("  Nom :");
    jLabel10.setBounds(new Rectangle(96, 23, 54, 18));
    jPanel3.setBounds(new Rectangle(1, 12, 702, 94));
    jPanel3.setLayout(null);
    jPanel3.setBackground(SystemColor.inactiveCaptionText);
    jPanel3.setFont(new java.awt.Font("Dialog", 1, 11));
    jPanel4.setFont(new java.awt.Font("Dialog", 1, 11));
    jPanel3.setBorder(BorderFactory.createTitledBorder("Identification du copromoteur1"));
    jPanel4.setBorder(BorderFactory.createTitledBorder("Identification du copromoteur2"));
    jPanel4.setMaximumSize(new Dimension(32767, 32767));
    jPanel4.setBackground(SystemColor.inactiveCaptionText);
    jPanel4.setBounds(new Rectangle(3, 104, 701, 87));
    jPanel4.setLayout(null);
    jLabel11.setText("  Nom :");
    jLabel11.setBounds(new Rectangle(105, 18, 38, 16));
    jLabel11.setFont(new java.awt.Font("Dialog", 1, 12));
    jTextField3.setText("");
    jTextField3.setBounds(new Rectangle(190, 17, 145, 20));
    //jTextField3.setBackground(SystemColor.activeCaptionText);
    jLabel9.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel9.setText("  Prenom :");
    jLabel9.setBounds(new Rectangle(335, 18, 70, 18));
    //jTextField4.setBackground(SystemColor.activeCaptionText);
    jTextField4.setBounds(new Rectangle(408, 15, 152, 20));
    jTextField4.setText("");
    jLabel12.setBounds(new Rectangle(26, 56, 114, 18));
    jLabel12.setText("Date de naissance :");
    jComboBox4.setBounds(new Rectangle(189, 55, 50, 16));
    jComboBox5.setBounds(new Rectangle(288, 54, 50, 18));
    jComboBox6.setBounds(new Rectangle(396, 54, 66, 17));
    jLabel12.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel13.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel13.setText("  Nom :");
    jLabel13.setBounds(new Rectangle(102, 22, 41, 16));
    //jTextField5.setBackground(SystemColor.activeCaptionText);
    jTextField5.setBounds(new Rectangle(184, 19, 145, 20));
    jTextField5.setText("");
    jLabel20.setBounds(new Rectangle(335, 18, 70, 20));
    jLabel20.setText("  Prenom :");
    jLabel20.setFont(new java.awt.Font("Dialog", 1, 12));
    jTextField6.setText("");
    jTextField6.setBounds(new Rectangle(402, 17, 153, 20));
    //jTextField6.setBackground(SystemColor.activeCaptionText);
    jLabel110.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel110.setText("Date de naissance :");
    jLabel110.setBounds(new Rectangle(20, 53, 114, 18));
    jLabel17.setBounds(new Rectangle(144, 56, 36, 21));
    jLabel17.setText("Jour :");
    jLabel17.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel18.setBounds(new Rectangle(248, 52, 43, 23));
    jLabel18.setText("Mois :");
    jLabel18.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel19.setBounds(new Rectangle(347, 55, 49, 17));
    jLabel19.setText("Année :");
    jLabel19.setRequestFocusEnabled(true);
    jLabel19.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel111.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel111.setText("Jour :");
    jLabel111.setBounds(new Rectangle(137, 53, 36, 17));
    jComboBox7.setBounds(new Rectangle(182, 51, 50, 16));
  
    jLabel112.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel112.setText("Mois :");
    jLabel112.setBounds(new Rectangle(240, 48, 43, 23));
    jComboBox8.setBounds(new Rectangle(283, 50, 50, 16));
   
    jLabel113.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel113.setRequestFocusEnabled(true);
    jLabel113.setText("Année :");
    jLabel113.setBounds(new Rectangle(341, 49, 49, 21));
    jComboBox9.setBounds(new Rectangle(394, 52, 66, 16));
    jComboBox10.setBounds(new Rectangle(397, 51, 66, 16));
 
    //jTextField7.setBackground(SystemColor.activeCaptionText);
    jTextField7.setBounds(new Rectangle(407, 17, 150, 20));
    jTextField7.setText("");
    jLabel114.setBounds(new Rectangle(341, 49, 49, 21));
    jLabel114.setText("Année :");
    jLabel114.setRequestFocusEnabled(true);
    jLabel114.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel115.setBounds(new Rectangle(137, 53, 36, 17));
    jLabel115.setText("Jour :");
    jLabel115.setFont(new java.awt.Font("Dialog", 1, 10));
    jPanel5.setLayout(null);
    jPanel5.setBounds(new Rectangle(0, 187, 711, 154));
    jPanel5.setBackground(SystemColor.inactiveCaptionText);
    jPanel5.setMaximumSize(new Dimension(32767, 32767));
    jPanel5.setBorder(BorderFactory.createTitledBorder("Identification du copromoteur3"));
    jLabel21.setBounds(new Rectangle(335, 18, 70, 20));
    jLabel21.setText("  Prenom :");
    jLabel21.setFont(new java.awt.Font("Dialog", 1, 12));
    jComboBox11.setBounds(new Rectangle(285, 51, 50, 17));
    jLabel116.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel116.setText("  Nom :");
    jLabel116.setBounds(new Rectangle(102, 22, 41, 16));
    jLabel117.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel117.setText("Date de naissance :");
    jLabel117.setBounds(new Rectangle(20, 51, 114, 18));
    jLabel118.setFont(new java.awt.Font("Dialog", 1, 10));
    jLabel118.setText("Mois :");
    jLabel118.setBounds(new Rectangle(240, 48, 43, 23));
    //jTextField8.setBackground(SystemColor.activeCaptionText);
    jTextField8.setBounds(new Rectangle(184, 19, 145, 20));
    jTextField8.setText("");
    jComboBox12.setBounds(new Rectangle(184, 50, 50, 16));
    jButton1.setBackground(Color.orange);
    jButton1.setBounds(new Rectangle(175, 91, 145, 23));
    jButton1.addActionListener(this);
    jButton2.addActionListener(this);
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton1.setText("  Annuler");
    jButton2.setBackground(Color.orange);
    jButton2.setBounds(new Rectangle(373, 91, 148, 23));
   
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setText("Affecter");
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
      for (i=1960;i<=1999;i++){ jComboBox6.addItem(i);
     }
      for (i=1 ;i <= 31; i++){
          jComboBox7.addItem(i);
        }
        for (i=1;i<=12;i++){ jComboBox8.addItem(i);
        }
        for (i=1960;i<=1999;i++){ jComboBox9.addItem(i);
       }
        for (i=1 ;i <= 31; i++){
            jComboBox12.addItem(i);
          }
          for (i=1;i<=12;i++){ jComboBox11.addItem(i);
          }
          for (i=1960;i<=1999;i++){ jComboBox10.addItem(i);
         }
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel5, null);
    this.getContentPane().add(jPanel1, null);
    jPanel1.add(jTextField1, null);
    jPanel1.add(jLabel10, null);
    jPanel1.add(jTextField2, null);
    jPanel1.add(jLabel7, null);
    jPanel1.add(jLabel14, null);
    jPanel1.add(jLabel8, null);
    jPanel1.add(jLabel15, null);
    jPanel1.add(jComboBox2, null);
    jPanel1.add(jLabel16, null);
    jPanel1.add(jComboBox1, null);
    jPanel1.add(jComboBox3, null);
    this.getContentPane().add(jPanel2, null);
    jPanel2.add(jPanel3, null);
    jPanel3.add(jTextField3, null);
    jPanel3.add(jLabel11, null);
    jPanel3.add(jLabel12, null);
    jPanel3.add(jComboBox4, null);
    jPanel3.add(jLabel17, null);
    jPanel3.add(jLabel18, null);
    jPanel3.add(jComboBox5, null);
    jPanel3.add(jLabel9, null);
    jPanel3.add(jTextField4, null);
    jPanel3.add(jComboBox6, null);
    jPanel3.add(jLabel19, null);
    jPanel2.add(jPanel4, null);
    jPanel4.add(jTextField5, null);
    jPanel4.add(jLabel20, null);
    jPanel4.add(jTextField6, null);
    jPanel4.add(jLabel13, null);
    jPanel4.add(jLabel111, null);
    jPanel4.add(jComboBox7, null);
    jPanel4.add(jLabel112, null);
    jPanel4.add(jComboBox8, null);
    jPanel4.add(jLabel113, null);
    jPanel4.add(jLabel110, null);
    jPanel4.add(jComboBox9, null);
    jPanel2.add(jPanel5, null);
    jPanel5.add(jTextField8, null);
    jPanel5.add(jLabel21, null);
    jPanel5.add(jLabel116, null);
    jPanel5.add(jLabel115, null);
    jPanel5.add(jComboBox12, null);
    jPanel5.add(jLabel118, null);
    jPanel5.add(jLabel114, null);
    jPanel5.add(jLabel117, null);
    jPanel5.add(jTextField7, null);
    jPanel5.add(jButton1, null);
    jPanel5.add(jButton2, null);
    jPanel5.add(jComboBox10, null);
    jPanel5.add(jComboBox11, null);
    this.getContentPane().add(jLabel4, null);
  }

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton boutonCliqué = (JButton) arg0.getSource();
		if (boutonCliqué == jButton1){
			dispose();
			g.show();
	}
		else{ if (boutonCliqué == jButton2){
			     Vector liste = new Vector();
			        liste.addElement( this.jTextField1.getText());
					liste.addElement (this.jTextField2.getText());
					liste.addElement (this.jTextField3.getText());
					liste.addElement (this.jTextField4.getText());
					liste.addElement (this.jTextField5.getText());
					liste.addElement (this.jTextField6.getText());
					liste.addElement( this.jTextField7.getText());
					liste.addElement (this.jTextField8.getText());
					
			     A.getRegistre5().ajouterCoPro(liste,this);
	                 			
              }
		}}
	public void update() {
		// TODO Auto-generated method stub
		
	}
	public void update(JFrame f) {
		// TODO Auto-generated method stub
		
	}
	public void update1() {
		// TODO Auto-generated method stub
		
	}
	public void update2() {
		// TODO Auto-generated method stub
		
	}
	public void update4(int i, String s) {
		// TODO Auto-generated method stub
		
	}}

