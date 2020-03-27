package classwork;

public class UnaryoperatorsDemo {

	public static void main(String[] args) {

		//unary operators 
		int u = 5;
		System.out.println(" u= " +u);
		u++;  // u= u+1 
		System.out.println(" u++= " +u);
		
		u--;  // u= u-1 
		
		System.out.println(" u--=  " +u);
		++u;
		System.out.println(" --u=  " +u);
		--u;
		
		byte n =8;
		System.out.println("n=" +n);
		
		System.out.println("n++:"  + n++); // post fix  n will be incremented only after execution 
		System.out.println("n=" +n);
		System.out.println("n--:"  + n--); // decrenment after execution 
		System.out.println("n=" +n);
		
		byte d = 9 ;
             System.out.println("d=" +d);
		
		System.out.println("++d:"  + ++d); // post fix  n will be incremented only after execution 
		System.out.println("d=" +d);
		System.out.println("--d--:"  + --d); // decrenment after execution 
		System.out.println("d=" + d);
				
	}

}
