package ExercisesOops;


	import java.util.Collections;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Set;

	public class HashsetIntergerDemo {
		public static void main(String[] args) throws Exception {
			hashSet();
		}

		public static void hashSet() throws Exception{
			
			Set <Integer> hs = new HashSet<Integer>();
			/* Adding Values and Print Hashset */
			hs.add(123);
			hs.add(232);
			hs.add(143);
			hs.add(256);
			hs.add(677);
			hs.add(453);
			hs.add(676);
			hs.add(907);
			System.out.println("Printing Hashset: "+ hs);
			System.out.println("------------------------------------");
			
			/* Size*/
			System.out.println("Size : "+ hs.size());
			System.out.println("------------------------------------");
			
			/* Contains */
			System.out.println("Contains: "+ hs.contains(907));
			System.out.println("------------------------------------");
			
			/* Accessing Hashcode*/
			System.out.println("Hashcode: "+ hs.hashCode());
			System.out.println("------------------------------------");
			
			/* Is empty*/
			System.out.println("Is Empty: "+ hs.isEmpty());
			System.out.println("------------------------------------");
			
			/* Remove an item*/
			hs.remove(907);
			System.out.println("After removing 907: "+ hs);
			System.out.println("------------------------------------");
			
			printUsingIterator(hs);
			System.out.println();
			System.out.println("------------------------------------");
			System.out.println("Max: "+ Collections.max(hs));
			System.out.println("Min: "+ Collections.min(hs));
		}
		
		public static void printUsingIterator(Set<Integer> hset) throws Exception {
			Iterator<Integer> it = hset.iterator();
			System.out.print("Printing Hashset elemnts Using Itertor -->");
			while(it.hasNext()){  
				System.out.print(it.next() + ", ");  
			}
		}
		
	}
