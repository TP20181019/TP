
package tp.p1.objects;


public class Sunflower extends Plants{
	

	public Sunflower(int x, int y) {
		super(x, y, 1, "S");
		setCost(20);
		setHarm(0);
	}
	public Sunflower() {
		super(-1, -1, 0, "S");
	}
	public String  toString () {
		return  new String ("S["+ getLife() +"]");	
	}
	@Override
	public String toStringDebug() {
		return new String("S[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 3 + "]");
	}

}

