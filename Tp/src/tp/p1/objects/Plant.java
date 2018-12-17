package tp.p1.objects;

public abstract class Plant extends GameObject{
	
	private int cost;
	private int harm;
	private int life;
	

	public Plant(int x, int y, String name) {
		super(x, y, name);
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
		return life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public String getInfo() {
		return this.getName() + ": " + "Cost: "+ this.cost + " suncoins  Harm: " + this.harm;
	}
	
	public void update() {
		this.setCycle(this.getCycle() + 1);
	}

	public abstract Plant parse(String plantName, int x, int y);
}

