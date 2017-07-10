package java_for_dummies;

import java.text.NumberFormat;

public class FormattingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 19923.3288;
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(x));
		
		double grade = .92;
		NumberFormat pf = NumberFormat.getPercentInstance();
		System.out.println(pf.format(grade));

	}

}
