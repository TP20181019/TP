/**
 * 
 */
package tp.p1.objects;

/**
 * @author Michelle
 *
 */
public abstract class Zombie {
	private int x;
	private int y;
	/**
	 * 
	 */
	public Zombie(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void update() {
		
	}
}
