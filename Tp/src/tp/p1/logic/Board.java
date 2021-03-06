package tp.p1.logic;

import tp.p1.lists.GameObjectList;
import tp.p1.objects.GameObject;

public class Board {
	private GameObjectList listPlants;
	private GameObjectList listZombies;
	
public Board() {
		
		this.listPlants = new GameObjectList();
		this.listZombies = new GameObjectList();
	}	

	public boolean addPlant(GameObject p) {
		return listPlants.add(p);
	}
	
	public void addZombie(GameObject p) {
		listZombies.add(p);
	}
	
	public void deletePlant(GameObject p) {
		listPlants.delete(p);
	}
	
	public void deleteZombie(GameObject z) {
		listZombies.delete(z);
	}

	public int getStackPlantas() {
		return listPlants.getStack();
	}

	public int getStackZombies() {
		return listZombies.getStack();
	}

	public GameObject getPlant(int i) {
		return listPlants.getList(i);
	}

	public GameObject getZombie(int i) {
		return listZombies.getList(i);
	}

	public void updatePlants() {
		listPlants.update();
	}

	public void updateZombies() {
		listZombies.update();
		
	}

	public Integer suncoinsAdd() {
		return listPlants.suncoinsPlus();
	}

	public boolean ZombiesWin() {
		return listZombies.zombiesWin();
	}

	public void plantsAttack() {
		listPlants.attack(listZombies);
		
	}

	public void zombiesAttack() {
		listZombies.attack(listPlants);
	}
}
