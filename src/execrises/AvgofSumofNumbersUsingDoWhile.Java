package exercises;

public class AvgofSumofNumbersUsingDoWhile {

	public static void main(String[] args) {

		int i =1; 
		int sum = 0;
		do {
			sum = sum+i;
			i++;
		} while(i <= 100);
		System.out.println(i);
		float res=0.0f;
		res = (float)sum/100;
		System.out.println("Sum : " + sum);
		System.out.println("Average : "+ res);
	}

}
