package tp.p1.objects;

public class Wallnut extends Plants {

	public Wallnut(int x, int y) {
		super(x, y, 10, "N");
		
	}
	public Wallnut() {
		super(-1, -1, 0, "N");
	}
	@Override
	public String toString() {
		return  new String ("N["+ getLife() +"]");	
	}
	@Override
	public String toStringDebug() {
		return new String("P[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 10 + "]");
	}
}
