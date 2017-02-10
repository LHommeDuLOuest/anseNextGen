package donneePersistante.StockEligibilite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import domaine.Eligibilite.Eligibilite;
import domaine.Observeur.Observable;
import domaine.Observeur.Observateur;
import donneePersistante.Connection.connection;
import donneePersistante.StockInscription.Dao;

public class EligibiliteDao extends Dao<Eligibilite>implements Observable{

	public EligibiliteDao(Connection conn) {
		super(conn);
	}

	@Override
	public void Inserer(Eligibilite obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean create(Eligibilite obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Eligibilite obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Eligibilite find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Eligibilite obj) {
		// TODO Auto-generated method stub
		return false;
	}

	/*public void change(int id, String session, String dateSession) {
		PreparedStatement st = null ;
		try {
			System.out.println("++++ sesion"+session+"+++++++++");
			System.out.println("///// numero"+id+"========");
			java.sql.Statement stt = connect.createStatement();
			st = connect.prepareStatement("insert into Eligibilite values(?,?,?,?,?)");
			st.setString(1, session);
    		st.setString(2, dateSession);
    		st.setString(3, "eligible");
    		st.setString(4, "boutef");
    		st.setInt(5, id);
			int r = st.executeUpdate() ;	 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	
	public void change(int id, String NumSession, String dateSession,String decision,String motif,JFrame f)  {
		   this.delObservateur();
		   this.addObservateur((Observateur) f);
		try {
			
			PreparedStatement st = null ;

			System.out.println("++++ sesion"+NumSession+"+++++++++");
			
			st = connection.getInstance().prepareStatement("insert into eligibilite values (?,?,?,?,?)");
			st.setString(1, NumSession);
 		st.setString(2, dateSession);
 		st.setString(3, decision);
 		st.setString(4, motif);
 		st.setInt(5, id);
 		int r = st.executeUpdate() ;
 		this.updateObservateur();
 		System.out.println("l'observateur ca marche?");
 		JOptionPane.showConfirmDialog(null,
				" On a effectuer l'eligibilite pour ce promoteur ",
				"Juste un test",
				JOptionPane.PLAIN_MESSAGE);
			
			/*java.sql.Statement stt = connect.createStatement();
			 stt.executeUpdate("insert into eligiblite values(session,dateSession,'boutef','tresbien',id)");*/
		
		try{
			PreparedStatement st1 = null ;
			
			st1 = connection.getInstance().prepareStatement("update promoteurs01 set etat = ? where matricule = ?");
			st1.setString(1, decision);
	 		st1.setInt(2, id);
	 		st1.executeUpdate() ;
	 		JOptionPane.showConfirmDialog(null,
					" On changer l'etat pour ce promoteur ",
					"Juste un test",
					JOptionPane.PLAIN_MESSAGE);
		}
		
		catch(NullPointerException e004){} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		}
		catch (SQLException e) {
			this.updateObservateur();
			e.printStackTrace();
		}
		catch(NullPointerException e00){}
	}


	@Override
	public void Inserer(Eligibilite obj, JFrame f) {
		// TODO Auto-generated method stub
		
	}

	public void addObservateur(Observateur obs) {
		// TODO Auto-generated method stub
		
	}

	public void addObservateur1(Observateur obs) {
		// TODO Auto-generated method stub
		
	}

	public void delObservateur() {
		// TODO Auto-generated method stub
		
	}

	public void updateObservateur() {
		// TODO Auto-generated method stub
		
	}

	public void updateObservateur1() {
		// TODO Auto-generated method stub
		
	}


}

