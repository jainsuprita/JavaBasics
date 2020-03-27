package classworkoopsexceptions;

public class UsingThrows {
	
	float radius = 9.0f;
	public static void main(String[] args) throws Exception {
		UsingThrows myObj = new UsingThrows();
		try {
			myObj.areaofCircle();
		} catch (Exception e) {
			e.printStackTrace();
		}

		myObj.callArea();
	}
	
	
	public void callArea() throws Exception{
		areaofCircle();
	}
	
	public void areaofCircle() throws Exception{
		
		float res = (float) (Math.PI * radius * radius);
		System.out.println("area of circle : " + res);
		
	}

}
