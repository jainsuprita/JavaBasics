package ExercisesOops;

public class MathOpsUsingMethods {

	int a = 9; // Instance variables
	int b = 3;

	public void addition() {
		int r = a + b;
		System.out.println("Addition : " + r);
	}
	
	public int subtraction() {
		int r = a - b;
		return r;
	}

	public void division(int x, int y) {
		float r =  (float) x/y;
		System.out.println("Division : " + r);
	}
	
	public int remainder(int x, int y) {
		int r =  x%y;
		return r;
	}
	
	public static void main(String[] args) {
		

		MathOpsUsingMethods obj1 = new MathOpsUsingMethods();
		obj1.addition();
		System.out.println(" Subtraction " + obj1.subtraction());
		obj1.division(12, 3);
		System.out.println("Remainder : " +  obj1.remainder(12, 5));
	}
}
