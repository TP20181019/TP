/**
 * 
 */
package tp.p1.controller;

import java.util.Scanner;

import tp.p1.command.Command;
import tp.p1.command.CommandParser;
import tp.p1.logic.GamePrinter;

/**
 * @author Michelle
 *
 */
public class Controller {
	private Game game;
	private Scanner in = new Scanner (System.in); 
	private boolean noPrint;
	private String prompt = "Command > ";

	/**
	 * 
	 */
	public Controller(Game game, Scanner in) {
		this.game = game;
		this.in = in;
		this.noPrint = true;
	}
	
	
	public void run() {
		while (!game.isFinished()) {
			printGame();
			this.noPrint = false;
			System.out.print(prompt);
			String[] words =  in.nextLine().toLowerCase().trim().split("\\s+");
			Command command = CommandParser.parseCommand(words, this);
			if (command != null) {
				command.execute(game, this);
			}
			else {
				System.err.println ("Unknown command");
				setNoPrintGameState();
			}
		}

	}
	
	private void setNoPrintGameState() {
		this.noPrint = true;
		
	}


	private void printGame() {
		
	}
}
