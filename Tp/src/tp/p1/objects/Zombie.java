
package tp.p1.objects;

public abstract class Zombie extends GameObject{
	
	private int harm;
	private int life;
	private int speed;
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

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
	
	public int getHarm() {
		return harm;
	}
	
	public void setHarm(int harm) {
		this.harm = harm;
	}
	
	public int getLife() {
		return life;
	}
	
	public String getInfo() {
		return this.name + ": speed: " + this.getSpeed() + "  Harm: " + this.getHarm() + "  Life: " + this.getLife();
	}
	
	@Override
	public void update() {
		this.setCycle(this.getCycle() + 1);
	}
	
	public void zombieMove() {
		this.setY(this.getY() - 1);
	}
	
	public abstract Zombie parse(String zombieName, int x, int y);
	
}
