package donneePersistante.StockInscription;

import java.sql.Connection;

import javax.swing.JFrame;

import domaine.Commun.Promoteur;
import domaine.Eligibilite.Eligibilite;
import domaine.Eligibilite.Entreprise;
import donneePersistante.Connection.connection;


public abstract class Dao<T> {
	

	/**
	 * @uml.property  name="connect"
	 */
	protected Connection connect = null;
    
   
    public Dao(Connection conn){
            this.connect = conn;
    }
    
    
    public abstract boolean create(T obj);
    
    public abstract boolean delete(T obj);
    
    public abstract boolean update(T obj);
    
    public abstract T find(int id);
    
    public abstract void Inserer(T obj ,JFrame f);


	public void Inserer1(T promoteur, JFrame f) {}


	public void Inserer(T obj) {
		// TODO Auto-generated method stub
		return;
	}


	
	

}




