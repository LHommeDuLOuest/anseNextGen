package domaine.Commun;
import java.util.Vector;

import javax.swing.JFrame;

import domaine.Eligibilite.Eligibilite;

public class Registre2 {
	/**
	 * @uml.property  name="eligibilite"
	 * @uml.associationEnd  
	 */
	private Eligibilite eligibilite;
	/**
	 * @uml.property  name="promoteur"
	 * @uml.associationEnd  
	 */
	private Promoteur promoteur;
	
	public void creerEligibilite(){
		eligibilite = new Eligibilite();
    }
	

	public void affecterEligibilite(String nom,String prenom,String dn,String NumSession ,String dateSession,String decision,String motif,JFrame f){
		this.eligibilite.affecter(nom,prenom,dn,NumSession,dateSession,decision,motif,f);
		System.out.println("je suis dans registre2");
		System.out.println("je suis ds l'op:affecterEligiblité"+prenom);
	}
	
	public void identifierEntreprise(Vector v1,Vector v2,JFrame f){
		this.eligibilite.creerEntreprise(v1,v2, f);
	}
	

}

