import java.util.Scanner;

public class ReverseNum {
	public static void main(String args[]) {
		int num = 0;
		int reverseNum = 0;
		System.out.println("Input your number and press Enter:");
		
	//This statement will read user input
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
//		While loop: logic to find out the reverse number
		while (num != 0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num % 10;
			num = num / 10;
		}
		
		System.out.println("Reverse of input number is: " + reverseNum);
		
	}

}
