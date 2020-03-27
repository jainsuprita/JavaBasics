package ExercisesOops;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BSFileDemo {

		public static void main(String[] args) throws IOException  {

			createNewFileFromInput();
	    }
	    
	    public static void createNewFileFromInput()  throws IOException{
	    	
	       FileOutputStream out = null;
	        
	        System.out.println(System.getProperty("user.dir"));
		    try {
		       Scanner scanner = new Scanner(System.in);
	    	   String  ipString = "";
	    	   out = new FileOutputStream("MyByteExerciseFile.txt");
	    	   System.out.println("Enter File content - type 'end' to finish");
	 		   ipString = scanner.next();
	    	   while(!ipString.equalsIgnoreCase("End")) {
	    		   out.write(ipString.getBytes());
	    		   out.write("\n".getBytes());
	     		   ipString = scanner.next();
	    	   }
	        } finally {
	            if (out != null) {
	                out.close();
	            }
	        }
	        System.out.println("File Created");
	    }

	}

