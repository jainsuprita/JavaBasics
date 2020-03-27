package ExercisesOops;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsingHashMap {

	public static void main(String[] args) throws Exception {
		hashMap();
	}

	public static void hashMap() throws Exception {
		
		Map<String,String> hm= new HashMap<String, String>();
		Map<String,Integer> hm1= new HashMap<String,Integer>();
		
		/* Adding Key Value Pairs and Print*/
		hm.put("Login_ID:", "Admin");
		hm.put("Login_Pwd:", "testpassword");
		hm.put("Search_type", "Hotel");
		hm.put(	"Destination:", "Lasvegas");
		hm.put("Cust_name :", "John");
		hm1.put("Cust_phone", 1234563456);
				
		System.out.println("Printing Hashmap : " + hm);
		System.out.println("---------------------------");
		System.out.println("Size of HashMap : " + hm.size());
		System.out.println("---------------------------");
		System.out.println("Printing Hashmap1 : " + hm1);
		System.out.println("---------------------------");
		System.out.println("Size  of HashMap1: " + hm1.size());
		System.out.println("---------------------------");
		
		/* Replace Key - Value  */
		hm.replace("Cust_name :", "Steve" );
		System.out.println(" After Replace  : " + hm);
		System.out.println("---------------------------");
		
			
	
		/* Remove an item*/
		hm1.remove("cust_phone");
		System.out.println("After removing cust_phone: " + hm1);
		System.out.println("Size  of HashMap1: " + hm1.size());
		//System.out.println("Printing Hashmap1 : " + hm1);
						
		
	} 

}
