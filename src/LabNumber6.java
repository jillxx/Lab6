
//developed by Jiao Xu   4/30/2018
//Dice Roller App

import java.util.Scanner;
import java.util.Random;

public class LabNumber6 {
	public static void main(String[] args) {
		Random randGen = new Random();
		Scanner scnr = new Scanner(System.in);
		String cont = "y";
		int rollNum = 1;
		System.out.println("welcome to the Grand Circus Casino!");

		while (cont.equalsIgnoreCase("y")) {
			// prompt user to enter the number of sides for a pair of dice
			System.out.println("How many sides should each die have?");
			int sidesNum = scnr.nextInt();
			// make sure the number entered are valid
			if (sidesNum < 2) {
				System.out.println("The number entered does not meet requirement!\n");
				continue;
			}

			// promt the user how many times they have rolled.
			System.out.println("Roll " + rollNum + ":");
			// generate number for dice 1
			int num1 = (randGen.nextInt(sidesNum) + 1);
			System.out.println(num1);
			// generate number or dice 2
			int num2 = (randGen.nextInt(sidesNum) + 1);
			System.out.println(num2);

			// show messages for craps, snake eyes, and box cars.
			DiceRollerApp(num1, num2);
			// ask the user if he wants too continue
			System.out.println("\nRoll again?(y/n): ");
			cont = scnr.next();
			rollNum++;
		}
		System.out.println("Goodbye!");

		scnr.close();

	}

	private static void DiceRollerApp(int random1, int random2) {
		if ((random1 + random2) == 2) {
			System.out.println("\tSnake eyes!");
		} else if ((random1 + random2) == 7 || (random1 + random2) == 11) {
			System.out.println("\tCraps!");
		} else if ((random1 + random2) == 12) {
			System.out.println("\tBox cars!");
		}
	}
}