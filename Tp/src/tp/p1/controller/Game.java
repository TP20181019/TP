/**
 * 
 */
package tp.p1.controller;

import java.util.Random;

import tp.p1.command.Command;
import tp.p1.logic.Board;
import tp.p1.logic.BoardPrinter;
import tp.p1.logic.DebugPrinter;
import tp.p1.logic.GamePrinter;
import tp.p1.logic.ReleasePrinter;
import tp.p1.logic.SuncoinManager;
import tp.p1.logic.ZombieManager;
import tp.p1.objects.Plant;
import tp.p1.objects.Zombie;
import tp.p1.objects.ZombieFactory;

/**
 * @author Michelle
 *
 */
public class Game {
	private Integer cycleCount;
	private ZombieManager zombieManager;
	private SuncoinManager suncoins;
	private Level level;
	private Board board;
	private int dimX = 4;
	private int dimY = 8;
	private Random rand;
	private boolean end;
	private int winner = 0; //0 = jugador, 1 = zombie, 3 = nadie


	/**
	 * 
	 */
	public Game(Random rand, Level level) {
		this.cycleCount = 0;
		this.zombieManager = new ZombieManager(level, rand);
		this.suncoins = new SuncoinManager();
		this.level = level;
		this.board = new Board();
		this.rand = rand;
		this.end = false;
	}
	
	public void update() {
		suncoins.setSuncoins(suncoins.getSuncoins() + board.suncoinsAdd());
		board.updatePlants();
		board.updateZombies();
		board.plantsAttack();
		board.zombiesAttack();
		this.addZombie();
		cycleCount++;
	}
	
	private void addZombie() {
		String[] nameZombies = { "commonzombie", "sportyzombie", "bucketheadzombie"};
		if(zombieManager.isZombieAdded()) {
			int n = rand.nextInt(3);
			int x = rand.nextInt(4);
			Zombie z = ZombieFactory.getZombie(nameZombies[n], x, 7);
			board.addZombie(z);
		}
	}

	public String toString() {
		String line;
		line = "Number of cycles: " + this.getCycleCount()+ "\n" + 
		"Sun coins: " + this.suncoins.getSuncoins() +"\n" + 
		"Remaining zombies: " + this.zombieManager.getZombiesLeftToAppear() +"\n"; 
		return line;
		
	}
	
	/**
	 * Añade una planta desde facotry??
	 */
	
	public boolean addPlant(Plant plant,int x, int y) {
		boolean ret;
		if (x >= dimX || y >= dimY - 1) {
			ret = false;
		}
		else if(plant.getCost() < suncoins.getSuncoins()){
			if(this.board.addPlant(plant))
				ret = true;
			else ret = false;
		}
		else ret = false;
		return ret;
	}
	
	public void help() {
		System.out.println("Add <plant> <x> <y>: Adds a plant in position x, y." + System.lineSeparator() +
				"List: Prints the list of available plants." + System.lineSeparator() +
				"Reset: Starts a new game." + System.lineSeparator() +
				"Help: Prints this help message." + System.lineSeparator() +
				"Exit: Terminates the program." + System.lineSeparator() +
				"[none]: Skips cycle." + System.lineSeparator());
	}

	public void print(String mode) {
		BoardPrinter b = null;
		if(mode.equalsIgnoreCase("RELEASE")) {
			this.dimX = 4;
			this.dimY = 8;
			b = new ReleasePrinter(dimX, dimY);
		}
		else if(mode.equalsIgnoreCase("DEBUG")) {
			dimX = 1;
			dimY = board.getStackPlantas() + board.getStackZombies();
			b = new DebugPrinter(dimX, dimY);
		}
		System.out.println(b.printGame(this));
		
	}
	
	public boolean isFinished()  {
		// gana el jugador
		if(this.zombieManager.getZombiesLeftToAppear() == 0 && board.getStackZombies() == 0){
			this.end = true;
			this.winner = 0;
		}
		//gana zombies
		else if ((this.zombieManager.getZombiesLeftToAppear() < 5) && board.ZombiesWin()) {
				this.end = true;
				this.winner = 2;
		}
		return this.end;
	}
	
	public int getWinner() {
		return winner;
	}

	public void setWinner(int winner) {
		this.winner = winner;
	}
	
	public Integer getCycleCount() {
		return cycleCount;
	}
	
	public void setCycleCount(Integer cycleCount) {
		this.cycleCount = cycleCount;
	}
	
	
	public void setEnd(boolean end) {
		this.end = end;
	}

	public void reset() {
		this.cycleCount = 0;;
		
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	
	public Random getRand() {
		return rand;
	}
	
	public void setRand(Random rand) {
		this.rand = rand;
	}
	
	public int getDimX() {
		return dimX;
	}

	public void setDimX(int dimX) {
		this.dimX = dimX;
	}

	public int getDimY() {
		return dimY;
	}

	public void setDimY(int dimY) {
		this.dimY = dimY;
	}

	public Board getBoard() {
		return board;
	}


	

}
