package lesAutreCas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import domaine.Eligibilite.Vecteur2D;
import domaine.Commun.*;
import donneePersistante.Connection.*;
public class Entreprise {
	public Entreprise(){}
	
	public void affecterEntreprise(Vector<String> v,JFrame f)throws NullPointerException{
		Promoteur p = new Promoteur(v.elementAt(0),v.elementAt(1),v.elementAt(2));
		Vecteur2D b = new Vecteur2D();
		try{
		b=this.getId(p, f);
		if(b.getX()!=0 & b.getY().equals("eligible")){
			this.entrerEntreprise(v.elementAt(3),v.elementAt(4),v.elementAt(5),v.elementAt(6),b.getX());
		}}
		
		catch(NullPointerException e25){
			JOptionPane.showConfirmDialog(null,
					"Ce promoteur n'existe pas  ",
					"Juste un test",
					JOptionPane.PLAIN_MESSAGE);
			}
		
	}
	
	public Vecteur2D getId(Promoteur p,JFrame f){
		
		Vecteur2D v=new Vecteur2D();
		try {
			System.out.println("je suis dans getid()");
			System.out.println(p.getdn());
			String nom=p.getnom();
			String prenom =p.getprenom();
			String dn= p.getdn();
			
			ResultSet R0 ;
			PreparedStatement pst ;
			String t = null ; 
			System.out.println("salut lyes");
			pst = connection.getInstance().prepareStatement("  select matricule,etat from promoteurs01 where nom = ? and prenom= ? and dn=? ");
				
		pst.setString(1,p.getnom());
		pst.setString(2,p.getprenom());
		pst.setString(3,p.getdn());
		
		R0=pst.executeQuery() ;                                                             
          while(R0.next()){
        	  System.out.println("+++++"+R0.getInt("matricule")+"--------------999999999999999");
    	     
                  int g=R0.getInt("matricule");
                  String s=R0.getString("etat");
                  System.out.println(s+"est la valeur de l'etat"+g+"est la valeur de matricule9999999999999999");
                  v.setX(g);   
                  v.setY(s);
                  System.out.println(v.getY()+"est la valeur de l'etat");
           }}
		catch (SQLException e000781) {
			System.out.println("9999999999 ce promoteur n'exixste pas9999999999999999");
			
         /*je doit effacer e.printStackTrace() et la remplacer avec une fenetre qui va afficher un message de:"ce promoteur n'existe pas"*/ 
               }
		catch(NullPointerException e010){System.out.println("ih je suis ds l'exception de getId() du prmoteudao");}
		return v;
	}
	
	public void entrerEntreprise(String nom,String activite,String forme,String NumStatut,int id){
            try {
			
			PreparedStatement st = null ;
			
			st = connection.getInstance().prepareStatement("insert into entreprise values (?,?,?,?,?)");
			st.setString(1, nom);
    		st.setString(2, activite);
    		st.setString(3, forme);
    		st.setString(4, NumStatut);
    		st.setInt(5, id);
    		int r = st.executeUpdate() ;
    	
    		System.out.println("l'observateur ca marche?");
			
			/*java.sql.Statement stt = connect.createStatement();
			 stt.executeUpdate("insert into eligiblite values(session,dateSession,'boutef','tresbien',id)");*/
					 
		} 
		catch (SQLException e) {
			
			System.out.println("ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
			e.printStackTrace();
		}
		catch(NullPointerException e00){System.out.println("ihhhhhhhhhhhhhhhh98888898535hhhhhhhhhhhhhhhhhh");}
	}

	
	

}
