import java.util.Scanner;

public class GreatestNum {
	public static void main(String args[]) {
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter all three numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
//		d = c >(a > b ? a:b) ? c : ((a > b) ? a : b);
		if ((a > b) && (a > c)) {
			System.out.println("Largest number: " + a);
		}
		else if ((b > a) && (b > c)) {
			System.out.println("Largest number: " + b);
		}
		else {
		System.out.println("Largest Number: " + c);
		}
	}
}
