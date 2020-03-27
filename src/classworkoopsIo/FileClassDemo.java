package classworkoopsIo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileClassDemo {


	public static void main(String[] args) throws Exception {
		//createFile();
		managingDirectories();

	}

	public static void createFile() throws Exception {
		
			/* Creating a File*/
		   File file = new File("FileDemoNewFile.txt");  
	       if (file.createNewFile()) {  
	           System.out.println("New File is created!");  
	       } else {  
	           System.out.println("File already exists.");  
	       }  
	       
	       /* Writing to File*/
	       FileWriter writer = new FileWriter(file);
	       writer.write("Selenium training by H2kInfosys");
	       writer.close();
	   
	       /* Checking File exist*/
	       System.out.println("File Exist:" + file.exists());  
	       
	       System.out.println("Get Absolute Path :" + file.getAbsolutePath());
	       System.out.println("Get File Name :" + file.getName());
	       
	       System.out.println("Get Last Modified :" + file.lastModified());
	       System.out.println("Get Length :" + file.length());
	       System.out.println("Can Read :" + file.canRead());
	       System.out.println("Can Write :" + file.canWrite());
	       System.out.println("Is Directory :" + file.isDirectory());
	       System.out.println("Is File :" + file.isFile());
	       System.out.println("Set Read Only :" + file.setReadOnly());
	       System.out.println("Can Read after Setting Read only :" + file.canRead());
	       System.out.println("Can Write after Setting Read only :" + file.canWrite());
//	       System.out.println("Rename with Path :" + file.renameTo(new File("D:\\SeleniumTraining\\newRenamedFile.txt")));
//	       System.out.println("Rename :" + file.renameTo(new File("RenamedFile.txt")));

	       System.out.println("Delete File :" + file.delete());
	       System.out.println("File Exist:" + file.exists());  
	       
	}

	public static void managingDirectories() throws IOException {

		/* Accessing Directory and reading file names*/
		 File myfolder =new File("D:\\SeleniumTraining\\12_30Selenium\\JavaBasics");  
		    String filenames[]=myfolder.list();  
		    for(String filename:filenames){  
		        System.out.println(filename);  
		    }  
		    System.out.println("--------------------------------- ");
		    
		    System.out.println(" get Parent : " + myfolder.getParent());
		    System.out.println(" get Path : " + myfolder.getPath());
		    System.out.println(" IS Directory : " + myfolder.isDirectory());
		    System.out.println(" IS File : " + myfolder.isFile());
		    System.out.println("--------------------------------- ");
		    /* Create a Directory*/
		    File myfolder2 =new File("C:\\Users\\usgsak\\Selenium\\myFolder\\");
		    System.out.println(myfolder2.mkdir());
		    
		    /* Create Multiple Directories*/
		    File myfolder3 =new File("C:\\Users\\usgsak\\Selenium\\mdir1\\mdir2");
		    System.out.println(myfolder3.mkdirs());

		    /* Delete Directory*/
		    File delDirectory =new File("C:\\Users\\usgsak\\Selenium\\mdir1\\mdir2");
		    System.out.println(" IS Directory : " + delDirectory.isDirectory());
		    System.out.println(" Delete : " + delDirectory.delete());
		    
		    
	}
	
}
