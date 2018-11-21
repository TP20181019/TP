
package tp.p1.objects;

public class Peashooter extends Plants{
	
	
	public Peashooter (int x, int y) {
		super (x,y);
		setPlantName("P");
		setCost(50);
		setHarm(1);
		setLife(3);
		
	}


	public boolean aparecer (){
		return false;
		
		
	}
}
