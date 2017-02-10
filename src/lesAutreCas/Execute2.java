package lesAutreCas;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import presentation.Inscription.FINSCRIPTION4;
import domaine.Commun.Registre1;

public class Execute2 {
	/**
	 * @uml.property  name="registre1"
	 * @uml.associationEnd  readOnly="true"
	 */
	private Registre1 registre1;
	/**
	 * @uml.property  name="driver"
	 */
	private String  driver = "oracle.jdbc.OracleDriver" ;
    /**
	 * @uml.property  name="con"
	 */
    private Connection con= null ;
    
    public String av_user(String s1, String s2)throws SQLException {
		   PreparedStatement pst ;
		   ResultSet R0 ;
		   String t = null ; 
		
			pst = con.prepareStatement("  select type_user from users where nom_user = ? and pass_user= ? ");
				
		pst.setString(1,s1);
		pst.setString(2,s2);
		
	try{	
		R0 = pst.executeQuery() ;
		while (R0.next()){
		t= R0.getString(1);
	
	
		}
		
		return t ;}
	   catch (SQLException e00 ){return ("une erreur ");}
		   }
	
    
   /* public  void inserer_prom (String nom,String prenom,String dn) throws SQLException{
    	int r ;
    	
    	PreparedStatement st = null ;
    	
    	try {
    		st = con.prepareStatement("insert into promoteurs01 (nom,prenom,dn,matricule) values (?,?,?,SQ_PROMOTEURS.NEXTVAL)");
    		st.setString(1, nom);
    		st.setString(2, prenom);
    		st.setString(3, dn);
    		r = st.executeUpdate() ;
    		
        	FINSCRIPTION4 fi4 =new FINSCRIPTION4 (nom,prenom,dn,registre1);
        	  fi4.setVisible(true);
    	}
    	catch (SQLException e0) {
    		// TODO Auto-generated catch block
    		System.out.print("wa ca marche pas");
    		int i ;
    		i = e0.getErrorCode();
    		if (i==1){JOptionPane.showConfirmDialog(null,
    				"Vous ne pouvez pas Inscrire ce promoteur il a dédja un dossier ANSEJ ",
    				"Juste un test",JOptionPane.PLAIN_MESSAGE);
    	}}}


        
        	
      
       
        */

    	public void inserer_promC (Vector liste ) throws SQLException{
    		int s1;
    		PreparedStatement st2= null ;
    		PreparedStatement st1 = null;
    		try {
    			
    		st2 = con.prepareStatement("update promoteurs01 set etat = 'INSCRIT', adresse = ? ,commune = ?,tel = ?,fax = ?,email = ?,S_F = ? ,handicape =?,n_etude =?,EXPERIENCE = ?,specialite = ? where nom = ? and prenom = ?") ;
    		st2.setString(1, (String) liste.elementAt(3));
    		st2.setString(2, (String) liste.elementAt(4));
    		st2.setString(3,(String)liste.elementAt(5));
    		st2.setString(4,(String)liste.elementAt(6));
    		st2.setString(5, (String) liste.elementAt(7));
    		st2.setString(6,(String) liste.elementAt(8) );
    		st2.setString(7, (String) liste.elementAt(9));
    		st2.setString(8, (String) liste.elementAt(10));
    		st2.setString(9, (String) liste.elementAt(11));
    		st2.setString(10, (String) liste.elementAt(12));
    		st2.setString (11,(String)liste.elementAt(0));
    		st2.setString (12,(String)liste.elementAt(1));
    	
    		
    		s1 = st2.executeUpdate() ;
    		System.out.print(s1);
    		}
    		catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}}
    		 public int   creer_user(String  s1 ,String s2,String s3 )throws SQLException {
    			   PreparedStatement pst ;
    			
    			   
    			    int r ;
    				pst = con.prepareStatement(" insert into users (nom_user,pass_user,type_user) values (?,?,?)");
    					
    			pst.setString(1,s1);
    			pst.setString(2,s2);
    			pst.setString(3,s3);

    		try{	
    			
    			r = pst.executeUpdate() ;
    			return r ;
    			}
    			
    		   catch (SQLException e ){
    			   if (e.getErrorCode()==1){return 0 ;}
    			   else {System.out.print(e.getMessage());
    				   return 2 ;}
    			   }}

    	    public int   Supprimer_user(String s1, String s2,String s3)throws SQLException {
    			   PreparedStatement pst ;
    			
    			   
    			    int r ;
    				pst = con.prepareStatement(" delete from users where nom_user = ? and pass_user = ? and type_user = ?");
    					
    			pst.setString(1,s1);
    			pst.setString(2,s2);
    			pst.setString(3,s3);

    		try{	
    			
    			r = pst.executeUpdate() ;
    			return r ;
    			}
    			
    		   catch (SQLException e ){
    			   if (e.getErrorCode()==1){return 0 ;}
    			   else {System.out.print(e.getMessage());
    				   return 2 ;}
    			   }}
    	    public int   modifier_user(String s1, String s2,String s3,String s4)throws SQLException {
    			   PreparedStatement pst ;
    			
    			   
    			    int r ;
    				pst = con.prepareStatement(" update users set pass_user = ?  where nom_user = ? and pass_user = ? and type_user = ?");
    					
    			pst.setString (1,s4);		
    			pst.setString(2,s1);
    			pst.setString(3,s2);
    			pst.setString(4,s3);

    		try{	
    			
    			r = pst.executeUpdate() ;
    			return r ;
    			}
    			
    		   catch (SQLException e ){
    			   if (e.getErrorCode()==1){return 0 ;}
    			   else {System.out.print(e.getMessage());
    				   return 2 ;}
    			   }}	
    		
    		
    	

    	
    public Execute2(){
   	 //charger le driver 
    
   		try {
   			Class.forName(driver);
   			} 
   		catch (ClassNotFoundException e) {
   	         System.out.print("impossible de charger le driver");
   			}
   	// etablir connection
   		try {
   			String DBurl = "jdbc:oracle:thin:@169.254.79.72:1521:TEST";
   			con = DriverManager.getConnection(DBurl,"system","salim");
   			} 
   		catch (SQLException e1) {
   			System.out.println(e1.getMessage());}}}


