package donneePersistante.StockInscription;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import domaine.Eligibilite.Vecteur2D;
import donneePersistante.StockEligibilite.EligibiliteDao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import donneePersistante.Connection.connection;

import domaine.Commun.Promoteur;
import domaine.Observeur.Observable;
import domaine.Observeur.Observateur;

public class PromoteurDao extends Dao<Promoteur> implements Observable{
	
	/**
	 * @uml.property  name="listObservateur"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="domaine.Observeur.Observateur"
	 */
	private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();
	/**
	 * @uml.property  name="listObservateur1"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="domaine.Observeur.Observateur"
	 */
	private ArrayList<Observateur> listObservateur1 = new ArrayList<Observateur>();

	
	public PromoteurDao(Connection conn) {
        super(conn);}
   public boolean create(Promoteur obj) {
        return false;}
  public boolean delete(Promoteur obj) {
        return false;}
  public Promoteur find(int id) {
         Promoteur p = new Promoteur();                
        return p;}
  public boolean update(Promoteur obj) {
        return false;}
  
  
  public void Inserer1(Promoteur obj,JFrame j ){
	  int r ;
        this.addObservateur1((Observateur) j);	   
		PreparedStatement st = null ;
    			try {
			System.out.println("je suis arrivé a l'execution de up date"+ obj.getFaxe());
			System.out.println(obj.getnom());
			System.out.println(obj.getcomm_nais());
			System.out.println(obj.getAdresse());
			System.out.println(obj.getnom());
			System.out.println(obj.getnom());
			st = connect.prepareStatement("update promoteurs01 set etat = 'INSCRIT', adresse = ? ,commune = ?,tel = ?,fax = ?,email = ?,S_F = ? ,handicape =?,n_etude =?,EXPERIENCE = ?,specialite = ? where nom = ? and prenom = ?") ;
			
			st.setString(11, obj.getnom());
    		st.setString(12, obj.getprenom());
    		
    		st.setString(1,obj.getAdresse());
    		st.setString(2,obj.getcomm_nais());
    		st.setString(3,obj.getTelephone());
    		st.setString(4,obj.getFaxe());
    		st.setString(5,obj.getEmail());
    		st.setString(6,obj.getSituationFamiliale());
    		st.setString(7,obj.gethandicape());
    		st.setString(8,obj.getEtude());
    		st.setString(9,obj.getProfesion());
    		st.setString(10,obj.getSpicialite());	
    			
    			r = st.executeUpdate() ;
  			   	
            System.out.println(" apres l'execution de up date"+obj.getnom());
	    	
	    	System.out.println("je suis dans le dao une autre fois " +obj.getprenom());
	    	System.out.println("j'ai executé l'insertion inserer grand promoteur");
	    	this.updateObservateur1();
	    	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("impossible de se connecter wa salim");
            System.out.println (obj.getnom());
	    	
	    	this.updateObservateur();
	    	System.out.println("j'ai executé l'insertion");
		}	  
  }

      
  public void addObservateur1(Observateur f) {
	  this.listObservateur1.add(f);	}

  
   public void Inserer(Promoteur obj ,JFrame f){
	  int r ;
	          this.addObservateur((Observateur) f);
	          f.setVisible(false);
		PreparedStatement st = null ;
    	
		try {
			System.out.println("je suis arrivé");
			System.out.println("je suis dans inserer------------"+obj.getdn()+"-------------");
	
			st = connect.prepareStatement("insert into promoteurs01 (nom,prenom,dn,matricule) values (?,?,?,qs_matricule.nextval)");
			st.setString(1, obj.getnom());
    		st.setString(2, obj.getprenom());
    		st.setString(3, obj.getdn());
    		
    		r = st.executeUpdate() ;
            System.out.println(obj.getnom());
	    	this.updateObservateur(f);
	    	System.out.println("je suis dans le dao " +obj.getprenom());
	    	System.out.println("j'ai executé l'insertion DE LA FENETRE INSCRIPTION 1");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("impossible de se connecter wa salim");
            System.out.println (obj.getnom());	   
		}
	  }

      
  
  
  
  public void updateObservateur1() {
	  for(Observateur obs : this.listObservateur1 )
			obs.update();}

  public void addObservateur(Observateur obs) {
	  this.listObservateur.add(obs);}

  public void delObservateur() {}


