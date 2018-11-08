/**
 * 
 */
package tp.p1.lists;

import tp.p1.plants.Sunflower;

/**
 * @author Michelle
 *
 */
public class SunflowerList {
	private Sunflower[] listSunflower;
	private int tam = 4*8;
	private int stack;
	/**
	 * 
	 */
	public SunflowerList() {
		this.listSunflower = new Sunflower[tam];
		for(int i = 0; i < tam; i++)
			listSunflower[i] = null;
		this.stack = 0;
	}

	public Sunflower existInList(int x, int y) {
		int i = 0;
		boolean encuentra = false;
		Sunflower sf = null;
		while(!encuentra && i < this.stack) {
			if(this.listSunflower[i].getX() == x
					&& this.listSunflower[i].getY() == y) {
				encuentra = true;
				sf = this.listSunflower[i];
			}
			i++;
		}
		return sf;
	}
	
	public int getStack() {
		return stack;
	}

	public void setStack(int stack) {
		this.stack = stack;
	}

	public void add (Sunflower sf) {
		this.listSunflower[this.stack] = sf;
		this.stack = this.stack + 1;
		
	}
	public Sunflower sf (int i) {
		this.listSunflower[i].setCycle(this.listSunflower[i].getCycle() + 1);
		return this.listSunflower[i];
	}
	public void  updateToList(int x, int y) {
		int i = 0;
		boolean encuentra = false;
		while(!encuentra && i < this.stack) {
			if(this.listSunflower[i].getX() == x && this.listSunflower[i].getY() == y) {
				encuentra = true;
				this.listSunflower[i].setVida(this.listSunflower[i].getVida() - 1);
				if(this.listSunflower[i].getVida() == 0) {
					for(int j = i; j < this.stack; j++ )
						this.listSunflower[j] = this.listSunflower[j + 1];
					this.setStack(this.getStack() - 1);
				}
			}
			i++;
		}
	}

}
