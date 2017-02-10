package domaine.Commun;

import java.util.Vector;

import javax.swing.JFrame;

import domaine.AjouterCo.CopPro;

public class Registre5 {
	
	public Registre5(){}
	
	public void ajouterCoPro(Vector v,JFrame f){
		//System.out.println(v.get(0));
		CopPro cp = new CopPro();
		cp.addCo(v,f);
	}
	

}
