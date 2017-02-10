package domaine.Commun;

import java.util.Vector;

import javax.swing.JFrame;



import domaine.Inscription.Inscription;

public class Registre1 {
	
	 /**
	 * @uml.property  name="inscriptioncourante"
	 * @uml.associationEnd  
	 */
	private Inscription inscriptioncourante;
		
	    public Registre1(){}
	    
	    public void CreerInscription(){
	    	this.inscriptioncourante=new Inscription();
	    }
	    
	    public void Saisir(String nom,String prenom,String dn,JFrame f) {
	    	inscriptioncourante.Verifier(nom,prenom,dn,f);
	    }
	    
	    public void SaisirttInfo(Vector liste,JFrame f) {
	    	inscriptioncourante.Ajouter(liste,f);

	   }
	 }




