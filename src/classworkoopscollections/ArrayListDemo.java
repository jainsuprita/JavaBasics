package classworkoopscollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;




public class ArrayListDemo {
	
	public static void main(String[] args) throws Exception {
		arrayList();
		arrayListAlgos();
	}
	
		
	public static void arrayList() throws Exception { 
	
	/* Array List */
	List<String> al = new ArrayList<String>();
	//ArrayList<String> al = new ArrayList<String>(); 
	/* Adding Values to List*/
	al.add("Java");
	al.add("Is");
	al.add("Object");
	al.add("Oriented");
	al.add("Programmimg");
	al.add("Language");
	al.add("Java");
	/* Printing List Directly*/
	System.out.println(al);
	System.out.println("---------------------------");
	/* Accessing and Printing Elements in Array list Using Iterator*/
	printUsingIterator(al);
	System.out.println();
	System.out.println("---------------------------");
	
	/* Finding Size */
	System.out.println("Array List Size :" +al.size());
	System.out.println("---------------------------");
	
	/* Checking Element exists or not*/
	System.out.println("Contains : " + al.contains("C++"));
	System.out.println("---------------------------");

	/* Accessing item using Index*/ 
	System.out.println(" Get Item at Index : " + al.get(2)); 
	System.out.println("---------------------------");
	
	/* Checking whether Empty or not*/
	System.out.println(" Is empty : " + al.isEmpty());
	System.out.println("---------------------------");
	
	/* Modifying/Setting Value by Index*/
	al.set(0, "C++");
	printUsingIterator(al);
	System.out.println();
	System.out.println("---------------------------");
	
	al.add("ByH2k");
	System.out.println("Array List Size :" +al.size());
	/* To Remove Value from Array List by Index*/
	al.remove(0);
	printUsingIterator(al);
	System.out.println();
	System.out.println("Size after removing an element : "+ al.size());
	System.out.println("---------------------------");
	
	
	/* Remove All Elements from Array List*/
	al.removeAll(al);
	System.out.println(" Is empty : " + al.isEmpty());
	System.out.println("---------------------------");
	
	} 
	
	public static void printUsingIterator(List<String> arlist) throws Exception {
		Iterator<String> it = arlist.iterator();
		System.out.print("Printing List elemnts Using Itertor -->");
		while(it.hasNext()){  
			System.out.print(it.next() + "\t");  
		}
	}
	
	public static void arrayListAlgos() throws Exception { 
		
		List<String> al = new ArrayList<String>();
		/* Adding Values to List*/
		al.add("Java");
		al.add("Is");
		al.add("Object");
		al.add("Oriented");
		al.add("Programmimg");
		al.add("Language");
		
		
		/*Printing*/
		System.out.println(al);
		System.out.println("---------------------------");
		
		/* Sorting  List*/
		Collections.sort(al);
		System.out.println("After Sorting : ");
		System.out.println(al);
		System.out.println("---------------------------");

		/* Reversing List*/
		Collections.reverse(al);
		System.out.println("After Reverse : ");
		System.out.println(al);
		System.out.println("---------------------------");

		/* Shuffling List */
		Collections.shuffle(al, new Random(20));
		System.out.println("After Shuffle : ");
		System.out.println(al);
		System.out.println("---------------------------");
		
	}

}
