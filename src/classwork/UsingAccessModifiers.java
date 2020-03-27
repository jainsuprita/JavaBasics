package classwork;

public class UsingAccessModifiers {
	
	int r = 10; // Accessible to the package ( Package Private)
	public float a = 0; // Accessible to the world
	private String _name = "john"; // Accessed directly only by this class
	
	
	void defMethod() {
		System.out.println("I am in defualt method");
	}
	
	public void pubMethod() {
		System.out.println("I am in Public method");
	}
	
	private void _privMethod() {
		System.out.println("I am in Private method");
	}

	public String myPublic() {
		return _name;
	}
	public static void main(String[] args) {
		
		UsingAccessModifiers myObj = new UsingAccessModifiers();
		myObj.r = 100;
		System.out.println(myObj.r);
		System.out.println(myObj.a);
		System.out.println(myObj._name);
		
		myObj.defMethod();
		myObj.pubMethod();
		myObj._privMethod();

	}

}
