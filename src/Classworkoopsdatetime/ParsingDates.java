package Classworkoopsdatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParsingDates {

		   public static void main(String args[])  {
			      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
			      SimpleDateFormat ft2 = new SimpleDateFormat ("E MMM/dd/yyyy z"); 
			      String input = "2020-01-01 14:24:32";
			      Date t;
			      try {
			         t = ft.parse(input); 
			         System.out.println(t);
			         System.out.println(ft2.format(t));
			         
			      } catch (ParseException e) { 
			    	  e.printStackTrace();
			         //System.out.println("Unparseable using " + ft); 
			      }
			      
			      

			}
		   

}
