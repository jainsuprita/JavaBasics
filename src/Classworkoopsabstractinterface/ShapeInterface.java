package Classworkoopsabstractinterface;


public interface ShapeInterface {
	//public interface ShapeInterface extends AnimalInterface {
	
	float pi = 3.14f;
	
	void area();
	void perimeter();
	
	default void myDefMethod() { //From Java8
		System.out.println("I am in def method");
	}
	
	static void myStaticMethod() { // From Java8
		System.out.println("I am in Static method");
	}
	void bark();
	
//	private void myprivaMethod() { //Allowed from Java9
//		System.out.println("I am in Static method");
//	}

}
