package execrises;

import java.util.Calendar;

public class PrintNumberWord {

	
	public static void main(String[] args) {
		int i = 10;
		Calendar startTime = Calendar.getInstance();
		if(i==1) {
			System.out.println("One");
		} else if(i==2) {
			System.out.println("Two");
		} else if(i==3) {
			System.out.println("Three");
		} else if(i==4) {
			System.out.println("Four");
		} else if(i==5) {
			System.out.println("Five");
		} else if(i==6) {
			System.out.println("Six");
		} else if(i==7) {
			System.out.println("Seven");
		} else if(i==8) {
			System.out.println("Eight");
		} else if(i==9) {
			System.out.println("Nine");
		} else if(i==10) {
			System.out.println("Ten");		
		}else {
			System.out.println("Invalid value");
		}
		Calendar endtime = Calendar.getInstance();
		System.out.println("time diff with if: "+ (endtime.getTimeInMillis() - startTime.getTimeInMillis() ));
	
		System.out.println("----------------------------------");
		
		int j = 9;
		Calendar startTime2 = Calendar.getInstance();
		switch(j){
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;			
			case 5:
				System.out.println("Five");
				break;			
			case 6:
				System.out.println("Six");
				break;			
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			case 10:
				System.out.println("Ten");		
				break;
			default :
				System.out.println("Invalid value");
				break;
			}
		Calendar endtime2 = Calendar.getInstance();
		System.out.println("time diff switch : "+ (endtime2.getTimeInMillis() - startTime2.getTimeInMillis() ));
	}
}
