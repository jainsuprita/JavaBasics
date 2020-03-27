package classworkoops;

public class ConstructorOverloadingDemo {
	
	float radius;
	int length;
	int width;
	
	ConstructorOverloadingDemo(){
		radius = 0;
		length = 0;
		width = 0;
	}
	
	ConstructorOverloadingDemo(float r){
		radius = r;
	}
	
	ConstructorOverloadingDemo(int l, int w){
		length = l;
		width = w;
	}
	
	ConstructorOverloadingDemo(float r, int l, int w){
		radius = r;
		length = l;
		width = w;
	}
	
	
	public void areaOfCricle() {
		float res ;
		res = (float) (Math.PI * radius *radius);
		System.out.println("Area of Circle : "+ res);
	}
	
	public void areaOfRectangle() {
		int res;
		res = length * width;
		System.out.println("Area of Rectangle : "+ res);
	}
	


	public static void main(String[] args) {
		
		ConstructorOverloadingDemo obj1 = new ConstructorOverloadingDemo(); // Default
		obj1.areaOfCricle();
		obj1.areaOfRectangle();
		System.out.println("----------------------------------");
		ConstructorOverloadingDemo obj2 = new ConstructorOverloadingDemo(9.75f); // with 1 param
		obj2.areaOfCricle();
		obj2.areaOfRectangle();
		System.out.println("----------------------------------");
		ConstructorOverloadingDemo obj3 = new ConstructorOverloadingDemo(15, 25); // with 2 int param
		obj3.areaOfCricle();
		obj3.areaOfRectangle();
		System.out.println("----------------------------------");
		ConstructorOverloadingDemo obj4 = new ConstructorOverloadingDemo(9.65f, 15, 25); // with 3 param
		obj4.areaOfCricle();
		obj4.areaOfRectangle();

	}

}