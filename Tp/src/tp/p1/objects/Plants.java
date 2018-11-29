package tp.p1.objects;

public abstract class Plants extends GameObject{
	
	private int cost;
	private String plantName;
	private int harm;
	//private static int life;
	
	
	public Plants(int x, int y, int vida) {
		super(x, y, vida);
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
		return 0;
	}
}

