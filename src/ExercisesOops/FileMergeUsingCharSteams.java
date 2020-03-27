package ExercisesOops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileMergeUsingCharSteams {

	public static void main(String[] args) throws Exception {


			
	        FileReader inputfile1 = null;
	        FileReader inputfile2 = null;
	        
	        FileWriter outputStream = null;
	        
			BufferedReader br1 = null;
			BufferedReader br2 = null;
			
			BufferedWriter bw = null;

	        try {
	        	/* Reading from Files*/
	        	inputfile1 = new FileReader("myNewCharFile.txt");
	        	br1 = new BufferedReader(inputfile1);
	        	inputfile2 = new FileReader("copyCharFile.txt");
	        	br2 = new BufferedReader(inputfile2);
	        	
	        	/* Writing to new file */
	            outputStream = new FileWriter("FileMerge.txt");
	            bw = new BufferedWriter(outputStream);
	            String l;
	            while ((l = br1.readLine()) != null) {
	            	bw.write(l);
	            	bw.write("\n");
	            }
	            while ((l = br2.readLine()) != null) {
	            	bw.write(l);
	            	bw.write("\n");
	            }
	            bw.flush();
	        } finally {
	        	
	            if (br1 != null) {
	            	br1.close();
	            }
	            if (br2 != null) {
	            	br2.close();
	            }
	            if (bw != null) {
	                bw.close();
	            }

	            if (inputfile1 != null) {
	            	inputfile1.close();
	            }
	            if (inputfile2 != null) {
	            	inputfile2.close();
	            }
	            if (outputStream != null) {
	                outputStream.close();
	            }
	        }
	        System.out.println("File Merged");
		}

	}