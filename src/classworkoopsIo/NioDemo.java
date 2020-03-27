package classworkoopsIo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NioDemo {
	
	public static void main(String[] args) throws Exception  {
		
		createFile();
		//createDirectory();
		//filesOperations();
	}
	
	/* Introduced from Java7*/
	public static void createFile() throws Exception
	{
		//Java 7 introduced Files utility class and we can write a file using it’s write function, internally it’s using OutputStream to write byte array into file.
	    String fileContent = "Selenium training by H2K Infosys";
	    Path path = Paths.get("fileUsingPath.txt");
	    Files.write(path, fileContent.getBytes());
	    System.out.println("File created using Path.");
	    System.out.println("Get File name : " + path.getFileName());
	}
	
	public static void createDirectory()  {
		Path path = Paths.get("C:\\Users\\usgsak\\Selenium");
	    //if directory exists?
	    if (!Files.exists(path)) {
	        try {
	            Files.createDirectories(path);
	        } catch (Exception e) {
	            //fail to create directory
	            e.printStackTrace();
	        }
	    }
        System.out.println("Directory Created");
	}
	public static void filesOperations() throws Exception {
		
		/* To copy a file*/
//		Path source = Paths.get("fileUsingPath.txt");
//		Path destCopy = Paths.get("CopiedFile.txt");
//		Files.copy(source, destCopy, StandardCopyOption.REPLACE_EXISTING );
//		System.out.println("Copied");
//		System.out.println(Files.isDirectory(source));
		
		/* To move file to another location with different name*/
//		Path source = Paths.get("CopiedFile.txt");
//		Path destDir = Paths.get("D:\\SeleniumTraining\\12_30Selenium\\JavaBasics\\nioDirectory\\CopiedFile_moved.txt");
//		Files.move(source, destDir, StandardCopyOption.REPLACE_EXISTING);
//		System.out.println("File move complete");
		
		/* Delete a file*/
//		Path dirFile = Paths.get("D:\\SeleniumTraining\\12_30Selenium\\JavaBasics\\nioDirectory\\CopiedFile_moved.txt");
//		Files.delete(dirFile);
		
		/* Delete a directory */
//		Path delDir = Paths.get("D:\\SeleniumTraining\\12_30Selenium\\JavaBasics\\nioDirectory");
//		Files.delete(delDir);
		
	}
	
}
