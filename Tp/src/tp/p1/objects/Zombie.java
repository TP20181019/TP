
package tp.p1.objects;

public abstract class Zombie extends GameObject{
	
	private int harm;
	
	public Zombie(int x, int y, int vida, String name) {
		super (x,y, vida, name);
		setHarm(1);
	}
	public Zombie() {
		super(-1, -1, 0, "Z");
	}
	
	
	public void update() {
		
	}
	public int getHarm() {
		return harm;
	}
	public void setHarm(int harm) {
		this.harm = harm;
	}
}
