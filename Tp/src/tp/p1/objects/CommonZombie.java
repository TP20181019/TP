package tp.p1.objects;

public class CommonZombie extends Zombie{
	//private String zombieName;
	
	public CommonZombie(int x, int y, int vida, String zombieName) {
		super(x,y, vida);
		this.setZombieName("Common");
	}
/*
	public String getZombieName() {
		return zombieName;
	}

	public void setZombieName(String zombieName) {
		this.zombieName = zombieName;
	}
	
	*/

}
