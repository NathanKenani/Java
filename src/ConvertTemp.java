import java.util.Scanner;

public class ConvertTemp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double celsius, fahrenheit;
		System.out.println("Enter a temperature in Celsius: ");
		celsius = scan.nextDouble();
		
		fahrenheit = 32 +  (celsius * 9/5);
		System.out.println(celsius  + " Celsius = " + fahrenheit + " Fahrenheit");
	}
}
