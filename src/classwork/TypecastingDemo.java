package classwork;

public class TypecastingDemo {

	public static void main (String[] args) {
		
		int i= 75;
		byte b = 25;
		 
		i= b; //Automatic conversion 
		
		System.out.println("i = " +i);
		
		i= 755;
		
		b= (byte) i; //Type casting (Big to small )
		System.out.println("b = " +b);
		
		
		float f =788.78f;
		int x =0;
		x= (int)f;
		System.out.println("x = " +x );
	}
}
