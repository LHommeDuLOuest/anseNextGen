package domaine.Eligibilite;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import domaine.Commun.Promoteur;
import donneePersistante.StockInscription.PromoteurDao;
import donneePersistante.StockEligibilite.EntrepriseDao;
import donneePersistante.Connection.connection;

public class Eligibilite {

	public void Eligibilite(){} 
	
	

	public void affecter(String nom,String prenom,String dn,String NumSession ,String dateSession,String decision,String motif,JFrame f){
		creerPromoteurDao().rendreEligible(creerPromoteur( nom, prenom, dn),NumSession,dateSession,decision,motif,f);
		System.out.println("je suis dans Eligibilite");
		System.out.println("je suis ds affacter  "+NumSession);
	}
	
	
	public void creerEntreprise(Vector v1,Vector v2,JFrame f){
		Vecteur2D q =new Vecteur2D();
		q= creerPromoteurDao().getId(creerPromoteur((String)v1.elementAt(0),(String)v1.elementAt(1),(String)v1.elementAt(2)),f);
		if (q.getX()!=0&q.getY()=="eligible"){
			EntrepriseDao entreprisedao = new EntrepriseDao(connection.getInstance());
			entreprisedao.ajouterEntreprise(q.getX(),v2);
		}
		else 
			if (q.getY()!="eligible"){
				JOptionPane.showConfirmDialog(null,
						"Ce promoteur n'est pas eligible ",
						"Juste un test",
						JOptionPane.PLAIN_MESSAGE);
			}
	}
	
	
	
	public Promoteur creerPromoteur(String nom,String prenom,String dn){
		Promoteur promoteur = new Promoteur(nom,prenom,dn);
		return promoteur;
	}
	
	public PromoteurDao creerPromoteurDao(){
		PromoteurDao promoteurdao = new PromoteurDao(connection.getInstance());
		return promoteurdao;
	}

}

