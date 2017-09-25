package java_for_dummies;

import java.util.Scanner;

public class GuessingGame {
	
	static Scanner scan = new Scanner(System.in);
	static int guess;

	public static void main(String[] args) {
		//  
		boolean keepPlaying = true;
		System.out.println("Let's play a guessing game!");
		
		while(keepPlaying) {
			boolean validInput;
			int num;
			String answer;
			// Pick a random number
			num = (int) (Math.random() * 10) + 1;
			
			// Get the guess
			System.out.println("\nI'm thinking of a number between 1 and 10. ");
			System.out.print("What do you think it is? " );
			
			do { 
				guess = scan.nextInt();
				validInput = true;
				if( (guess < 1) || (guess > 10)) {
					System.out.print("I said between 1 and 10. " + "Try again: ");
				}
			}
			while(!validInput);
			
			// check the guess
			if(guess == num)
				System.out.println("You are right!");
			else 
				System.out.println("You are wrong!");
			// play again 
			do {
				System.out.print("\nPlay again? (Y or N)");
				answer = scan.next();
				validInput = true;
				if (answer.equalsIgnoreCase("Y"))
					;
				else if (answer.equalsIgnoreCase("N"))
					keepPlaying = false;
				else
					validInput = false;
			} while (!validInput);
		}
		System.out.println("\nThank you for playing");
	}

}
