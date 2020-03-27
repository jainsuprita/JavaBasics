package classwork;

public class UsingSingleDimArray {

	public static void main(String[] args) {

		int[] myArray; //declaration
		
		myArray = new int[10];
		
		myArray[0] = 11;
		myArray[1] = 22;
		myArray[2] = 33;
		myArray[3] = 44;
		myArray[4] = 55;
		myArray[5] = 66;
		myArray[6] = 77;
		myArray[7] = 88;
		myArray[8] = 99;
		
		System.out.println("My Array size:" + myArray.length);
		System.out.println("Third Element : " + myArray[2] );
		System.out.println("Last Element : " + myArray[9] );
		myArray[9] = 100;
		System.out.println("Last Element afteradding val : " + myArray[9] );
		
		System.out.println("----------------------------------------");
		
		System.out.println("Printing array using for loop");
		for(int i = 0; i < myArray.length; i++ ) {
			System.out.println(myArray[i]);
		}
		
		int i = 0;
		while(i < myArray.length) {
			System.out.println(myArray[i]);
			i++;
		}
		System.out.println("----------------------------------------");
		System.out.println("Printing array using for each loop");
		
		for(int arrEle : myArray) {
			System.out.println(arrEle);
		}
		System.out.println("----------------------------------------");
		String[] nameArray = new String[15]; //Declaration and size
		nameArray[0] = "John";
		nameArray[1] = "Craig";
		
		String[] depts = { "IT", "Sales", "HR", "Finance", "Support"  };
		
		System.out.println("depts lengh:"+ depts.length);
		System.out.println(depts[2]);
		
		}
		
	}

	

