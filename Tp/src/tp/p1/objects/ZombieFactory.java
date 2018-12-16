package tp.p1.objects;

public class ZombieFactory {
	
private static Zombie[] availableZombies = {
			
			new CommonZombie(),
			new SportyZombie(),
			new BucketheadZombie()
	};
	
	public static Zombie getZombie(String zombieName, int x, int y){
		Zombie z = null;
		for (Zombie zombie:availableZombies){
			z= zombie.parse(zombieName, x, y);
			if (z!=null) 
				return z;
		}
		return z;
	}
	
	public static String infoAvailableZombies(){
		String s = "";
		for(int i = 0; i < ZombieFactory.availableZombies.length; i++){
			Zombie z = ZombieFactory.availableZombies[i];
			s+= z.getInfo() + System.lineSeparator();
		}
		return s;
	}

}
