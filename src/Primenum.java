import java.util.Scanner;

public class Primenum {

	public void primenum() {
		// TODO Auto-generated method stub
		int num, count=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		num = scan.nextInt();
		
		for(int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				count++;
				break;
		
			}
		}
		if (count == 0) {
			System.out.print("This is a prime Number");
		}
		else {
			System.out.print("This is not a prime number");
		}
	}

}
