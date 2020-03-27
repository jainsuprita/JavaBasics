package execrises;

//import java.util.Scanner;

public class CompInterest {
	
	public static void main (String[] args) {
		
		double a;
		double p=500000;
		float r=10;
		int  y=5;
				
		a= (float) (p*Math.pow((1+r/100), y));
		
		System.out.println("Amount "  +a);
		
	
		
	}

}
