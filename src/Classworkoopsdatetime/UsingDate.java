package Classworkoopsdatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsingDate {

	   public static void main(String args[]) {
		      // Instantiate a Date object
		      Date date = new Date();
		      // display time and date using toString()
		      System.out.println(date.toString());
		      
		      SimpleDateFormat ft = 
		    	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a z");
		      
		      System.out.println("Formatted Date: " + ft.format(date));
		      
		      
		      SimpleDateFormat ft1 = 
		    	      new SimpleDateFormat ("MMM-dd-yyyy");
		      System.out.println("Formatted Date: " + ft1.format(date));
		      
		      SimpleDateFormat ft2 = 
		    	      new SimpleDateFormat ("E MMMM/dd/yyyy HH:mm:ss F z");
		      System.out.println("Formatted Date: " + ft2.format(date));
		}


}
