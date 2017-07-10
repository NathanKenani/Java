package java_for_dummies;

import java.util.Scanner;

public class ValidateInput {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//  Do-While loops are useful for validating input by user.
		int bank = 1000;
		int bet;
		
		System.out.println("You can bet between 1 and " + bank);
		do {
			System.out.print("Enter your bet:  ");
			bet = scan.nextInt();
		} while ((bet <= 0) || (bet > bank));
			System.out.println("Your money is good here");
	}

}
