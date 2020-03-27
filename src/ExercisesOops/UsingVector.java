package ExercisesOops;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class UsingVector {

	

  public static void main(String[] args) throws Exception {
			
			vectorShow();
		}

		
		public static void vectorShow() throws Exception {
			Vector<String> myV = new Vector<String>();
			myV.add("Steve");
			myV.add("Mike");
			myV.add("John");
			myV.add("Chris");
			myV.add("Peter");
			myV.add("Julie");
			myV.add("Cathy");
			myV.add("Matt");
			myV.add("James");
			myV.add("Larry");
			myV.add("stacey");
			myV.add("stephen");
			
			System.out.println(myV);
			System.out.println("Capacity : "+ myV.capacity());
			System.out.println("Size : "+ myV.size());
			
			myV.remove(10);
			//myV.remove(5);
			//myV.remove(0);
			
			System.out.println("Item at index 9 : "+ myV.get(9));
			System.out.println("Remove item at index 10 : "+ myV.remove(10));
			System.out.println("Capacity after removing item: "+ myV.capacity());
			System.out.println("Size after removing item: "+ myV.size());
			System.out.println();
			printUsingIterator(myV);
			System.out.println();
			Collections.sort(myV);
			System.out.println("After Sorting : " + myV);
			Collections.shuffle(myV);
			System.out.println("After Shuffle : " + myV);
			Collections.reverse(myV);
			System.out.println("After Reverse : " + myV);
			
			
			 /* Sorting  List*/
	        System.out.println("Before  Sorting : " +myV);
			Collections.sort(myV);
			System.out.println("After Sorting : ");
			System.out.println(myV);
			System.out.println("---------------------------");

	      
	      /* Shuffling List */
			System.out.println("Before  Shuffle : "+myV);
			Collections.shuffle(myV,new Random(5));
			System.out.println("After Shuffle : ");
			System.out.println(myV);
			System.out.println("---------------------------");

			
			/* Traversing using Enumeration*/
	        Enumeration<String> e = myV.elements(); 
	        System.out.print(" Using Enumeration--> " );
	        while (e.hasMoreElements()) {
	            System.out.print( e.nextElement() + " "); 
	        }
	        
			
		}
		/* Traversing using Iterator*/
		public static void printUsingIterator(Vector<String> myV) throws Exception {
			Iterator<String> it = myV.iterator();
			System.out.print("Priting Vector elemnts Using Itertor -->");
			while(it.hasNext()){  
				System.out.print(it.next() + " ");  
			}
		}
	}

			
		