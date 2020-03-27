package classworkoops;

public class MethodOverloadingDemo {
	
	int a;
	
	public void area(float r) {
		float res ;
		res = (float) (Math.PI * r *r);
		System.out.println("Area of Circle : "+ res);
	}
	
	public void area(int l, int w) {
		int res;
		res = l * w;
		System.out.println("Area of Rectangle : "+ res);
	}
	
	public int area(int s) {
		int res;
		res = s * s;
		return res;
	}
	
	public void area() {
		System.out.println("Not calculating any area");
	}

	
	public static void main(String[] args) {
		MethodOverloadingDemo aObj = new MethodOverloadingDemo();
		aObj.area();
		aObj.area(8.75f);
		aObj.area(15, 12);
		System.out.println("Area of Square:" + aObj.area(13));
	}

}
