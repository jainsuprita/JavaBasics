package classworkoopscollections;

import java.util.Iterator;
import java.util.PriorityQueue;


public class QueueDemo{  
	public static void main(String args[]){  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Java");  
		queue.add("language");  
		queue.add("Object");  
		queue.add("Oriented");  
		queue.add("Programming");  
		queue.add("Language"); 
		System.out.println(queue);
		System.out.println("------------------------------"); 
		System.out.println("head:"+queue.element());  
		System.out.println("------------------------------"); 
		System.out.println("peek:"+queue.peek());  
		System.out.println("------------------------------"); 
		System.out.println("iterating the queue elements:");  
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("------------------------------"); 
		queue.remove();  
		System.out.println("After Remove" + queue);
		System.out.println("------------------------------"); 
		queue.remove();  
		System.out.println("After Second Remove" + queue);
		System.out.println("------------------------------");
		queue.remove();  
		System.out.println("After Third Remove" + queue);
		System.out.println("------------------------------");
		String retFlag = queue.poll();
		
		System.out.println("Return Flag : " + retFlag);
		if(retFlag.isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Queue is not empty");
		}
		System.out.println("After Poll " + queue);
		System.out.println("------------------------------"); 
		queue.add("H2kInfo");
		System.out.println("After Added new element" + queue);
		queue.remove();  
		System.out.println("After Added new element" + queue);
		queue.remove();  
		System.out.println("After Added new element" + queue);
		queue.remove();  
		System.out.println("After Added new element" + queue);
	}
}  


