package classworkoops;

public class UsingMethods {

	float radius = 6.5f;
	float area = 0.0f;
	
	public void area() { //Method with no return and no parameters
		area = (float) (Math.PI * radius * radius);
		System.out.println("Area of circle(1): " + area);
	}
	
	public float area2() { //Method with return type
		float a = (float) (Math.PI * radius * radius);
		return a;
	}
	
	public float area3(float r) { //Method with return type and parameters/args
		float a = (float) (Math.PI * r * r);
		return a;
	}
	
	public void area4(float r) { //Method with return type and parameters/args
		float a = (float) (Math.PI * r * r);
		System.out.println("area(4):"+ a);
	}
	

	public static void main(String[] args) {
		
		UsingMethods myObj = new UsingMethods();
		myObj.area();
		
		float rval = myObj.area2();
		System.out.println("Area (2) :" + rval);
		float myr = 8.95f;
		rval = myObj.area3(myr);
		System.out.println("Area (3) :" + rval);
		
		myObj.area4(12.75f);
	}

}
