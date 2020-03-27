package classworkoops;

public class StringDemo {

	public static void main(String[] args) {
		String name =  "John"; // Immutable
		System.out.println(name);
		name = "H2kInfosys"; // Delete old Object and create new object with updated value
		System.out.println(name);
		
		char[] mynameArr = { 'S', 'e', 'l', 'e', 'n', 'i', 'u', 'm'};
		String myname = new String(mynameArr);// "Selenium"
		

		System.out.println(myname);
		
		
//
//		/* Formats Using String*/
//		System.out.println("My Name -->" + myname + " My Age: " + 36);
//		System.out.printf("My Name --> %s  My Age:%d  Sal : %f %b", myname, 36 , 3487.56f, true);
//		System.out.println();
//		String myOutput = String.format(" My Name --> %s  My Age:%f ", myname, 36.0f);
//		System.out.println(myOutput);
		
		/* Common String Operations */
		
		String myString = "Java is Object Oriented Programming Language Oriented Java";
	
		
		String myString2 = " By H2kInfosys";
		
		System.out.println(" Length : " + myString.length());
		
		 String toUC = myString.toUpperCase();
		 
		System.out.println(" To Upper Case: " + toUC);
		
		System.out.println(" Orginal: " +myString);
		
		System.out.println(" To Lower Case: " + myString.toLowerCase());
		
		System.out.println(" Char At: " + myString.charAt(7));
		
		System.out.println(" Concat: " + myString.concat(myString2));
		
		System.out.println(" Replace: " + myString.replace("Java", "C++")); //Replaces all occurrences of String 
		
		System.out.println(" Replace First: " + myString.replaceFirst("Java", "C++")); //Replace first occurrence of String
		
		System.out.println(" After Replace- MyString: " + myString);
		
		System.out.println(" Sub String(Begin Index): " + myString.substring(6));
		
		System.out.println(" Sub String(begin, end): " + myString.substring(0, 3));
		
		
		System.out.println(" Trim : " + myString.trim());
		
		
		System.out.println(" Contains : " + myString.contains("object"));
		
		String[] myArr = myString.split("Oriented");
		for(String element : myArr) {
			System.out.println("Split element : " + element);
		}
		
		String str1 = "H2KInfosys"; 
		String Str2 = "h2KInfosys";
		System.out.println(" Equals : " + str1.equals(Str2));
		System.out.println(" Equals Ignore Case: " + str1.equalsIgnoreCase(Str2));
		
		String repA = "Selenium \"automation";
		System.out.println(repA);
		System.out.println(repA.replaceAll("\"", "-"));
		
			
		/* String to Float*/
		String myVal="25.5";
		
		char myChar = 'S';
		
		float fVal = Float.valueOf(myVal); // converting String into a float value
		System.out.println(fVal);
		
		int iVal = Integer.valueOf("30");// converts String "30" into int val
		System.out.println(iVal);
		
		
		int ival = (int) fVal; // Conversion Float to int using casting. No need to use wrapper class for this
		System.out.println(ival);
		
		/* Integer, float to String*/
		int i =7;
		float f = 78.5f;
		String myStr = Integer.toString(i);// converting int value to String
		System.out.println(myStr);
		String myStr2 = Float.toString(f); // converting float value to String
		System.out.println(myStr2);
		
		int a = 9;
		Integer myObj = new Integer("9");
		System.out.println(myObj.toString()); // Object to String
		int myint = myObj.intValue();// From Object to Primitive
		System.out.println(myint);
		
		int j = 10;
		Integer myint2 = Integer.valueOf(j);
		System.out.println(myint2);
		
	}
	



	}


