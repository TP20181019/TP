package tp.p1.objects;

public class CommonZombie extends Zombie{
	
	
	public CommonZombie(int x, int y, int vida, String zombieName) {
		super(x,y, vida, zombieName );
	}

	@Override
	public String toString() {
		return  new String ("Z["+ getLife() +"]");	
	}

	@Override
	public String toStringDebug() {
		return new String("Z[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 2 + "]");
	}

}
