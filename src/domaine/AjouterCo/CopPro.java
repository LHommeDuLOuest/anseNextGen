package domaine.AjouterCo;

import java.util.Vector;

import javax.swing.JFrame;

import domaine.Commun.Promoteur;
import domaine.Eligibilite.Vecteur2D;
import donneePersistante.Connection.connection;
import donneePersistante.StockCoPro.CoproDao;
import donneePersistante.StockInscription.PromoteurDao;

public class CopPro {
	
	public void addCo(Vector v,JFrame f){
		Promoteur pr = new Promoteur((String)v.get(0),(String)v.get(1),(String)v.get(2));
		Vecteur2D w =new Vecteur2D();
		PromoteurDao p = new PromoteurDao(connection.getInstance());
		w=p.getId(pr,f);
		if (w.getX()!=0){
			CoproDao cpd =new CoproDao(null);
			cpd.entrerCoPro(v);
		}
	}

}
