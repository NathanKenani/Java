import java.util.Scanner;

public class switchStatements {
	
	public static void main(String[] args) {
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		age = scan.nextInt();
		
		switch (age){
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get into trouble");
			break;
		default:
			System.out.println("I don't know how old you are");
		
		}
		
	}

}
