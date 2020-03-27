package classworkoopsIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedStreamsDemo {

	public static void main(String[] args) throws IOException {
		
		bufferedFileCreation();
		copyBufCharFile();
	}
	
	public static void bufferedFileCreation() throws IOException {
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
        String fileContent = "My first buffered char stream file\n";
        
        try {
			fw = new FileWriter("MyCharBufFile.txt");
			
			
			bw = new BufferedWriter(fw);
			bw.write(fileContent);
			bw.append("My Appended text \n");
			bw.append("END OF FILE");
			bw.flush();// write to file immediately
			bw.append("\nafter flush");
			bw.append("\nafter flush2");
        } finally {

        	if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();
        }
        System.out.println("File Created");
	}
	
	public static void copyBufCharFile() throws IOException {
        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;
        
        FileReader fr = null;
        FileWriter fw = null;
        
        try {
        	fr = new FileReader("MyCharBufFile.txt");
        	fw = new FileWriter("copyMyCharBufFile.txt");
            inputStream = new BufferedReader(fr);
            outputStream = new BufferedWriter(fw);

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.write(l);
                outputStream.write("\n");
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        System.out.println("File Copied");
	}
	

}
