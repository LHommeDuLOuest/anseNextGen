package donneePersistante.StockCoPro;

import java.sql.Connection;
import java.util.Vector;

import javax.swing.JFrame;

import domaine.AjouterCo.CopPro;
import donneePersistante.StockInscription.Dao;


public class CoproDao extends Dao<CopPro>{

	public CoproDao(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Inserer(CopPro obj, JFrame f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean create(CopPro obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(CopPro obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CopPro find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(CopPro obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void entrerCoPro(Vector v){
		
		
	}


}
