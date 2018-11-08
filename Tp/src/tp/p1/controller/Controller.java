/**
 * 
 */
package tp.p1.controller;

import java.util.Scanner;

import tp.p1.logic.GamePrinter;
import tp.p1.plants.Peashooter;
import tp.p1.plants.Sunflower;

/**
 * @author Michelle
 *
 */
public class Controller {
	private Game game;
	private Scanner in = new Scanner (System.in); 

	/**
	 * 
	 */
	public Controller(Game game, Scanner in) {
		this.game = game;
		this.in = in;
	}
	
	public void run() {
		String linea = null;
		boolean end = false;		
		Integer cycles = 0;
		GamePrinter print;
		while(!this.game.isFinished()) {
			System.out.println("Command > ");
			linea = in.nextLine();
			linea = linea.trim();
			String[] command = linea.split(" +");
			switch(command.length) {
			case 1 :
				if (command[0].equalsIgnoreCase("L"))
					game.showList();
				else if (command[0].equalsIgnoreCase("H"))
					game.help();
				else if (command[0].equalsIgnoreCase("E")) {
					game.setEnd(true);
					game.setWinner(3);
				}
				else if(command[0].equalsIgnoreCase("R"))
					//game.reset();
					game = new Game(game.getRand(), game.getLevel());
				else if(command[0].equalsIgnoreCase("") || command[0].equalsIgnoreCase("N")) {
					System.out.println(game.toString());
					print = new GamePrinter (game, 4, 8);
					System.out.println(print.toString());
					game.update(cycles);
					cycles++;
				}
				else System.out.println("Unknown command" + System.lineSeparator());
				break;
			case 4:
				if(command[0].equalsIgnoreCase("A")) {
					int x, y;
					if(isNumeric(command[2]) && isNumeric(command[3])) {
						x = Integer.parseInt(command[2]);
						y = Integer.parseInt(command[3]);
						if(command[1].equalsIgnoreCase("P") || command[1].equalsIgnoreCase("PEASHOOTER")) {
							Peashooter ps = new Peashooter(x, y, 3);
							if(game.getPeashooterList().existInList(x, y)== null) {
								game.addPeashooter(ps);
								System.out.println(game.toString());
								print = new GamePrinter (game, 4, 8);
								System.out.println(print.toString());
								game.update(cycles);
								cycles++;
							}
							else System.out.println("Invalid Position");
						}
						else if(command[1].equalsIgnoreCase("S") || command[1].equalsIgnoreCase("SUNFLOWER")) {
							Sunflower sf = new Sunflower(x, y);
							if(game.getSunflowerList().existInList(x, y)== null) {
								game.addSunflower(sf);
								System.out.println(game.toString());
								print = new GamePrinter (game, 4, 8);
								System.out.println(print.toString());
								game.update(cycles);
								cycles++;
							}
							else System.out.println("Invalid Position");
							
						}
						else
							System.out.println("Invalid Object" + System.lineSeparator());;
							}	
					else
						System.out.println("Invalid object" + System.lineSeparator());;
				}
				break;
			default :
				System.out.println("Invalid Object" + System.lineSeparator());;
				break;
			}
			if (game.isFinished()) {
				if(game.getWinner() == 0) 
					System.out.println("Player wins!");
				else if (game.getWinner() == 1)
					System.out.println("Zombies win!");
				else System.out.println("Game over ");
			}
		}
				
	}
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	//setNoPrintGameState()

}
