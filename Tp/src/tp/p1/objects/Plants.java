package tp.p1.objects;

public abstract class Plants extends GameObject{
	
	private int cost;
	private int harm;
	
	
	public Plants(int x, int y, int vida, String name) {
		super(x, y, vida, name);
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void setHarm (int harm) {
		this.harm = harm;
	}
	
	public int getHarm() {
		return harm;
	}
	
	public int getLife() {
		return this.getLife();
	}
}

