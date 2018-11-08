/**
 * 
 */
package tp.p1.controller;

import java.util.Random;

import tp.p1.lists.PeashooterList;
import tp.p1.lists.SunflowerList;
import tp.p1.lists.ZombieList;
import tp.p1.logic.Level;
import tp.p1.logic.SuncoinManager;
import tp.p1.logic.ZombieManager;
import tp.p1.objects.Zombie;
import tp.p1.plants.Peashooter;
import tp.p1.plants.Sunflower;

/**
 * @author Michelle
 *
 */
public class Game {
	private PeashooterList peashooterList;
	private SunflowerList sunflowerList;
	private ZombieList zombieList;
	private Integer cycleCount;
	private ZombieManager zombieManager;
	private SuncoinManager suncoins;
	private Level level;
	
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
		this.peashooterList = new PeashooterList();
		this.sunflowerList = new SunflowerList();
		this.zombieList = new ZombieList();
		this.level = level;
		this.zombieManager = new ZombieManager(level, rand);
		this.suncoins = new SuncoinManager();
		this.rand = rand;
		this.end = false;
	}
	
	public void update(Integer count) {
		this.setCycleCount(count);
		for(int i = 0; i < this.sunflowerList.getStack(); i++) {
			Sunflower sf = this.sunflowerList.sf(i);
			//añado soles;
			this.suncoins.sumaSuncoins(sf);
		}
		for (int i = 0; i < this.peashooterList.getStack(); i++) {
			Peashooter ps = this.peashooterList.ps(i);
			//resto vida al zombie que tenga cerca misma fila desde esa y;
			int j = ps.getY() + 1;
			boolean lanza = false;
			while(j < 8 && !lanza) {
				if(this.zombieList.existInList(ps.getX(), j) != null) {
					lanza = true;
					this.zombieList.updateToList(ps.getX(), j);
					if(this.zombieManager.getZombiesLeftToAppear() == 0 && this.zombieList.getStack() == 0){
						this.end = true;
						this.winner = 0;
					}
				}
				j++;
			}
		}
		for(int i = 0; i < this.zombieList.getStack(); i++) {
			Zombie z = this.zombieList.z(i);
			//resto vida a la planta que este a mi izq. y me muevo si me toca
			if(this.peashooterList.existInList(z.getX(), z.getY() - 1)!= null) {
				//como lanzaguisantes
				this.peashooterList.updateToList(z.getX(), z.getY() - 1);
			}
			else if(this.sunflowerList.existInList(z.getX(), z.getY() - 1)!= null) {
				//como girasol
				this.sunflowerList.updateToList(z.getX(), z.getY() - 1);
			}
			else {// no hay nada, puedo moverme
				if (z.getCycle()%2 == 0 && this.zombieList.existInList(z.getX(), z.getY() - 1) == null) {
					this.zombieList.zombieMove(i);
					
				}
			}
			if(z.getY() == 0) {
				this.end = true;
				this.winner = 1;
			}
		}
		if(!end) {
				
			int x = rand.nextInt(4);
			int y = 7;
			Zombie z = new Zombie(x, y, 5);
			this.addZombie(z);
		}
	}
	
	public String toString() {
		String line;
		line = "Number of cycles: " + this.getCycleCount()+ "\n" + 
		"Sun coins: " + this.suncoins.getSuncoins() +"\n" + 
		"Remaining zombies: " + this.zombieManager.getZombiesLeftToAppear() +"\n"; 
		return line;
		
	}
	public void addSunflower(Sunflower sf) {
		if(this.sunflowerList.existInList(sf.getX(),sf.getY()) == null
				&& this.suncoins.getSuncoins() >= 20) {
			this.sunflowerList.add(sf);
			this.suncoins.setSuncoins(this.suncoins.getSuncoins() - 10);
		}
	}
	public void addPeashooter(Peashooter ps) {
		if(this.peashooterList.existInList(ps.getX(), ps.getY())== null
				&& this.suncoins.getSuncoins() >= 50) {
			this.peashooterList.add(ps);
			this.suncoins.setSuncoins(this.suncoins.getSuncoins() - 50);
		}
	}

	public void addZombie(Zombie z) {
		if(this.zombieList.existInList(z.getX(), z.getY()) == null
				&&this.zombieManager.isZombieAdded())
			this.zombieList.add(z);
	}
	
	public PeashooterList getPeashooterList() {
		return peashooterList;
	}
	public void setPeashooterList(PeashooterList peashooterList) {
		this.peashooterList = peashooterList;
	}
	public SunflowerList getSunflowerList() {
		return sunflowerList;
	}
	public void setSunflowerList(SunflowerList sunflowerList) {
		this.sunflowerList = sunflowerList;
	}
	public ZombieList getZombieList() {
		return zombieList;
	}
	public void setZombieList(ZombieList zombieList) {
		this.zombieList = zombieList;
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

	/*
	public void reset() {
		// TODO Auto-generated method stub
		this.cycleCount = 0;
		this.peashooterList = new PeashooterList();
		this.sunflowerList = new SunflowerList();
		this.zombieList = new ZombieList();
		
	}
*/
	public void showList() {
		// TODO Auto-generated method stub
		System.out.println("[S]unflower: Cost: 20 suncoins Harm: 0" + System.lineSeparator() + 
				"[P]eashooter: Cost: 50 suncoins Harm: 1");
		
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
	

}
