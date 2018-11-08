/**
 * 
 */
package tp.p1.logic;

import java.util.Random;

/**
 * @author Michelle
 *
 */
public class ZombieManager {

	public void setZombiesLeftToAppear(Integer zombiesLeftToAppear) {
		this.zombiesLeftToAppear = zombiesLeftToAppear;
	}

	private Integer zombiesLeftToAppear;
	private Level level;
	private int frecuence;
	private Random rand;
	public ZombieManager(Level level, Random rand) {
		// TODO Auto-generated constructor stub
		if(level == Level.EASY) {
			this.zombiesLeftToAppear = 3;
			frecuence = 10;
		}
		else if (level == Level.HARD) {
			this.zombiesLeftToAppear = 5;
			frecuence = 20;
		}
		else if (level == Level.INSANE) {
			this.zombiesLeftToAppear = 10;
			frecuence = 30;
		}
		this.rand = rand;
	}
	
	/**
	 * @return 
	 */
	public boolean isZombieAdded() {
		// aqui uso el random de probabilidad
		int r = this.rand.nextInt(100);
		boolean addOk;
		if(zombiesLeftToAppear > 0) {
			if(r <= this.frecuence) {
				this.zombiesLeftToAppear = this.zombiesLeftToAppear - 1;
				addOk = true;
			}
			else 
				addOk = false;
		}
		else addOk = false;
		
		return addOk;
	}

	public Integer getZombiesLeftToAppear() {
		return zombiesLeftToAppear;
	}
}
