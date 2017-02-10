package donneePersistante.StockEligibilite;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import donneePersistante.Connection.connection;
import donneePersistante.StockInscription.Dao;
import domaine.Eligibilite.Entreprise;

public class EntrepriseDao extends Dao<Entreprise>{

	public EntrepriseDao(Connection conn) {
		super(conn);
	}



	@Override
	public boolean create(Entreprise obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Entreprise obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entreprise find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Entreprise obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public void ajouterEntreprise(int id, Vector<String> v2) throws NullPointerException{
		try {
			java.sql.Statement stt = connect.createStatement();
			 stt.executeUpdate("insert into entreprise values(id ,v2.elementAt(0),v2.elementAt(1),v2.alementAt(2)");
					 
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		catch(NullPointerException e789){JOptionPane.showConfirmDialog(null,
				"ah il ya un probleme ",
				"Juste un test",
				JOptionPane.PLAIN_MESSAGE);}
	
	}

	@Override
	public void Inserer(Entreprise obj, JFrame f) {
		// TODO Auto-generated method stub
		
	} 

}

