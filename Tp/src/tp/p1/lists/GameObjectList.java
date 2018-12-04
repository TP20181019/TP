/**
 * 
 */
package tp.p1.lists;

import tp.p1.objects.GameObject;

/**
 * @author Michelle
 *
 */
public class GameObjectList {
	private GameObject[] list;
	private int tam = 4*8;
	private int stack;

	/**
	 * 
	 */
	public GameObjectList() {
		this.list = new GameObject[tam];
		for(int i = 0; i < tam; i++)
			list[i] = null;
		this.stack = 0;
	}
	
	
	public GameObject existInList(int x, int y) {
		int i = 0;
		GameObject ps = null;
		boolean encuentra = false;
		while(!encuentra && i < this.stack) {
			if(this.list[i].getX() == x
					&& this.list[i].getY() == y) {
				encuentra = true;
				ps = this.list[i];
			}
			i++;
		}
		return ps;
	}
	
	public void add (GameObject p) {
		// aumenta el tama�o si llega al tope de la lista
				if(this.stack == this.tam - 1) {
					this.tam = this.tam*2;
				}
		this.list[this.stack ] = p;
		this.stack = this.stack + 1;
	}
	

	public int getStack() {
		return stack;
	}
	public void  updateToList(int x, int y) {
		int i = 0;
		boolean encuentra = false;
		while(!encuentra && i < this.stack) {
			if(this.list[i].getX() == x
					&& this.list[i].getY() == y) {
				encuentra = true;
				this.list[i].setVida(this.list[i].getLife() - 1);
				if(this.list[i].getLife() == 0) {
					for(int j = i; j < this.stack; j++ )
						this.list[j] = this.list[j + 1];
					this.setStack(this.getStack() - 1);
				}
			}
			i++;
		}
	}


	public void setStack(int stack) {
		this.stack = stack;
		
	}


	public void delete(GameObject p) {
		int i = 0; 
		boolean encontrado = false;
		while(i < this.stack && !encontrado) {
			if(this.list[i] == p) {
				for(int j = i; j < this.stack - 1; j++) {
					this.list[j] = this.list[j + 1];
				}
				this.stack--;
			}
		}
	}

}
