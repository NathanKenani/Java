package java_for_dummies;

import java.util.Scanner;

public class DividingIntegers {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// declaration
		int numOfMarbles;
		int numOfChildren;
		int marblesPerChild;
		int marblesLeftOver;
		
		//get input data
		System.out.println("Welcome to the marble divvy upper.");
		System.out.print("Number of marbles:  ");
		numOfMarbles = scan.nextInt();
		System.out.print("Number of children:  ");
		numOfChildren = scan.nextInt();
		
		//Calculate results
		marblesPerChild = numOfMarbles / numOfChildren;
		marblesLeftOver = numOfMarbles % numOfChildren;
		
		//Print results
		System.out.println("Give each child " + marblesPerChild + " marbles.");
		System.out.println("You will have " + marblesLeftOver + " marbles left over");
		

	}

}
