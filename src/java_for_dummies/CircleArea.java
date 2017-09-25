package java_for_dummies;

import java.util.Scanner;

public class CircleArea {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter radius of a circle: ");
		double r = scan.nextDouble();
		double area = Math.PI * (r * r);
		System.out.println("The area of the circle is: " + area);

	}

}
