package execrises;

import java.util.Scanner;

public class OddEvenIf {

	public static void main (String[] args) 
	{
		ifelse();
	}
	
	public static void ifelse ()
	{
		int num ;
		System.out.println("Enter an Integernumber :");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		if(num%2==0)
		{

		 System.out.println("Entered Integer Number is Even ");
		 
		}
		else
	 {
			System.out.println("Entered Integer Number is odd ");
		}
			
			
	
	}
		
		
		
}
