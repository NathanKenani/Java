package java_for_dummies;

import javax.swing.JOptionPane;

public class DialogApp {

	public static void main(String[] args) {
		//getting input with JOptionPane class
		String s;
		s = JOptionPane.showInputDialog("Enter an integer: ");
		int x = Integer.parseInt(s);
		System.out.println("You entered " + x + ".");
	}

}
