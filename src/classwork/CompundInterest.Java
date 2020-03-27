package exercises;

public class CompundInterest {
	
	public static void main(String[] args) {
		int p = 100000;
		float r = 8.65f; // %
		int t = 2;
		double amount = 0d;
		
		amount =  p * Math.pow((1+r/100), t);
		System.out.println("Amount --> " + amount);
		
	}

}
