
package tp.p1.objects;

public abstract class Zombie extends GameObject{
	
	private int harm;
	private int life;
	

	public Zombie(int x, int y, String name) {
		super (x, y, name);
		setHarm(1);
	}
	
	public Zombie() {
		super(-1, -1, "Z");
	}

	public void setLife(int life) {
		this.life = life;
	}

	public void update() {
		
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
	
	public abstract Zombie parse(String zombieName, int x, int y);
	
}
