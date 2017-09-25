package java_for_dummies;

import java.util.Scanner;

public class VoterApp {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the voting machine" + "\nUse this program to determine the cause of the error");
		System.out.print("Enter the error code: ");
		int err = scan.nextInt();
		
		String msg;
		switch (err) {
		case 1:
			msg = "Voter marked more than one candidate";
			break;
		case 2:
			msg = "Box checked and write-in candidate entered";
			break;
		default:
			msg = "Voter filled out ballot correctly";
			break;
		}
		System.out.println(msg);
	}

}
