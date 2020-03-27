package ExercisesOops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class UsingListArray {
   public static void main(String[] args) {
      
      // create an empty array list with an initial capacity
      ArrayList<Integer> arrlist = new ArrayList<Integer>();

      // use add() method to add elements in the list
      arrlist.add(23);
      arrlist.add(45);
      arrlist.add(12);
      arrlist.add(47);
      arrlist.add(36);
      arrlist.add(79);
      arrlist.add(67);
      arrlist.add(45);
      arrlist.add(28);
      arrlist.add(15);
      arrlist.add(67);
      arrlist.add(46);
      arrlist.add(20);

      // let us print all the elements available in list
      for (Integer number : arrlist) {
         System.out.println("Number = " + number);
         //System.out.println("---------------------------");

      } 
    /*  public static void printUsingIterator(List<String> arrlist) 
      {
  		Iterator<Integer> it = arrlist.iterator();
  		System.out.print("Printing List elemnts Using Itertor -->");
  		while(it.hasNext()){  
  			System.out.print(it.next() + "\t");  
  		}
  			printUsingIterator(arrlist);
  			System.out.println();
  			System.out.println("---------------------------");

  		
     }*/
      
      // removes  element at 4th postion
      int remove = arrlist.get(5);
      System.out.println("Removed  element is = " + remove);
      System.out.println("---------------------------");

      
      /* Sorting  List*/
        System.out.println("Before  Sorting : " +arrlist);
		Collections.sort(arrlist);
		System.out.println("After Sorting : ");
		System.out.println(arrlist);
		System.out.println("---------------------------");

      
      /* Shuffling List */
		System.out.println("Before  Shuffle : "+arrlist);
		Collections.shuffle(arrlist,new Random(20));
		System.out.println("After Shuffle : ");
		System.out.println(arrlist);
		System.out.println("---------------------------");

		
		// retrieves/printing  element at 4th postion
	      int retval = arrlist.get(3);
	      System.out.println("Retrieved element is = " + retval);
	      System.out.println("---------------------------");

	      
	      /* Reversing List*/
	      System.out.println("Before  Reverse : " +arrlist);
			Collections.reverse(arrlist);
			System.out.println("After Reverse : ");
			System.out.println(arrlist);
			System.out.println("---------------------------");
			
			/* Finding Size */
			System.out.println("Array List Size :" +arrlist.size());
			System.out.println("---------------------------");
   }

//private static void printUsingIterator(ArrayList<Integer> arrlist) {
	// TODO Auto-generated method stub
	
}
			
			// Accessing and Printing Elements in Array list Using Iterator
	
  