  public void updateObservateur(JFrame f) {
	  for(Observateur obs : this.listObservateur )
			obs.update(f);}
  

	public Vecteur2D getId(Promoteur p,JFrame f)throws NullPointerException {
		
		this.addObservateur( (Observateur) f);
		Vecteur2D v=new Vecteur2D();
		try{
		try {
			System.out.println("je suis dans getid()");
			System.out.println(p.getdn());
			String nom=p.getnom();
			String prenom =p.getprenom();
			String dn= p.getdn();
			
			ResultSet R0 ;
			PreparedStatement pst ;
			String t = null ; 
			pst = connect.prepareStatement("  select etat,matricule from promoteurs01 where nom = ? and prenom= ? and dn=? ");
				
		pst.setString(1,p.getnom());
		pst.setString(2,p.getprenom());
		pst.setString(3,p.getdn());
		
		R0=pst.executeQuery() ;                                                             
        	while(R0.next()){  
              System.out.println("+++++"+R0.getString("etat")+"--------------");
          System.out.println("+++++"+R0.getInt("matricule")+"--------------");
                  v.setX(R0.getInt("matricule"));   
                  v.setY(R0.getString("etat"));
                  System.out.println(v.getY()+"est la valeur de l'etat");
                  this.updateObservateur4(v.getX(),v.getY());
           }}
		catch (SQLException e) {
         e.printStackTrace();
         this.updateObservateur();
         /*je doit effacer e.printStackTrace() et la remplacer avec une fenetre qui va afficher un message de:"ce promoteur n'existe pas"*/ 
  }
		}
		catch(NullPointerException e12){
			this.updateObservateur();
		}
		return v;
	}
	
	/*public void rendreEligible(Promoter promoteur,String session,String dateSession,JFrame f){
		
		System.out.println("je suis dans rendreEligible");
		System.out.println(promoteur.getnom()+"je suis dans rendre eligible");
		Vecteur2D w =new Vecteur2D();
		w =this.getId(promoteur,f) ;
		System.out.println(w.getY());
		
		if ((w.getX()!= 0)&(w.getY()!="INSCRIT")){
			 System.out.println("********+++++"+w.getX()+"--------------********");
			this.creerEligibliteDao().change( w.getX(),session,dateSession);
			this.changeEtat(w.getX());
		}
	}*/
	
	public void rendreEligible(Promoteur promoteur,String NumSession,String dateSession,String decision,String motif,JFrame f)throws NullPointerException{
		try{	System.out.println("je suis dans l'op rendreEligible de promoteurDao");
			System.out.println(promoteur.getnom()+"je suis dans rendre eligible");
			Vecteur2D w =new Vecteur2D();
			w =this.getId(promoteur,f) ;
			System.out.println("ooooooooooooooooooooo"+w.getY());
			
			if ((w.getX()!=0)&(w.getY().equals("INSCRIT"))){
				this.creerEligibliteDao().change( w.getX(),NumSession,dateSession,decision,motif,f);
			}
			else System.out.println("*********j'ai pas rendu eligibile ce promoteur***********");
		}
		catch(NullPointerException e124){
			JOptionPane.showConfirmDialog(null,
					"Ce promoteur n'existe pas............  ",
					"Juste un test",
					JOptionPane.PLAIN_MESSAGE);
			}
		}
	

	public EligibiliteDao creerEligibliteDao(){
		EligibiliteDao eligibilitedao =  new EligibiliteDao(connection.getInstance());
		return eligibilitedao;
	}
	
	public void changeEtat(int id){
		PreparedStatement st1 = null ;
		try {
			st1 = connect.prepareStatement("update promoteurs01 set etat = 'ELIGIBLE' where MATRICULE = ? ") ;
    		st1.setInt(1,id);
    		
    		st1.executeUpdate();
	    } 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("impossible de se connecter wa salim");
	    		}
	}
	
	 public void updateObservateur4(int i,String j) {
		  for(Observateur obs : this.listObservateur )
				obs.update4(i,j);}
	public void updateObservateur() {
		// TODO Auto-generated method stub
		System.out.println("&&&&&&&&&&&&&&&akmoussssssssss&&&&&&&&&&&&&&&1");
		 for(Observateur obs : this.listObservateur ){
			 System.out.println("&&&&&&&&&&&&&&&akmoussssssssss&&&&&&&&&&&&&&&2");
		 }
			 
	}



	

 }




