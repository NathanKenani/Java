package java_for_dummies;

import java.util.Scanner;

public class ScannerApp {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Read an integer
//		System.out.println("Enter an integer: ");
//		int x = scan.nextInt();
//		System.out.println("You entered: " + x);
		
		// read a string
		System.out.println("Enter a String: ");
		String s = scan.nextLine();
		System.out.println("You entered: " + s);

	}

}
