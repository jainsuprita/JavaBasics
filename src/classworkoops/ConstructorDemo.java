package classworkoops;

public class ConstructorDemo {
	
	float radius;
	int length;
	int width;
	
	ConstructorDemo(float r, int l, int w){
		radius = r;
		length = l;
		width = w;
	}
	
//	ConstructorDemo(float r){
//		radius = r;
//	}
	
	public void area() {
		float res = (float) (Math.PI * radius * radius);
		System.out.println("Area of Circle : "+ res);
	}

	public static void main(String[] args) {
		//ConstructorDemo cObj = new ConstructorDemo(8.75f);
		ConstructorDemo cObj = new ConstructorDemo(8.75f, 14, 14);
		cObj.area();
		
		ConstructorDemo cObj2 = new ConstructorDemo(9.75f, 12, 13);
		cObj2.area();
	}

}