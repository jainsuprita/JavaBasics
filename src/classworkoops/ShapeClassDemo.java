package classworkoops;

public class ShapeClassDemo {
	
	
	  float radius =8.5f;
	  float  area =0.0f;
	  
	  public void areaOfCircle()
	  
	  {
		  area = (float) ( Math.PI *radius * radius) ;
		  System.out.println("Area of a circle :"  +area);
	  }
	
		
	public static void main(String[] args) 
	{
		ShapeClassDemo cobj = new ShapeClassDemo();
		cobj.radius = 10.5f;
		cobj.areaOfCircle();
		
		ShapeClassDemo cobj2 = new ShapeClassDemo();
		cobj2.radius = 12.5f;
		cobj2.areaOfCircle();
		
		

	}

}
