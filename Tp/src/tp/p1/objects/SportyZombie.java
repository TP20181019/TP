package tp.p1.objects;

public class SportyZombie extends Zombie{

	public SportyZombie(int x, int y) {
		super(x, y, 2, "X");
		
	}
	
	public String  toString () {
		return  new String ("X["+ getLife() +"]");	
	}

	@Override
	public String toStringDebug() {
		return new String("X[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 1 + "]");
	}

}
