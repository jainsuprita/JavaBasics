package classworkoopsIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    
	public static void main(String[] args) throws IOException  {

    	createNewFileFromString();
    	copyFile();
    }
    
    public static void createNewFileFromString() throws IOException  {
    	
        FileOutputStream out = null;
        String fileText = "This is my first new file";
        String fileText2 ="\nThis is my second Line";
        System.out.println(System.getProperty("user.dir"));

      try {
        	
    	   //out = new FileOutputStream("D:\\SeleniumTraining\\12_30Selenium\\JavaBasics\\IOFiles\\myNewByteFile.txt");
    	  out = new FileOutputStream("myNewByteFile.txt");
    	  
            out.write(fileText.getBytes());
            out.write( fileText2.getBytes());
            
      } catch(Exception e) {
    	  e.printStackTrace();
      } finally {
            if (out != null) {
                out.close();
            }
       }
        System.out.println("File Created");
    }
    
    
    
    
    public static void copyFile() throws IOException {
    	
    	  FileInputStream in = null;
          FileOutputStream out = null;
          
          System.out.println(System.getProperty("user.dir"));

          try {
        	  in = new FileInputStream("myNewByteFile.txt");
              
              out = new FileOutputStream("copiedByteFile.txt");
              int c;
              while ((c = in.read()) != -1) {
                  out.write(c);
              }
          } finally {
              if (in != null) {
                  in.close();
              }
              if (out != null) {
                  out.close();
              }
          }
          System.out.println("File Copied");
    }
    
}
