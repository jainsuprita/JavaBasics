package Classworkoopsabstractinterface;

public class CircleChild  implements ShapeInterface {

	float radius =8.95f;
	

	@Override
	public void area() {
		
		float res = pi *radius *radius ;
		System.out.println("Area of circle" +res );
	}

	@Override
	public void perimeter() {
		float res = 2* pi *radius  ;
		System.out.println("Perimeter of circle" +res );	
		
	}
        public static void main(String[] args) {
        	CircleChild myobj = new CircleChild();
        	myobj.area();
        	myobj.perimeter();
        	myobj.myDefMethod(); // From  Java8
    		ShapeInterface.myStaticMethod(); //From java8
        	
		

	}
       
        @Override
    	public void bark() {
    		// TODO Auto-generated method stub
        }
}

        
    		


