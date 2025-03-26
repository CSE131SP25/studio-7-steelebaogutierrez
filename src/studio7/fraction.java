package studio7;

public class fraction {
	private double numerator;
	private double denominator;
	public fraction (double num, double denom) {
		this.numerator=num;
		this.denominator=denom;
	}
	public fraction sum (fraction one, fraction two) {
		double productOne = one.numerator*two.denominator;
		double productTwo = two.numerator*one.denominator;
		double sumNumerator = two.denominator*one.denominator;
		double sumDenominator = productOne+productTwo;
		fraction Sum = new fraction (sumNumerator,sumDenominator);
		return Sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fraction one = new fraction (2,3);
		fraction two = new fraction (4,5);
		one.sum(one, two);
	}

}

