package classwork;

public class IfStatementsDemo {
	
	
	public static void main(String[] args) {
		//simpleIf();
		//ifElse();
		//ifElseLadder();
		nestedIf();
	}
	
	
	public static void simpleIf() {
		
		int  a = 9;
		int b = 7;
		
		if(a > b) {
			System.out.println(" a is greater than b");
		}
		System.out.println("I am after if");
	}
	
	public static void ifElse() {
		
		int  a = 5;
		int b = 7;
		
		if(a > b) {
			System.out.println(" a is greater than b");
		} else {
			System.out.println("a is less than or equal to b");
		}
		System.out.println("I am after if");
	}
	
	public static void ifElseLadder() {
		
		int  a = 3;
		int b = 7;
		
		if(a > b) {
			System.out.println(" a is greater than b");
		} else if (a == b) {
			System.out.println("a is equal to b");
		} else if(a < b) {
			System.out.println(" a is less than b");
		} else {
			System.out.println("Invalid number");
		}
		System.out.println("I am after if");
	}
	
	public static void nestedIf() {
		
		int  a = 5;
		int b = 7;
		
		if(a > b) {
			System.out.println("a > b");
		} else {
			if(a==b) {
				System.out.println("a==b");
			} else {
				if(a < b) {
					System.out.println("a<b");
				}
			}
		}
		System.out.println("I am after if");
	}
	

}
