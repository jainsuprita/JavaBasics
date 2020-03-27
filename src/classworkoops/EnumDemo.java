package classworkoops;

public class EnumDemo {
	
	enum InclassEnum {
		
		January, February, March, April, May, June, July;

	}

	
	public static void main(String[] args) {
		
		/* Accessing by Variable */
		WeekDaysEnum day = WeekDaysEnum.Saturday;
		System.out.println(day);

		WeekDaysEnum.values();
		/* Printing by Enum Literal*/
		System.out.println("------------------");
		System.out.println(WeekDaysEnum.Sunday);
		/* Print all Enum list using Values */
		System.out.println("------------------");
		WeekDaysEnum[] myEnums = WeekDaysEnum.values();
		for(WeekDaysEnum enumVal : myEnums) {
			System.out.println(enumVal);
		}
		/* Print a Enum constant using ValueOf */
		System.out.println("------------------");
		System.out.println(WeekDaysEnum.valueOf("Saturday"));
		
		
		System.out.println(InclassEnum.January);
					
	}

}
