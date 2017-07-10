package java_for_dummies;

import java.util.Scanner;

public class EvenCounter {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		String input;
		
		while(num <= 20) {
			System.out.println(num + "  ");
			System.out.print("Do you want to keep counting?" + "  (Y or N) ");
			input = scan.nextLine();
			
			if(input.equalsIgnoreCase("N"))
					break;
			num += 2;
		}
		System.out.println("\nWhew! That was close");

	}

}
