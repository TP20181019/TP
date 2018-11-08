/**
 * 
 */
package tp.p1.lists;

import tp.p1.objects.Zombie;

/**
 * @author Michelle
 *
 */
public class ZombieList {
	private Zombie[] listZombie;
	private int tam = 10; // el tamaño de la lista depende de la dificultad/nivel del juego
	private int stack;

	public int getStack() {
		return stack;
	}

	public void setStack(int stack) {
		this.stack = stack;
	}

	/**
	 * 
	 */
	public ZombieList() {
		this.listZombie = new Zombie[tam];
		for(int i = 0; i < tam; i++)
			listZombie[i] = null;
		this.stack = 0;
	}
	
	public Zombie existInList(int x, int y) {
		int i = 0;
		boolean encuentra = false;
		Zombie z = null;
		while(!encuentra && i < this.stack) {
			if(this.listZombie[i].getX() == x
					&& this.listZombie[i].getY() == y) {
				encuentra = true;
				z = this.listZombie[i];
			}
			i++;
		}
		return z;
	}
	
	public void add (Zombie z) {
		this.listZombie[this.stack] = z;
		this.stack = this.stack + 1;
			
	}
	public Zombie z (int i) {
		this.listZombie[i].setCycle(this.listZombie[i].getCycle()+1);
		return this.listZombie[i];
	}
	public void  updateToList(int x, int y) {
		int i = 0; 
		boolean encontrado = false;
		while(i < this.stack && !encontrado) {
			if(x == this.listZombie[i].getX() && y == this.listZombie[i].getY()){
				encontrado = true;
				this.listZombie[i].setVida(this.listZombie[i].getVida() - 1);
				if(this.listZombie[i].getVida() == 0) {
					for(int j = i; j < this.stack; j++)
						this.listZombie[j] = this.listZombie[j + 1];
					this.setStack(this.stack - 1);
				}
			}
			i++;
		}
	}
	
	public void zombieMove(int i) {
		this.listZombie[i].setY(this.listZombie[i].getY() - 1);
	}


}
