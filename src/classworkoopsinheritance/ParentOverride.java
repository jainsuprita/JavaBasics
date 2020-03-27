package classworkoopsinheritance;

public class ParentOverride {
	
	
	public void areaOfCircle(float r) {
		System.out.println(" I am in Parent class");
		float res = (float) (Math.PI * r * r);
		System.out.println("area of Circle:" + res);
	}
	
	public static void main(String[] args) {
		ParentOverride myObj = new ParentOverride();
		myObj.areaOfCircle(9.76f);

	}


}
