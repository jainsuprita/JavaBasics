package ExecrisesInheritance;

public class MyShapesParent {
	
	public int Perimeter(int side )
	{
		 int p ;  
		 p = 4* side ;
		// System.out.println("Perimeter of a square:"  + p);
		 return(p);
	}
	
	public int Perimeter(int l, int w  )
	{
		 int p ;  
		 p = 2* (l+ w) ;
		// System.out.println("Perimeter of a Rectangle:"  + p);
		 return(p);
	}

	public static void main(String[] args) {
		
		MyShapesParent obj = new MyShapesParent();
		System.out.println("perimeter of a square " +obj.Perimeter(5));
		System.out.println("perimeter of a square " +obj.Perimeter(6, 7));
		
		
	}

}
