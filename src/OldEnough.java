import java.util.Scanner;

public class OldEnough {
	public static void main(String[] args) {
		
		String male = "male";
		String female = "female";
		String gender ="";
		int age ;
		int result;
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender");
		gender = scan.nextLine();			
		
		System.out.println("Enter your age");
		age = scan.nextInt();
		
//		for(int i = len; i >= 0; i++) {
//			str = str + gender.charAt(i);	
//		}
		
		if(gender.equals(male)) {
			result = (age / 2) + 7;
			System.out.println("You can only date girls " + result + " years and  older" );
			
		}
		else  if (gender.equals(female)) {
			result = (age - 7)  * 2;
			System.out.println("You can only date men " + result + " years and younger!");
		} else {
			System.out.println("Check the information you provided");
		}
		scan.close();
	}
}
