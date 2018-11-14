/**
 * 
 */
package tp.p1.plants;

/**
 * @author Michelle
 *
 */
public class Peashooter extends Plants{
	
	private int hurt;
	
	public Peashooter(int x, int y, int vida, int hurt) {
		super (x,y,vida);
		
	}

	public int getHurt() {
		return hurt;
	}

	public void setHurt(int hurt) {
		this.hurt = hurt;
	}
	public boolean aparecer (){
		return false;
		
		
	}
}
