package classworkoopsexceptions;

public class UsingTryCatch {

	public static void main(String[] args) {

		int a = 9;
		int b = 3;
		// Applying try catch at individual statements
//		try {
//			System.out.println(a/b);
//		} catch(ArithmeticException e) {
//			System.out.println("Caught AE");
//		}
//		System.out.println("I am after division");
//
//		int[] myArray = { 1, 2,3, 4};
//		try {
//			System.out.println(myArray[0]);
//			System.out.println(myArray[3]);
//			System.out.println(myArray[4]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Caught AIOBE");
//		}
		
		// Applying try with multiple catches
//		try {
//			System.out.println(a/b);
//			System.out.println("I am after division");
//	
//			int[] myArray = { 1, 2,3, 4};
//				System.out.println(myArray[0]);
//				System.out.println(myArray[3]);
//				System.out.println(myArray[4]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Caught AIOBE");
//		} catch(ArithmeticException e) {
//			System.out.println("Caught AE");
//		}
		
		// Applying try catch with Parent classes
//		try {
//			System.out.println(a/b);
//			System.out.println("I am after division");
//	
//			int[] myArray = { 1, 2,3, 4};
//				System.out.println(myArray[0]);
//				System.out.println(myArray[3]);
//				System.out.println(myArray[4]);
//		} catch(RuntimeException e) {
//			e.printStackTrace();
//			System.out.println("Caught Runtime Exception");
//		}

		
		// Applying try catch with Exception class
		try {
			System.out.println(a/b);
			System.out.println("I am after division");
	
			int[] myArray = { 1, 2,3, 4};
				System.out.println(myArray[0]);
				System.out.println(myArray[3]);
				System.out.println(myArray[4]);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Caught Runtime Exception");
		}

		System.out.println(" I am at final line");
	}

}
