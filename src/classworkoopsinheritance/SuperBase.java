package classworkoopsinheritance;

public class SuperBase {
	
	float radius = 10;
	float area = 0;
	
	SuperBase(int r){
		radius = r;
	}
	
	public void areaOfCircle() {
		area = (float) (Math.PI * radius * radius);
		System.out.println("Area of Circle: " + area);
	}

}
