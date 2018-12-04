package tp.p1.objects;

public class Wallnut extends Plants {

	public Wallnut(int x, int y) {
		super(x, y, 10, "N");
		setCost(50);
		setHarm(0);
		
	}
	public Wallnut() {
		super(-1, -1, 0, "N");
	}
	public String  mostrar () {
		return  new String ("N["+ getLife() +"]");	
	}
}
