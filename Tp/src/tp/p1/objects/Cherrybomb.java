package tp.p1.objects;

public class Cherrybomb extends Plants {

	public Cherrybomb(int x, int y) {
		super(x, y, 2, "C");
		setCost(50);
		setHarm(10);
		
	}
	public Cherrybomb() {
		super(-1, -1, 0, "C");
	}

}
