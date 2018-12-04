package tp.p1.objects;

public abstract class GameObject {
	protected int x;
	protected int y;
	protected int vida;
	protected String name;
	private int cycle;
	
	public GameObject (int x, int y, int vida, String name) {
		
		this.x = x;
		this.y = y;
		this.vida = vida;
		this.setCycle(1);
		this.name = name;
	
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void update() {
		this.cycle++;
	}
	public String getInfo() {
		
		return "x:" + this.x + ",y:" + this.y + ",t:" + this.cycle;
		
	}
	public int getLife() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
