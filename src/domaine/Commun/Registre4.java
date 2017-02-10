package domaine.Commun;
import java.util.Vector;

import javax.swing.JFrame;

import domaine.authentification.User;

public class Registre4 {
	/**
	 * @uml.property  name="u"
	 * @uml.associationEnd  
	 */
	private User u;
	/**
	 * @uml.property  name="f"
	 * @uml.associationEnd  
	 */
	private User f;
	public Registre4(){}

	public void authentifier(String st1, String st2,JFrame f)  {
		u =new User(st1,st2);
		u.authentif(f);
		
	}
	public void creerUtilisateur(String s){
		this.f= new User(s,"r");
		System.out.println("salut lyes0000000000000000    "+u.pass);
	}
	public void changePwd(Vector v,JFrame g){
		System.out.println("§§§§§§§§§§§§"+v.elementAt(0)+"      ici");
		this.f.set(v,g);
	}

}
