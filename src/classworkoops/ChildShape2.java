package classworkoops;

import classworkoopsinheritance. ShapesParent;

public class ChildShape2 extends ShapesParent {

	public static void main(String[] args) {
		
		ChildShape2 myObj = new ChildShape2();
		myObj.areaOfCircle(8.9f); //Public
		System.out.println(myObj.pr);//Protected
		//System.out.println(myObj.n); // not accepted no access modifier
		//System.out.println(myObj.p)// not accepted as private
	}

}
