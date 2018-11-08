/**
 * 
 */
package tp.p1.logic;

import tp.p1.plants.Sunflower;

/**
 * @author Michelle
 *
 */
public class SuncoinManager {
	private Integer suncoins;
	/**
	 * 
	 */
	public SuncoinManager() {
		this.suncoins = 50;
	}
	public void sumaSuncoins(Sunflower sf) {
		if (sf.getCycle()%2 == 0)
			this.setSuncoins(this.suncoins + 10);
	}
	public Integer getSuncoins() {
		return suncoins;
	}
	public void setSuncoins(Integer suncoins) {
		this.suncoins = suncoins;
	}

}
