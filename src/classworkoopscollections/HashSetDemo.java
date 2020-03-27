package classworkoopscollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class HashSetDemo {
	
	public static void main(String[] args) throws Exception {
		//hashSet();
		hashSetAlgos();
	}

	public static void hashSet() throws Exception{
		
		Set <String> hs = new HashSet<String>();
		/* Adding Values and Print Hashset */
		hs.add("Java");
		hs.add("Is");
		hs.add("Object");
		hs.add("Oriented");
		hs.add("Programming");
		hs.add("Language");
		hs.add("language");
		hs.add("language");
		System.out.println("Printing Hashset: "+ hs);
		System.out.println("------------------------------------");
		
		/* Size*/
		System.out.println("Size : "+ hs.size());
		System.out.println("------------------------------------");
		
		
		/* Contains */
		
		System.out.println("Contains: "+ hs.contains("Programming"));
		System.out.println("------------------------------------");
		
		/* Accessing Hashcode*/
		System.out.println("Hashcode: "+ hs.hashCode());
		System.out.println("------------------------------------");
		
		/* Is empty*/
		System.out.println("Is Empty: "+ hs.isEmpty());
		System.out.println("------------------------------------");
		
		/* Remove an item*/
		hs.remove("Programming");
		System.out.println("After removing Programming: "+ hs);
		System.out.println("------------------------------------");
		
		printUsingIterator(hs);
		System.out.println();
		System.out.println("------------------------------------");
		/* Remove All*/
		hs.removeAll(hs);
		System.out.println("After removing all size: "+ hs.size());
		System.out.println("Is Empty: "+ hs.isEmpty());
		System.out.println("------------------------------------");
	}
	
	public static void printUsingIterator(Set<String> hset) throws Exception {
		Iterator<String> it = hset.iterator();
		System.out.print("Priting Hashset elemnts Using Itertor -->");
		while(it.hasNext()){  
			System.out.print(it.next() + ", ");  
		}
	}
	
	public static void hashSetAlgos() throws Exception {
		HashSet <String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("Is");
		hs.add("Object");
		hs.add("Oriented");
		hs.add("Programming");
		hs.add("Language");
		
		/* Max */
		System.out.println("Max: "+ Collections.max(hs));
		System.out.println("Min: "+ Collections.min(hs));
		
		
		
	}
}
