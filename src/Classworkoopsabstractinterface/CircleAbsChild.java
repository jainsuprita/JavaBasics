package Classworkoopsabstractinterface;

public class CircleAbsChild extends ShapeAbstract{
	
	float r = 9.5f;


	@Override
	public void area() {
		float res = (float) (Math.PI * r * r);
		System.out.println("Area of Circle : " + res);
		
		
}

	public static void main(String[] args) {
		
		CircleAbsChild myObj = new CircleAbsChild();
		myObj.area();
	}

}
