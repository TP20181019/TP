
package tp.p1.objects;

public class Peashooter extends Plants{
	
	
	public Peashooter (int x, int y) {
		super (x,y, 3, "P");
		setCost(50);
		setHarm(1);		
	}
	
	public Peashooter() {
		super(-1, -1, 0, "P");
	}
	public boolean aparecer (){
		return false;		
	}
	
	public String  toString () {
		return  new String ("P["+ getLife() +"]");	
	}

	@Override
	public String toStringDebug() {
		return new String("P[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 1 + "]");
	}
}
