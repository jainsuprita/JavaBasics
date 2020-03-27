package execrises;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
	
	//farenheit to celisus 
	
	float f= 72;
	float c ;
	System.out.println("Enter FH  value : ");
	Scanner scan = new Scanner(System.in);
	
	f = scan.nextFloat();
		

	c= (f-32)*5/9;
	
	System.out.println("clesius c="   +c);
	 
	}
	

}
