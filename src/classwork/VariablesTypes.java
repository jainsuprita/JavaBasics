package classwork;

public class VariablesTypes {
	
	int radius = 6; //instance variable
	
	static  int length = 7;  // static  variables 
	

	public static void main(String[] args) {
		String name = "hello world"; // Local variable 
		System.out.println(name);
		

	}
     public void  addValues() {
    	 //System.out.println(name ); local variable of main method cannot be access
    	 System.out.println(radius);
    	 
     }
     
     
}
