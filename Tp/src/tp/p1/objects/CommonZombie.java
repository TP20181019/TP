package tp.p1.objects;

public class CommonZombie extends Zombie{
	//private String zombieName;
	
	public CommonZombie(int x, int y, String zombieName) {
		super(x,y);
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
