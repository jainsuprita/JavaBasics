package exercises;

import java.util.Scanner;

public class EMICalculator {
	


	public static void main(String[] args) {
		double p = 0.0d;
		float r = 0.0f;
		short n = 0;
		
		double emi=0.0d;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Principal amount: ");
		p = scan.nextDouble();
		System.out.print("Enter rate of interest: ");
		r = scan.nextFloat();
		System.out.print("Enter no.of years : ");
		n = scan.nextShort();
		
		double rp = Math.pow((1+r/12/100), n*12);
		
		emi = p * (r/12/100) * (rp/(rp-1));
		System.out.println(emi);
		System.out.println("EMI : "+ Math.round(emi));
	}

}
