package classworkoops;

public class UsingThisKeyword {
	
	float radius ; //Instance vars
	int length ;
	int width;
	
	static int a = 5;
	
	UsingThisKeyword(float radius, int length, int width){ // Arguments
		this.radius = radius;
		this.length = length;
		this.width = width;
	}
	UsingThisKeyword(int l, int w){
		this(10.0f, l, w);
		System.out.println("i am in cons2");
	}
	
	public void areaOfCircle() {
		System.out.println("Are of Circle:" + (Math.PI * radius * radius));
	}

	public static void main(String[] args) {
		UsingThisKeyword myObj = new UsingThisKeyword(12.45f, 6, 9);
		myObj.areaOfCircle();
		UsingThisKeyword myObj2 = new UsingThisKeyword(6, 9);
		myObj2.areaOfCircle();
	}

}
