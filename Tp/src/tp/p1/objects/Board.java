package tp.p1.objects;

import tp.p1.lists.GameObjectList;

public class Board {
	private GameObjectList listPlants;
	private GameObjectList listZombies;
	
	
	public GameObjectList getListPlants() {
		return listPlants;
	}

	public void setListPlants(GameObjectList listPlants) {
		this.listPlants = listPlants;
	}

	public GameObjectList getListZombies() {
		return listZombies;
	}

	public void setListZombies(GameObjectList listZombies) {
		this.listZombies = listZombies;
	}
	
	public Board() {
		
		this.listPlants = new GameObjectList();
		this.listZombies = new GameObjectList();
	}

	public void addPlant(GameObject p) {
		listPlants.add(p);
	}
	
	public void addZombie(GameObject z) {
		listZombies.add(z);
	}
	public void deletePlant(GameObject p) {
		listPlants.delete(p);
	}
	public void deleteZombie(GameObject z) {
		listZombies.delete(z);
	}
}
