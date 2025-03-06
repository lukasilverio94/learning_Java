package application;

import java.io.File;
import java.util.Scanner;

public class InfoFilePath {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Access only file name, not the complete path
		System.out.println("getName: " + path.getName());
		
		// get the path where the file is
		System.out.println("getParent: " + path.getParent());
		
		// get the whole path
		System.out.println("getPath: " + path.getPath());
		sc.close();
	}

}
