/**
 * 
 */
package tp.p1.lists;

import tp.p1.plants.Peashooter;

/**
 * @author Michelle
 *
 */
public class PeashooterList {
	private Peashooter[] listPeashooter;
	private int tam = 4*8;
	private int stack;

	/**
	 * 
	 */
	public PeashooterList() {
		this.listPeashooter = new Peashooter[tam];
		for(int i = 0; i < tam; i++)
			listPeashooter[i] = null;
		this.stack = 0;
	}
	
	
	public Peashooter existInList(int x, int y) {
		int i = 0;
		Peashooter ps = null;
		boolean encuentra = false;
		while(!encuentra && i < this.stack) {
			if(this.listPeashooter[i].getX() == x
					&& this.listPeashooter[i].getY() == y) {
				encuentra = true;
				ps = this.listPeashooter[i];
			}
			i++;
		}
		return ps;
	}
	
	public void add (Peashooter ps) {
		this.listPeashooter[this.stack ] = ps;
		this.stack = this.stack + 1;
	}
	
	public Peashooter ps (int i) {
		this.listPeashooter[i].setCycle(this.listPeashooter[i].getCycle() + 1);
		return this.listPeashooter[i];
	}

	public int getStack() {
		return stack;
	}
	public void  updateToList(int x, int y) {
		int i = 0;
		boolean encuentra = false;
		while(!encuentra && i < this.stack) {
			if(this.listPeashooter[i].getX() == x
					&& this.listPeashooter[i].getY() == y) {
				encuentra = true;
				this.listPeashooter[i].setVida(this.listPeashooter[i].getVida() - 1);
				if(this.listPeashooter[i].getVida() == 0) {
					for(int j = i; j < this.stack; j++ )
						this.listPeashooter[j] = this.listPeashooter[j + 1];
					this.setStack(this.getStack() - 1);
				}
			}
			i++;
		}
	}


	public void setStack(int stack) {
		this.stack = stack;
		
	}

}
