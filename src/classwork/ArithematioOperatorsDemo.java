package classwork;

public class ArithematioOperatorsDemo {

	public static void main(String[] args) {
		
		//Arithmetic Operators //
		
		int a =9;
		int b= 3;
		
		// Addition /
		
		int res =0;
		res = a+b;
		System.out.println("Addition :" +res);
		
		res= a-b;
		System.out.println("subtraction  :" +res);
		
		res= a*b;
		System.out.println("Mutliplication   :" +res);
		
		res= a/b;
		System.out.println("Division    :" +res);
		
		res= a% b;
		System.out.println("reminder     :" +res);
		
          System.out.println("-------------");
			
		
		//Relational Operators 
		
		
		System.out.println("a>b  "  + (a>b));
		
		System.out.println("a<b  "  + (a<b));
		
         System.out.println("a>b  "  + (a>=b));
		
		System.out.println("a<b  "  + (a<=b));
		
       System.out.println("a==b  "  + (a==b));
		
		System.out.println("a!=b  "  + (a!=b));
		System.out.println("-------------");
		
		//Logical operators 
		
		boolean result = (a>b) && (a==b);
		 System.out.println("(a>b) &&  (a==b)  " +result);
		 
		 
		 //Assignment operators 
		 
		 
		 int z =10;
		 System.out.println("z= "+z);
		 z+= 5;
		 System.out.println("z+5= "+z);
		 z-= 5;
		 System.out.println("z-5= "+z);
		 
		 z*= 5;
		 System.out.println("z*5= "+z);
		 
		 z/= 5;
		 System.out.println("z/5= "+z);
		 
		 
		 
		 		
		 		
		 		
			
		 
		 
		
		
	}

}
