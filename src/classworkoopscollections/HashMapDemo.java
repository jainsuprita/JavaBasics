package classworkoopscollections;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;

	public class HashMapDemo {

		
		public static void main(String[] args) throws Exception {
			hashMap();
		}

		public static void hashMap() throws Exception {
			
			Map<Integer,String> hm= new HashMap<Integer, String>();
			
			/* Adding Key Value Pairs and Print*/
			hm.put(1, "Java");
			hm.put(2, "Selenium");
			hm.put(3, "By");
			hm.put(4, "H2K");
			hm.put(5, "Infosys");
			
			System.out.println("Printing Hashmap : " + hm);
			System.out.println("---------------------------");
			
			/* Size of HashMap */
			System.out.println("Size : " + hm.size());
			System.out.println("---------------------------");
			
			/* Accessing Value by Key */
			System.out.println("Accessing Value by Key : " + hm.get(5));
			System.out.println("---------------------------");
			
			/* Replace Key - Value  */
			hm.replace(1, "C++");
			System.out.println(" After Replace : " + hm);
			System.out.println("---------------------------");
			
			/* Replace Key - Value  */
			hm.replace(1, "C++" , "Java");
			System.out.println(" After Replace 2 : " + hm);
			System.out.println("---------------------------");
			
			
			/* Accessing Key Set*/
			Set<Integer>setValues = hm.keySet();
			System.out.println("Key Set : " +setValues);
			System.out.println("---------------------------");
			
			/* Accessing Values  */
			System.out.println(" Values Set : " + hm.values());
			System.out.println("---------------------------");
			
			/* Removing a Value by its Key*/
			hm.remove(1);
			System.out.println(" After Deleting Key 1 : " + hm);
			System.out.println("---------------------------");
			
			/* Removing a Value by its Key and Value*/
			hm.remove(4, "H2K");
			System.out.println(" After Deleting Key 2 and Value : " + hm);
			System.out.println("---------------------------");
			
			/* Check whether a key and value contains*/
			System.out.println("Key contains for 2-->" + hm.containsKey(2));
			System.out.println("Key contains for Infosys value-->" + hm.containsValue("Infosys"));
		}

	}
