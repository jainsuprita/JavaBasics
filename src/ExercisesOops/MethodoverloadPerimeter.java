package ExercisesOops;

public class MethodoverloadPerimeter {
	
	private static MethodoverloadPerimeter obj;



	public int Perimeter(int side )
	{
		 int p ;  
		 p = 4* side ;
		 System.out.println("Perimeter of a square:"  + p);
		 return(p);
	}
	
	public int Perimeter(int l, int w  )
	{
		 int p ;  
		 p = 2* (l+ w) ;
		 System.out.println("Perimeter of a Rectangle:"  + p);
		 return(p);
	}
	
	public void  Perimeter(int s1, int s2, int s3   )
	{
		 int p ;  
		 p = s1+s2+s3 ;
		 System.out.println("Perimeter of a Triangle:"  + p);
		
	}
	
	public float  Perimeter(float radius  )
	{
		 float p ;  
		 p = (float)(2* Math.PI* radius ) ;
		 System.out.println("Perimeter of a Triangle:"  + p);
		 
		 return (p);
	
	}
	
	public void Perimeter() 
	{
		System.out.println("Not calculating any Perimeter in this method ");
	}
	
	

	public static void main(String[] args) {
		
		MethodoverloadPerimeter objp = new MethodoverloadPerimeter();
		
		objp.Perimeter();
		objp.Perimeter(5);
		objp.Perimeter(3, 4);
		objp.Perimeter(3, 2, 3);
		objp.Perimeter(6.75f);
		
		//System.out.println("Area of a default ");
	
		


	}

}
