 
package domaine.Commun;

import java.util.Vector;

public class Promoteur {
	
	/**
	 * @uml.property  name="nom"
	 */
	private String nom;
	/**
	 * @uml.property  name="prenom"
	 */
	private String prenom;
	/**
	 * @uml.property  name="dn"
	 */
	private String dn;
	/**
	 * @uml.property  name="adresse"
	 */
	private String adresse;
	/**
	 * @uml.property  name="commune"
	 */
	private String commune;
	/**
	 * @uml.property  name="telephone"
	 */
	private String telephone ;
	/**
	 * @uml.property  name="faxe"
	 */
	private String faxe;
	/**
	 * @uml.property  name="email"
	 */
	private String email;
	/**
	 * @uml.property  name="s_familiale"
	 */
	private String s_familiale;
	/**
	 * @uml.property  name="handicape"
	 */
	private String handicape;
	/**
	 * @uml.property  name="n_etude"
	 */
	private String n_etude;
	/**
	 * @uml.property  name="e_professionel"
	 */
	private String e_professionel;
	/**
	 * @uml.property  name="specialite"
	 */
	private String specialite;
	
	public Promoteur(String nom,String prenom,String dn){
		this.nom=nom;
		this.prenom=prenom;
		this.dn=dn;
	}
	
	public Promoteur (Vector liste){
		this.nom =(String) liste.elementAt(0);
		this.prenom=(String) liste.elementAt(1); 
		this.dn=(String) liste.elementAt(2); 
		this.adresse=(String) liste.elementAt(3); 
		this.commune=(String) liste.elementAt(4); 
		this.telephone=(String) liste.elementAt(5);
		this.faxe=(String) liste.elementAt(6);
		this.email=(String) liste.elementAt(7); 
		 this.s_familiale=(String) liste.elementAt(8);
		 this.handicape=(String) liste.elementAt(9);
		 this.n_etude=(String) liste.elementAt(10);
		 this.e_professionel=(String) liste.elementAt(11);
		 this.specialite=(String) liste.elementAt(12);
		System.out.println("lyes je me suis creer");
		System.out.println(liste.get(0));
	}
	
	public Promoteur () {}
	
	public String getnom(){
		return nom;
	}
	public String getprenom(){
		return prenom;
	}
    public String getdn(){
    	return dn;
    }
    public String getcomm_nais(){
    	return commune;
    }
    /**
	 * @return
	 * @uml.property  name="email"
	 */
    public String getEmail(){
    	return email;
    }
    /**
	 * @return
	 * @uml.property  name="telephone"
	 */
    public String getTelephone(){
    	return telephone;
    }
    public String gethandicape(){
    	return handicape;
    }
    public String getSituationFamiliale(){
    	return s_familiale;
    }
    /**
	 * @return
	 * @uml.property  name="adresse"
	 */
    public String getAdresse(){
		return adresse;
}
    /**
	 * @return
	 * @uml.property  name="faxe"
	 */
    public String getFaxe(){
		return faxe;}
    public String getEtude(){
		return n_etude;}
    public String getProfesion(){
		return e_professionel;}
    public String getSpicialite(){
		return specialite;}

	
}

