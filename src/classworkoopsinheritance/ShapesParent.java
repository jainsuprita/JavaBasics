package classworkoopsinheritance;

public class ShapesParent {
	
	public int a = 7;
	private int p = 7;
	int n = 8;
	protected int pr = 19;
	
	public void areaOfCircle(float r) {
		float res = (float) (Math.PI * r * r);
		System.out.println("area of Circle:" + res);
	}
	
	public void areaOfRectangle(int l, int w) {
		int res = l * w;
		System.out.println("area of Rectangle:" + res);
	}
	
	public static void main(String[] args) {
		ShapesParent myObj = new ShapesParent();
		myObj.areaOfCircle(8.75f);
		myObj.areaOfRectangle(12,  15);
	}

}