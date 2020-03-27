package classworkoopsinheritance;

public class ChildOverride extends ParentOverride{
	
	
	@Override
	public void areaOfCircle(float r) {
		System.out.println(" I am in Child class");
		float res = (float) (Math.PI * r * r);
		System.out.println("area of Circle:" + res);
	}
	
//	public static void areaOfCircle(float r) {  //Error as method is not static parent class
//		System.out.println(" I am in Child class");
//		float res = (float) (Math.PI * r * r);
//		System.out.println("area of Circle:" + res);
//	}
//	
//	public void myParentStatMethod() { //Error as method is static parent class
//		System.out.println(" i am in child myParentStatMethod");
//	}

	public static void myParentStatMethod() { // this allowed, it does Hiding(parent implementation)  not override
		System.out.println(" I am in child static method");
	}
	
	public static void main(String[] args) {
		ChildOverride myObj = new ChildOverride(); //Static binding
		myObj.areaOfCircle(9.76f);
		myParentStatMethod();
		
		ParentOverride myObj2 = new ChildOverride(); //Dynamic
		myObj2.areaOfCircle(9.67f);

	}

}

