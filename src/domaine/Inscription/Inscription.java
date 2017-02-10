package domaine.Inscription;

import java.util.Vector;

import javax.swing.JFrame;



import domaine.Commun.Promoteur;
import donneePersistante.Connection.connection;
import donneePersistante.StockInscription.Dao;
import donneePersistante.StockInscription.PromoteurDao;

public class Inscription {
	

	/**
	 * @uml.property  name="promoteur"
	 * @uml.associationEnd  
	 */
	private Promoteur promoteur;
    /**
	 * @uml.property  name="prodao"
	 * @uml.associationEnd  
	 */
    private  Dao<Promoteur> prodao;
	
	public Inscription(){
		System.out.println("je suis dans inscription l'objet nscription a ete creer");
	}
	
	public void CreerPromoteur(String nom,String prenom,String dn) {
		this.promoteur = new Promoteur(nom,prenom,dn);
	}
	
	public void CreerPromoteur(Vector v) {
		this.promoteur = new Promoteur(v);
	}
	
	private Dao<Promoteur> CreerDaoPromoteur() {
		this.prodao = new PromoteurDao(connection.getInstance());
		return prodao;
	}
	
	public void Verifier(String nom, String prenom, String dn, JFrame f){
		this.promoteur = new Promoteur(nom,prenom,dn);
		System.out.println("je suis dans inscription" + promoteur.getnom());
		this.prodao = new PromoteurDao(connection.getInstance());
		prodao.Inserer(promoteur,f);
		
	}
	
	public void Ajouter(Vector liste,JFrame f){
		this.promoteur =new Promoteur(liste);
		prodao.Inserer1(promoteur,f);
	}
	  
	public Inscription get(){
		return this;
		
	}

}




