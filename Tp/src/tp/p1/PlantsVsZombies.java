/**
 * 
 */
package tp.p1;

import java.util.Random;
import java.util.Scanner;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;
import tp.p1.logic.Level;

/**
 * @author Michelle
 *
 */
public class PlantsVsZombies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int max = args.length;
		boolean ok = true; // para control de errores en args
		// lee los argumentos que pasamos para saber el tipo
		//de dificultad y la semilla de rand
		
		if(max <= 2 && max > 0) {
			Level level = null;
			Long seed = null; //long()new Random().nextInt(1000);
			if (args[0].equalsIgnoreCase("EASY")) 
				level = Level.EASY;
			else if(args[0].equalsIgnoreCase("HARD"))
				level = Level.HARD;
			else if(args[0].equalsIgnoreCase("INSANE"))
				level = Level.INSANE;
			else {
				System.out.println("Fail, level = EASY, HARD OR INSANE.");
				ok = false;
			}
			if(max == 2) {
				if(!Character.isDigit(args[1].charAt(0))) {
					System.out.println("Fail, SEED is number!");	
					ok = false;
					}
				else 
					seed = Long.parseLong(args[1]);
			}
			if (ok) {

				Random rand = new Random(seed);
				// long seed = long.
				Game game = new Game(rand, level);
				Controller controller = new Controller(game,in);
				controller.run();
			}
		}
		else
			System.out.println("Fail, only 1 or 2 aguments");

	}


}
