package java_for_dummies;

public class StringConverting {
	
	public static void main(String[] args) {
		// converting Strings to primitives
		String s = "10";
		int x = Integer.parseInt(s);
		short y = Short.parseShort(s);
		long l = Long.parseLong(s);
		double d = Double.parseDouble(s);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(l);
		System.out.println(d);
	}
}
