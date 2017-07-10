import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		int age;
		System.out.println("Enter drinking age");
		Scanner scan = new Scanner(System.in);
		
		age =scan. nextInt();
		if(age < 21) {
			System.out.println("Sorry you are not onld enough to drink");
		
		}else {
			System.out.println("Please drink responsibly");
		}
	}
}
