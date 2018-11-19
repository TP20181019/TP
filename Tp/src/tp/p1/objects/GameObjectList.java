package tp.p1.objects;


public class GameObjectList {
	
	private GameObject [] listGameObject;
	private int tam = 4*8;
	private int stack;
	
	public GameObjectList () {
		this.listGameObject = new GameObject[tam];
		for(int i= 0; i < tam; i++)
			listGameObject[i] = null;
		this.stack = 0;
	}
	
	public GameObject existInList(int x, int y) {
		int i = 0;
		GameObject object = null;
		boolean encuentra = false;
		while(!encuentra && i < this.stack) {
			if(this.listGameObject[i].getX() == x
					&& this.listGameObject[i].getY() == y) {
				encuentra = true;
				object = this.listGameObject[i];
			}
			i++;
		}
		return object;
	}
	public void add (GameObject object) {
		this.listGameObject[this.stack] = object;
		this.stack = this.stack + 1;
		
	}
	
	
}
