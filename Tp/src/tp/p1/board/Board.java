package tp.p1.board;

import tp.p1.objects.Plants;
import tp.p1.objects.Zombie;

public class Board {
	private Plants [] listPlants;
	private Zombie [] listZombie;
	private int tam = 4*8;
	private int stackP;
	private int stackZ;
	
	public Board() {
		
		this.listPlants = new Plants[tam];
		for (int i=0; i<tam; ++i)
			listPlants[i] = null;
		this.setStackP(0);
		
		this.listZombie = new Zombie[tam];
		for (int i=0; i<tam; ++i)
			listZombie[i] = null;
		this.setStackZ(0);
	}

	public int getStackZ() {
		return stackZ;
	}

	public void setStackZ(int stackZ) {
		this.stackZ = stackZ;
	}

	public int getStackP() {
		return stackP;
	}

	public void setStackP(int stackP) {
		this.stackP = stackP;
	}
	
	
	//lista de plantas y zombies
	
}
