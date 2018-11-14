/**
 * 
 */
package tp.p1.plants;

/**
 * @author Michelle
 *
 */
public class Sunflower extends Plants{
	private String name;
	private String infoPlant;
	private int cost;
	
	public Sunflower(int x, int y, int vida, String infoPlant) {
		super(x, y, vida);
		this.name = "sunflower";
		this.infoPlant = infoPlant;
		this.cost = 20;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfoPlant() {
		return infoPlant;
	}

	public void setInfoPlant(String infoPlant) {
		this.infoPlant = infoPlant;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}

