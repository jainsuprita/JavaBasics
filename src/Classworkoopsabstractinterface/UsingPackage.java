package Classworkoopsabstractinterface;

import java.util.Scanner; // Importing a class or package member
import java.util.*; // Importing all the classes and interfaces of the package
import static java.lang.Math.*; //Static import

public class UsingPackage {
	
	public static void main(String[] args) {
		
				
		classwork.Volume vObj = new classwork.Volume(); // Qualified name
		vObj.printMe();
		
		classworkoops.Volume v1Obj = new classworkoops.Volume();
		v1Obj.printMe();
		
		Scanner myScan = new Scanner(System.in);
		Date myDate = new Date();
		
		//float a = (float) (Math.PI * (8.15 * 8.15));
		float a = (float) (PI * (8.15 * 8.15));
		System.out.println(pow(5, 3));
		
	}
	
}

