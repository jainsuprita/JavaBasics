package classworkoopsIo;


	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class CharStreamDemo {

		public static void main(String[] args) throws IOException {
			
			//createCharStreamFile();
			copyCharStreamFile();
		}
		
		public static void createCharStreamFile() throws IOException {
			
		        FileWriter oStream = null;
		        String fileContent = "My first char stream file";
		        
		        System.out.println(System.getProperty("user.dir"));
		        
		        try {
		        	oStream = new FileWriter("myNewCharFile.txt");
		        	oStream.write(fileContent);
		        	oStream.append("\nMy appended Text");
		        } finally {

		            if (oStream != null) {
		            	oStream.close();
		            }
		        }
		        System.out.println("File Created");
		}
		public static void copyCharStreamFile() throws IOException {
			
	        FileReader inputStream = null;
	        FileWriter outputStream = null;

	        try {
	            inputStream = new FileReader("myNewCharFile.txt");
	            outputStream = new FileWriter("copyCharFile.txt");
	            
	            int c;
	            while ((c = inputStream.read()) != -1) {
	                outputStream.write(c);
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
