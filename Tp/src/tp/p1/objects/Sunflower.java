
package tp.p1.objects;


public class Sunflower extends Plants{
	

	public Sunflower(int x, int y) {
		super(x, y, 1);
		setPlantName("S");
		setCost(20);
		setHarm(0);
	}
	public Sunflower() {
		super(-1, -1, 0);
	}
	

}

