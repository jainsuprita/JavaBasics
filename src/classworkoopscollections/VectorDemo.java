package classworkoopscollections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class VectorDemo {
	

	public static void main(String[] args) throws Exception {
		
		vectorShow();
	}
	
	public static void vectorShow() throws Exception {
		Vector<Integer> mv = new Vector<Integer>();
		mv.add(3);
		mv.add(5);
		mv.add(7);
		mv.add(8);
		mv.add(9);
		mv.add(12);
		mv.add(16);
		mv.add(18);
		mv.add(19);
		mv.add(14);
		mv.add(145);
		mv.add(145);
		mv.add(145);
		mv.add(145);
		mv.add(145);
		mv.add(145);
		mv.add(145);
		mv.add(145);
		mv.add(145);
		mv.add(145);
		mv.add(145);
		System.out.println(mv);
		System.out.println("Capacity : "+ mv.capacity());
		System.out.println("Size : "+ mv.size());
		
		mv.remove(20);
		mv.remove(10);
		mv.remove(0);
		mv.remove(5);
		
		System.out.println("Capacity(after Delete) : "+ mv.capacity());
		System.out.println("Size (after Delete): "+ mv.size());
		
		System.out.println("Item at index 9 : "+ mv.get(9));
		System.out.println("Remove item at index 10 : "+ mv.remove(10));
		System.out.println("Capacity after removing item: "+ mv.capacity());
		System.out.println("Size after removing item: "+ mv.size());
		System.out.println();
		printUsingIterator(mv);
		System.out.println();
		Collections.sort(mv);
		System.out.println("After Sorting : " + mv);
		Collections.shuffle(mv);
		System.out.println("After Shuffle : " + mv);
		Collections.reverse(mv);
		System.out.println("After Reverse : " + mv);
		
		/* Traversing using Enumeration*/
        Enumeration<Integer> e = mv.elements(); 
        System.out.print(" Using Enumeration--> " );
        while (e.hasMoreElements()) {
            System.out.print( e.nextElement() + " "); 
        }
        
		
	}
	/* Traversing using Iterator*/
	public static void printUsingIterator(List<Integer> arlist) throws Exception {
		Iterator<Integer> it = arlist.iterator();
		System.out.print("Priting Vector elemnts Using Itertor -->");
		while(it.hasNext()){  
			System.out.print(it.next() + " ");  
		}
	}
}
