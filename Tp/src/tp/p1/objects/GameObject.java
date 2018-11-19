package tp.p1.objects;

public abstract class GameObject {
	protected int x;
	protected int y;
	
	public GameObject (int x, int y) {
		// TODO Auto-generated constructor stub
		
		this.x = x;
		this.y = y;
	
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
		
	}
	public String getInfo() {
		return null;
		
	}

}
