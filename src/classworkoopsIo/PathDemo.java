package classworkoopsIo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	
	public static void main(String[] args) {
		
		Path mypath = Paths.get("C:\\Users\\usgsak\\Selenium"); 
		System.out.println ("toString: " + mypath.toString());
		System.out.println("getFile/Folder Name: " + mypath.getFileName());
		System.out.println("getName(0): " + mypath.getName(0));
		System.out.println("getName(1): " + mypath.getName(1));
		System.out.println("getNameCount: " + mypath.getNameCount());
		System.out.println("subpath(0,2): " +  mypath.subpath(0,2));
		System.out.println("getParent: " +  mypath.getParent());
		System.out.println("getRoot: " +  mypath.getRoot());
		
		
	}
	
	

}
