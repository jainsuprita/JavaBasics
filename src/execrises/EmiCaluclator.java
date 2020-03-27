package execrises;

public class EmiCaluclator {
	
	public static void main (String[] args) {
		
		double p= 350000;
		double  e;
		float r =12f;
		float n= 10f;
		  

		e = p * r * (float) (Math.pow(1+r, n) / (Math.pow(1+r, n) - 1));
		
		System.out.println("EMi value is :"  +e);

		
	}

}
