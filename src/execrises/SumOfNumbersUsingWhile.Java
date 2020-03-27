package exercises;

public class SumOfNumbersUsingWhile {

	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		while(a < 101) { 
			sum = sum + a; //1, 3, 6, 10
			a++; //2, 3, 4
		}
		System.out.println(" Sum  = " + sum);
	}
	
}
