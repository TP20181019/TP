package tp.p1.objects;

public abstract class GameObject {
	protected int x;
	protected int y;
	protected int vida;
	

	private int cycle;
	
	public GameObject (int x, int y, int vida) {
		
		this.x = x;
		this.y = y;
		this.vida = vida;
		this.setCycle(1);
	
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
	public int getVida() {
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

}
