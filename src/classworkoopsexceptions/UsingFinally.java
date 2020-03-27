package classworkoopsexceptions;

public class UsingFinally {
	static int a = 9;
	static int b = 3;
	public static void main(String[] args) {
		try {
			System.out.println(a/b);
			System.out.println("I am after division");
	
			int[] myArray = { 1, 2,3, 4};
				System.out.println(myArray[0]);
				System.out.println(myArray[3]);
//				try { // Nested
//					System.out.println(myArray[4]);
//				}catch(ArrayIndexOutOfBoundsException e) {
//					e.printStackTrace();
//					System.out.println("Caught Runtime Exception");
//				}
				
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Caught Exception");
		} finally {
			System.out.println("I am in finally");
		}

	}

}