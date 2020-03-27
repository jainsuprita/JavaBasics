package Classworkoopsabstractinterface;

public class RectangleAbsChild extends ShapeAbstract{
	
	int l = 8;
	int w = 9;

	public static void main(String[] args) {
		RectangleAbsChild myObj = new RectangleAbsChild();
		myObj.area();

	}

	@Override
	public void area() {
		int res = l * w;
		System.out.println("Area of rectangle : "+ res);
		
	}

}
