package tp.p1.objects;

public abstract class GameObject {
	protected int x;
	protected int y;
	protected String name;
	private int cycle;
	
	public GameObject (int x, int y, String name) {
		
		this.x = x;
		this.y = y;
		this.setCycle(0);
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

	public abstract String getInfo();

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

	public abstract int getLife();
	public abstract void setLife(int i);
	public abstract String toString ();
	public abstract String toStringDebug();
	public abstract void update();



}
