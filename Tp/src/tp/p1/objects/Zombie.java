
package tp.p1.objects;

public abstract class Zombie extends GameObject{
	
	private int harm;
	private String zombieName;
	private int life;
	
	public Zombie(int x, int y) {
		super (x,y);
		setHarm(1);
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
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
}
