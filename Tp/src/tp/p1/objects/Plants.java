package tp.p1.objects;

public abstract class Plants extends GameObject{
	
	private int cost;
	private String plantName;
	private int harm;
	private int life;
	
	
	public Plants(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
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

	
	
	
	

	
}

