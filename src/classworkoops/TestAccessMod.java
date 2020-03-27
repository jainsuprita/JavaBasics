package classworkoops;

import classwork.UsingAccessModifiers;

public class TestAccessMod {

	public static void main(String[] args) {
		UsingAccessModifiers obj2 = new UsingAccessModifiers();
		//System.out.println(obj2.r); // no access modifier
		//System.out.println(obj2._name); //Private
		System.out.println(obj2.a); // Public 
		//obj2.defMethod(); // No access modifier
		//obj2._privMethod(); //Private
		obj2.pubMethod(); //Public
		System.out.println(obj2.myPublic());
		
	}

}

		