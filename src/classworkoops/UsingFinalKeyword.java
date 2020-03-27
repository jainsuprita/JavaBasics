package classworkoops;

public class UsingFinalKeyword {

	final int a = 5; // Value is final
	
	 public static final int i = 15; // i is constant
	
	
	public void printA() {
		System.out.println(a);
	}
	
	public void printB() {
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
		UsingFinalKeyword obj = new UsingFinalKeyword();
		obj.printA();
		
		System.out.println(i);
		System.out.println(UsingFinalKeyword.i);
	}
	

}


