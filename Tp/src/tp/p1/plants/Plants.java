package tp.p1.plants;

public class Plants {
	
	private int x;
	private int y;
	private int vida;
	private int cycle; 

	public Plants(int x, int y, int vida) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.vida = vida;
		this.cycle = 0;
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
}

