package domaine.Eligibilite;

public class Vecteur2D {
	/**
	 * @uml.property  name="x"
	 */
	int x;
	/**
	 * @uml.property  name="y"
	 */
	String y;
	public Vecteur2D(int x,String y){
		this.x=x;
		this.y=y;
	}
	
	public Vecteur2D() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 * @uml.property  name="x"
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * @return
	 * @uml.property  name="y"
	 */
	public String getY(){
		return y;
	}
	/**
	 * @param x
	 * @uml.property  name="x"
	 */
	public void setX(int x){
		this.x=x;
	}
	/**
	 * @param y
	 * @uml.property  name="y"
	 */
	public void setY(String y){
		this.y=y;
	}

}

