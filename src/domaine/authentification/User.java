package domaine.authentification;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;

import donneePersistante.Connection.connection;
import donneePersistante.StockAuthentification.UserDao;
import domaine.Observeur.Observable;
import domaine.Observeur.Observateur;

public class User implements Observable{
	/**
	 * @uml.property  name="user"
	 */
	private String user;
	/**
	 * @uml.property  name="pass"
	 */
	public String pass;
	/**
	 * @uml.property  name="listObservateur"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="domaine.Observeur.Observateur"
	 */
	private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();
	/**
	 * @uml.property  name="listObservateur1"
	 */
	private ArrayList<Observateur> listObservateur1 = new ArrayList<Observateur>();
	
	public User(String user,String pass){
		this.user=user;
		this.pass=pass;
		System.out.println("je suis l'objet user je suis creer");
	}
	
	public void authentif(JFrame f) {
		this.addObservateur((Observateur) f);
		UserDao udao = new UserDao(connection.getInstance());
		String t = udao.av_User(this,f);
		System.out.println("ici2 ici2 **********"+t+"//////////////////////ici2ici2");		
		if (t.equals("ca")){
			f.dispose();
			this.updateObservateur();
		}
		    else {
		    	System.out.println("ce n'ewt pas un ca");
			if (t.equals("Administrateur")){ 
			   f.dispose();
			   this.updateObservateur1();
			}
			else {
				System.out.println("ce n'est pas un administratuer");
				if (t.equals("Directeur")){
				f.dispose();
				this.updateObservateur2();
				}
			  else{
				  this.updateObservateur4(0,null);
				  System.out.println("ici3 ici3 **********"+t+"//////////////////////ici3");}
	}}}
	
	
	/**
	 * @return
	 * @uml.property  name="user"
	 */
	public String getUser(){
		return user;
	}
	/**
	 * @return
	 * @uml.property  name="pass"
	 */
	public String getPass(){
		return pass;
	}
	
	public void set(Vector v,JFrame g){
		this.addObservateur((Observateur) g);
		System.out.println("je suis ds set de user  "+v.elementAt(0)+"   on compare");
		System.out.println("je suis ds set de user  "+this.user+"   s'ayé comparé");
		if(v.elementAt(0).equals(this.user)){
			System.out.println("§§§§§§§§§§§§"+v.elementAt(0)+"je suis ds user.set()");
		UserDao udao = new UserDao(connection.getInstance());
		String d =udao.getPwd(v,g);
		if(d!=null){
			udao.setPwd(v); }
			else {System.out.println("ayho++ya pas cet utilisateur+++++++++++++++++++");
			this.addObservateur((Observateur) g);
			this.updateObservateur2();
			}
		}
		else{ System.out.println("je suis desolé");
		
		this.updateObservateur();
		}
	
	}
	
	

	
	public void addObservateur(Observateur obs) {
		this.listObservateur.add(obs);}
	public void addObservateur1(Observateur obs) {}
	public void delObservateur() {}
	public void updateObservateur() {
		for(Observateur obs : this.listObservateur )
			obs.update();}
	public void updateObservateur1() {
		for(Observateur obs : this.listObservateur )
			obs.update1();}	
	public void updateObservateur2() {
		for(Observateur obs : this.listObservateur )
			obs.update2();}	

	public void updateObservateur4(int i,String s){
		for(Observateur obs : this.listObservateur )
			obs.update4( i, s);
	}
}
