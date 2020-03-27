package ExercisesOops;

public class ExcepDemo {

	double amount;
	int p = 50000;
	float r = 0.0f;
	int t = 5;
	
	public static void main(String[] args) {
		ExcepDemo myObj = new ExcepDemo();
		try {
			myObj.compoundInterest();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("I am in finally block");
		}
		System.out.println(" I am after finally");
	}
	
	
	public void compoundInterest() throws Exception{
	
		if(r==0) {
			throw new  ArithmeticException("rate of interest zero");
		}
		amount = ((p) * Math.pow((1+r/100), t));
		System.out.println("Amount : " + amount);
	
	}
	

}