//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class FactRecursion {
	public static void main(String args[]) throws NumberFormatException, IOException {
		System.out.println("Enter the number: ");
		
		// get input from user
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		// Call the recursion function to generate factorial
		int result = fact(a);
		
		System.out.println("Factorial of the number is: " + result);	
	}
	
	static int fact(int b) {
		if ( b <= 1) {
			// if the number is 1 then return 1
			return 1;
		}
		else
			// else call the same function with the value -1
			return b * fact(b-1);
	}
}
