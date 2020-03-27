
		package execrises;

		import java.util.Scanner;

		public class FruitColorSwitch {

			public static void main(String[] args) {
				
				String strFruitName;
				String strFruitColor;
				
				System.out.println("Enter the name of a fruit: ");
				Scanner sc = new Scanner(System.in);
				strFruitName = sc.next();
				
				switch (strFruitName) 
				{
					case "strawberry":
					case "apple":
						strFruitColor = "red";				
						break;
					case "banana":
						strFruitColor = "yellow";
						break;				
					case "grape":
						strFruitColor = "purple";
						break;				
					case "orange":
						strFruitColor = "orange";
						break;				
					case "pear":
						strFruitColor = "green";
						break;	
					case "Mango":
						strFruitColor = "Myellow ";
						break;			
					default:
						strFruitColor = "an invalid fruit";
				}

				System.out.println("---   " + strFruitName + " is " + strFruitColor + "   ---");
				//sc.close();


			}

		}

