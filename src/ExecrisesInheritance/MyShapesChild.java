package ExecrisesInheritance;

public class MyShapesChild extends MyShapesParent {
	
public float  perimeterOfCircle(float r) {
		
		float res = (float) (2 * Math.PI * r);
		//System.out.println("perimter of Circle :" + res);
		return res;
	}

 public void  PerimeterOfTraingle(int s1, int s2, int s3  ){
	 int p ;
	/*  s1 = 1;
	  s2 = 2;
	  s3= 3;*/
	  p = s1+s2+s3 ;
	 System.out.println("Perimeter of a Triangle:"  + p);
	//return p;
	
}

	public static void main(String[] args) {
		
		MyShapesChild cobj = new MyShapesChild();
		cobj.PerimeterOfTraingle(1, 2, 3);
		System.out.println("Perimeter of a square : " + cobj.Perimeter(6));
		System.out.println("Perimeter of a rectangle: " + cobj.Perimeter(8, 9));
		//System.out.println("Perimeter of a tirangle : "  +  cobj.PerimeterOfTraingle(1,2,3));
		System.out.println("Perimeter of a circle: "  +  cobj.perimeterOfCircle(2.25f));
		
		
		
	}

}
