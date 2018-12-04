/**
 * 
 */
package tp.p1.controller;

import java.util.Random;

import tp.p1.lists.GameObjectList;
import tp.p1.logic.Board;
import tp.p1.logic.SuncoinManager;
import tp.p1.logic.ZombieManager;

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
	
	private Random rand;
	private boolean end;
	private int winner = 0; //0 = jugador, 1 = zombie, 3 = nadie

	public int getWinner() {
		return winner;
	}

	public void setWinner(int winner) {
		this.winner = winner;
	}

	/**
	 * 
	 */
	public Game(Random rand, Level level) {
		this.cycleCount = 0;
		this.level = level;
		this.zombieManager = new ZombieManager(level, rand);
		this.suncoins = new SuncoinManager();
		this.rand = rand;
		this.end = false;
	}
	
	
	
	public void update(Integer count) {
		
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
	
	public void addPlant() {
		;
	}
	public Integer getCycleCount() {
		return cycleCount;
	}
	public void setCycleCount(Integer cycleCount) {
		this.cycleCount = cycleCount;
	}
	
	public boolean isFinished() {
		return this.end;
	}
public void setEnd(boolean end) {
		this.end = end;
	}

	
	public void reset() {
		this.cycleCount = 0;;
		
	}
	public void showList() {
		// TODO Auto-generated method stub
		System.out.println("[S]unflower: Cost: 20 suncoins Harm: 0" + System.lineSeparator() + 
				"[P]eashooter: Cost: 50 suncoins Harm: 1" + System.lineSeparator() +
				"Peta[C]ereza: Cost: 50 suncoins Harm: 10" + System.lineSeparator() +
				"[N]uez: Cost: 50 suncoins Harm: 0" + System.lineSeparator());
		
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
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("Add <plant> <x> <y>: Adds a plant in position x, y." + System.lineSeparator() +
				"List: Prints the list of available plants." + System.lineSeparator() +
				"Reset: Starts a new game." + System.lineSeparator() +
				"Help: Prints this help message." + System.lineSeparator() +
				"Exit: Terminates the program." + System.lineSeparator() +
				"[none]: Skips cycle." + System.lineSeparator());
	}

	public void print(String mode) {
		switch (mode) {
		case "REALESE":
			
			break;
		case "DEBUG": 
			break;
			default: break;
		}
		
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	

}
