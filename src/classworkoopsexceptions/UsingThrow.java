package classworkoopsexceptions;


public class UsingThrow {

public static void main(String[] args) throws MyOwnException {
		int a = 9;
		int b = 3;
//		try {
//			System.out.println(a/b);
//			System.out.println("I am after division");
//	
//			int[] myArray = { 1, 2,3, 4};
//				System.out.println(myArray[0]);
//				System.out.println(myArray[3]);
//				System.out.println(myArray[4]);
//		} catch(Exception e) {
//			throw new RuntimeException(" its my arithmetic Exception");
//		}
		
		try {
			System.out.println(a/b);
			System.out.println("I am after division");
	
			int[] myArray = { 1, 2,3, 4};
				System.out.println(myArray[0]);
				System.out.println(myArray[3]);
				System.out.println(myArray[4]);
		} catch(Exception e) {
			throw new MyOwnException(" its my arithmetic Exception");
		}

	}

}
