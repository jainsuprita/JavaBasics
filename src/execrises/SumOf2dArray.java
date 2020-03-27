package execrises;

public class SumOf2dArray {

	public static void main(String[] args) {
		
		int[][] V ;
		V = new int[4][4];
		int Sum = 0;
		 
		V[0][0]= 11;
		V[0][1]= 12;
		V[0][2]= 13;
		V[0][3]= 14;
		
		V[1][0]= 21;
		V[1][1]= 22;
		V[1][2]= 23;
		V[1][3]= 24;
		
		V[2][0]= 31;
		V[2][1]= 32;
		V[2][2]= 33;
		V[2][3]= 34;
		
		V[3][0]= 41;
		V[3][1]= 42;
		V[3][2]= 43;
		V[3][3]= 44;
		
        for(int i = 0; i < 4; i++) { 
			
			for(int j=0; j < 4; j++) { 
				System.out.println(V[i][j]);
		 // sum of 2d array 		
				Sum = Sum + V[i][j];
										
			}
						
			System.out.println("Sum of the 2d array " +Sum );
			
		}
		
	}

}
