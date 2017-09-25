package java_for_dummies;

public class OddCounter {

	public static void main(String[] args) {
		//  BREAKING OUT OF A LOOP EXAMPLE
		int num = 1;
		while(num <= 20) {
			if(num == 15) 
				// BREAK IS AN ESCAPE CLAUSE
				break;
			System.out.print(num + "  ");
			num += 2;
		}
		System.out.println();

	}

}
