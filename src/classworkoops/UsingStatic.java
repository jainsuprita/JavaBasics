package classworkoops;

public class UsingStatic {

int i = 10; // belongs to Object
	
	static int a = 7; // Belongs to class
	
	
	static void printSum() {
		System.out.println(a+ 15);
	}
	
	void printMultiply() {
		System.out.println(i + a);
	}
	
	public static void main(String[] args) {
		
		UsingStatic obj1 = new UsingStatic();
		System.out.println(obj1.i);
		
		System.out.println(a);
		System.out.println(UsingStatic.a);
		
		UsingStatic obj2 = new UsingStatic();
		System.out.println(obj2.i);
		obj2.printMultiply();
		
		printSum();
		UsingStatic.printSum();
		

	}

	
}


