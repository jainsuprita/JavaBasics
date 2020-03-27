package classwork;

public class UsingTwoDimentionalArray {

	public static void main(String[] args) {
		
		int[][] tabValues ;
		tabValues = new int[4][5];
		
		tabValues[0][0] = 11;
		tabValues[0][1] = 12;
		tabValues[0][2] = 13;
		tabValues[0][3] = 14;
		tabValues[0][4] = 15;
		
		tabValues[1][0] = 21;
		tabValues[1][1] = 22;
		tabValues[1][2] = 23;
		tabValues[1][3] = 24;
		tabValues[1][4] = 25;
		
		tabValues[2][0] = 31;
		tabValues[2][1] = 32;
		tabValues[2][2] = 33;
		tabValues[2][3] = 34;
		tabValues[2][4] = 35;
		
		tabValues[3][0] = 41;
		tabValues[3][1] = 42;
		tabValues[3][2] = 43;
		tabValues[3][3] = 44;
		tabValues[3][4] = 45;
		
		for(int i = 0; i < 4; i++) { //0, 1, 2
			
			for(int j=0; j < 5; j++) { //0
				System.out.println(tabValues[i][j]);
				
			}
		}
		
		tabValues[3][4] = 100;
		System.out.println(tabValues[3][4]);
		
		int[][] tabVal2 = {  { 1, 2, 3, 4, 5},
							   { 10, 11, 12, 13, 14},
							   { 20, 21, 22, 23, 24},
								};
		System.out.println(tabVal2[0].length);
		
		
		
		
		
	}

}
