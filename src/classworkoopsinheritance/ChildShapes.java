package classworkoopsinheritance;

public class ChildShapes extends ShapesParent{
	
	public void perimeterOfCircle(float r) {
		
		float res = (float) (2 * Math.PI * r);
		System.out.println("perimter of Circle :" + res);
	}

	public static void main(String[] args) {
		
		ChildShapes cObj = new ChildShapes();
		System.out.println("a : "+ cObj.a);
		//System.out.println("a : "+ cObj.p);// As it is private, not allowed
		System.out.println("n : "+ cObj.n); // no access modifier
		cObj.areaOfCircle(9.75f); //Public
		cObj.perimeterOfCircle(8.76f);
		System.out.println("pr: "+ cObj.pr); //Protected

	}

}
