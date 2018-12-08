package tp.p1.objects;

public abstract class GameObject {
	protected int x;
	protected int y;
	protected int life;
	protected String name;
	private int cycle;
	
	public GameObject (int x, int y, int life, String name) {
		
		this.x = x;
		this.y = y;
		this.life = life;
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
		return life;
	}

	public void setVida(int vida) {
		this.life = vida;
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
	
	public String toString () {
		
		/*String print = this.name + "["+ this.life + ","+ "vidaTotal" + ",x:"+this.x + 
				",y:" + this.y + ",t:"+this.cycle;*/
		
		return toString();
	}

}
