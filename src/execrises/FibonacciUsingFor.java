package execrises;

public class FibonacciUsingFor {

	public static void main(String[] args) {
		
		int num1 =0;
		int num2 =1;
		int fibocount =10;
		
		System.out.println("Fibonacci series of "  + fibocount  );
		
		for (int i=1; i<=fibocount; ++i)
		{
			System.out.println(num1+ " ");
			int sumofprevtwo = num1+num2 ;
			num1= num2;
			num2 =sumofprevtwo;
			
		}
	}

}
