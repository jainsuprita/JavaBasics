package execrises;

import java.util.Scanner;

public class FruitNameSwitch {

			 public static void main(String[] args) {

	            Scanner in = new Scanner(System.in);

	            System.out.print("Enter Fruit Number : ");

	            char  FruitName;

	            FruitName = (char) in.nextInt();

	            switch (FruitName) {

	            case 1:

	                  System.out.println("APPLE");

	                  break;

	            case 2:

	                  System.out.println("Orange");

	                  break;

	            case 3:

	                  System.out.println("Grape");

	                  break;

	            case 4:

	                  System.out.println("Strawberry");

	                  break;

	            case 5:

	                  System.out.println("Mango");

	                  break;

	            case 6:

	                  System.out.println("Peach");

	                  break;

	            case 7:

	                  System.out.println("Kiwi");

	                  break;

	            case 8:

	                  System.out.println("Blueberries");

	                  break;

	           
	            default:

	                  System.out.println("Invalid Fruit Name or not in the list .");

	                //  break ;
	                  
	            }

	      }

	
	}


