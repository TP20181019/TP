package tp.p1.objects;

public class Wallnut extends Plants {

	public Wallnut(int x, int y) {
		super(x, y);
		setPlantName("N");
		setCost(50);
		setHarm(0);
		setLife(10);
		
	}
	public void mostrar () {
		String nut = new String ("N["+ getLife() +"]");
				
	}
}
