
public class StringPalindrome {

	public static void main(String[] args)	{
		
		String str = "racecar";
		String rev = "";
		int len = str.length();
		
		for (int i = len -1; i  >= 0; i--) {
		rev = rev + str.charAt(i);
		
		}
		if(str.equals(rev)) {
			System.out.println("True");
		
		}
		else {
			System.out.println("False");
		}
	}
}
