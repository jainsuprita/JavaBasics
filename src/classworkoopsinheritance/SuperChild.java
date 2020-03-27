package classworkoopsinheritance;

public class SuperChild extends SuperBase{

	float radius = 0;
	SuperChild(int r) {
		super(r);
	}
//	SuperChild(int r, float radius) {
//		super(r);
//		this(); //Error , as this or super must be first statement in constructor
//	}

	
	public void periCircle() {
		System.out.println("radius->" + super.radius);
		System.out.println("permeter: " + (2 * Math.PI * super.radius));
	}
	
	public void areaOfCircle() {
		super.areaOfCircle();
	}
	public static void main(String[] args) {
		SuperChild myObj = new SuperChild(26);
	
		myObj.periCircle();
		myObj.areaOfCircle();
	}

}
