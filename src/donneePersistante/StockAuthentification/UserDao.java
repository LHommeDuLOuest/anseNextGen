package donneePersistante.StockAuthentification;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;

import donneePersistante.StockInscription.Dao;
import domaine.Observeur.Observable;
import domaine.Observeur.Observateur;
import domaine.authentification.User;
import donneePersistante.Connection.connection;

public class UserDao extends Dao<User>implements Observable{
	/**
	 * @uml.property  name="listObservateur"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="domaine.Observeur.Observateur"
	 */
	private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();

	public UserDao(Connection conn) {
		super(conn);
		System.out.println("je suis l'objet userdao je suis creer");}

	public void Inserer(User obj, JFrame f){}
	public boolean create(User obj){return false;}
	public boolean delete(User obj) {return false;}
	public User find(int id) {return null;}
	public boolean update(User obj) {return false;}
	
	
	public String av_User(User u,JFrame f){
		 PreparedStatement pst ;
		 ResultSet R0 ;
		 String t="a" ; 
		 try {
			pst = connection.getInstance().prepareStatement("  select type_users from users where mon_user = ? and pass_user= ? ");
			 pst.setString(1,u.getUser());
			 pst.setString(2,u.getPass());
			 R0 = pst.executeQuery() ;
				while (R0.next()){
				t= R0.getString("type_users");
				System.out.println("ici ici **********"+t+"//////////////////////ici");
			
				} }
				catch (SQLException e) {e.printStackTrace();	}
				catch(NullPointerException e0004){}
		return t;}
			
		 
	
	public String getPwd(Vector v,JFrame g){
		String s = null;
		 PreparedStatement pst ;
		 ResultSet R0 ;
		 try {
			 System.out.println("**************§§§§§§§§§§§§§§"+v.elementAt(3)+"§§§§§§§§§++++++++++++++");
			pst = connection.getInstance().prepareStatement("  select pass_user from users where nom_user = ? and pass_user= ? ");
			pst.setString(1,(String) v.elementAt(0));
			 pst.setString(2,(String) v.elementAt(1));
			 R0 = pst.executeQuery() ;
			 while (R0.next()){
					s= R0.getString("pass_user");
				}
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			catch(NullPointerException e000){
				System.out.println("77777777777 je suis dans la catch de null pointerExeception//////////////");
				System.out.println("77777777777 fin du catch de getPwd//////////////");
			}
		
		return s;
	}
	
	public void setPwd(Vector s){
		PreparedStatement pst ;
		
		try {
			System.out.println("**************"+s.elementAt(1)+"++++++++++++++");
			pst = connection.getInstance().prepareStatement(" update  users set pass_user =? where nom_user = ? and pass_user= ? ");
			pst.setString(1,(String) s.elementAt(2));
			pst.setString(2,(String) s.elementAt(0));
			pst.setString(3,(String) s.elementAt(1));
			pst.executeQuery() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void addObservateur(Observateur obs) {
		this.listObservateur.add(obs);
		
	}

	
	public void addObservateur1(Observateur obs) {
		// TODO Auto-generated method stub
		
	}

	
	public void delObservateur() {
		// TODO Auto-generated method stub
		
	}

	
	public void updateObservateur() {
		for(Observateur obs : this.listObservateur )
			obs.update4(0, null);
		
	}

	
	public void updateObservateur1() {
		for(Observateur obs : this.listObservateur )
			obs.update2();
		
	}
		
	
	

}
