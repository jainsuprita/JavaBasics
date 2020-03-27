package ExercisesOops;

public class StringOps {

	public static void main(String[] args) {
		
		String myString = "Selenium automates browsers. That's it !";
		
		String[] myArray = {"Florida","Georgia","Hawaii","Idaho","Alabama"};
        System.out.println("Size: " + myArray.length);
        for (int i=0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            
        }	
        
        System.out.println("..................................");
		//System.out.println('------------------------');
//  find the Length //
		System.out.println(" Length : " + myString.length());
		
// Replace Selenium with Webdriver //
		System.out.println(" Replace: " + myString.replace("Selenium", "Webdriver" ));
		
		// Split string with ‘ (single quote) as delimiter//
		String[] myArr = myString.split("'");
		System.out.println("Split element 1: " + myArr[0]);
		System.out.println("Split element 2 : " + myArr[1]);	
		
		
// Find char at index 12 //
		System.out.println(" Char At: " + myString.charAt(12));
		
// Replace  ! with ?//
		
		System.out.println(" Replace: " + myString.replace("!", "?"));
		}

}



