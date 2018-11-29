
package tp.p1.objects;

public abstract class Zombie extends GameObject{
	
	private int harm;
	private String zombieName;
	//private int life;
	
	public Zombie(int x, int y, int vida) {
		super (x,y, vida);
		setHarm(1);
	}
	public Zombie() {
		super(-1, -1, 0);
	}
	
	
	public void update() {
		
	}
	public String getZombieName() {
		return zombieName;
	}
	public void setZombieName(String zombieName) {
		this.zombieName = zombieName;
	}
	public int getHarm() {
		return harm;
	}
	public void setHarm(int harm) {
		this.harm = harm;
	}
}
