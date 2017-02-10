package lesAutreCas;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class F_cher_users extends JFrame {
	/**
	 * @uml.property  name="requete"
	 */
	private  String requete ;
	public F_cher_users(String requete){
		this.setLocationRelativeTo(null);
	String pilote =  "oracle.jdbc.OracleDriver";
	String host = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	String login = "system";
	String pw = "lyes";
	this.requete =  requete  ;
	setTitle("Listes des utilisateurs ");
	setSize(300,80);
	
	show();
	TM = new TMFromOracle(pilote,host,login,pw,requete);
	JTable T = new JTable(TM);
	JScrollPane JSP = new JScrollPane(T);
	JSP.setPreferredSize(new Dimension(x,y));
	getContentPane().add(JSP,BorderLayout.CENTER);
	pack();
	}

	public static TableModel TM;
	private static final int x = 400;
	private static final int y = 100;
	}



