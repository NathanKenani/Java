import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args)	{
		
		Scanner scan = new Scanner(System.in);
		double fnum, snum, answer;
		
		System.out.println("Enter first number: ");
		fnum = scan.nextDouble();
		System.out.println("Enter second number: ");
		snum = scan.nextDouble();
		
		answer = fnum + snum;
		System.out.println(answer);
		
		scan.close();
	}

}
