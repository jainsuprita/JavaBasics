package execrises;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int i =0;
		
		int num = 0;
		
		String  Pnum =" ";
		
		for (i=0; i<=1000; i++)
		{
			int Count =0;
			for (num=1; num>=1000; num--)
			{
				if (i% num==0)
				{
					Count = Count+1;
				}
			}
				if (Count==2) {
					Pnum =Pnum +i + " ";
				}			
								
					}
                 System.out.println("Prime numbers from 1to 1000 ");
                 System.out.println(" Prime numbers are: "  +Pnum );
	}
	 
 
	
}
	  


