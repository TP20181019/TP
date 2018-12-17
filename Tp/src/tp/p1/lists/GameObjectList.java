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
	
	
	public boolean existInList(GameObject o) {
		int i = 0;
		boolean encuentra = false;
		while(!encuentra && i < this.stack) {
			if(this.list[i].getX() == o.getX()
					&& this.list[i].getY() == o.getY()) {
				encuentra = true;
			}
			i++;
		}
		return encuentra;
	}
	
	public boolean add (GameObject o) {
		if(this.stack == this.tam - 1) {
			this.tam = this.tam*2;
		}
		if (existInList(o))
			return false;
		else {
			this.list[this.stack ] = o;
			this.stack = this.stack + 1;
			return true;
		}
	}
	

	public int getStack() {
		return stack;
	}
	public void  update() {
		for(int i = 0; i < this.stack; i++)
			list[i].update();
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


	public GameObject getList(int i) {
		return this.list[i];
	}


	public Integer suncoinsPlus() {
		Integer suncoins = 0;
		for (int i = 0; i < this.stack; i++) {
			if(list[i].getName().equalsIgnoreCase("SUNFLOWER"))
				if(list[i].getCycle()% 2 == 0)
					suncoins += 10;
		}
			
		return suncoins;
	}


	public boolean zombiesWin() {
		boolean win = false;
		int i = 0;
		while(i < stack && !win) {
			if(list[i].getY() == 0)
				win = true;
			i++;
		}
		return win;
	}


	public void attack(GameObjectList list) {
		for(int i = 0; i < this.stack; i++) {
			
		}
		
	}


}
 