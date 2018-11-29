
package tp.p1.objects;

public class Peashooter extends Plants{
	
	
	public Peashooter (int x, int y) {
		super (x,y, 3);
		setPlantName("P");
		setCost(50);
		setHarm(1);		
	}
	
	public Peashooter() {
		super(-1, -1, 0);
	}


	public boolean aparecer (){
		return false;
		
		
	}
}
