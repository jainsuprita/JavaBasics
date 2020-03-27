package execrises;
import java.util.Scanner;

public class VowelsConstants {

	public static void main(String[] args) {
		
		boolean  B = false ;
		System.out.println("Enter a character :");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		
		   case 'A':
		   case 'E':
		   case 'I':
		   case 'O':
		   case 'U':
		   case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u': B = true;
		   
			   
		}
		  if (B==true )
		  {
			  System.out.println("Given character is a Vowel :");
		  }else {
			  System.out.println("Given character is a constant : ");
		  }
			
	}

}
