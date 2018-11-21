package tp.p1.objects;

public class ZombieFactory {
	
	private Zombie avilableZombies;
	
	public ZombieFactory() {
		
	}
	private static Zombie [] availableZombie = {
			
			new CommonZombie();
			//new BucketheadZombie();
			//new SportyZombie();
	
	public static Zombie getZombie (String zombieName) {
		Zombie Z;
		//this.zombieName = getZombieName(zombieName);
		
		return Z;
		
	}
	
	public Zombie getZombie() {
		return null;
		
	}
	
	public static String infoAvailableZombies() {
		return null;
		
		
	}

}
