package application;

import java.io.File;
import java.util.Scanner;

public class FolderWithFiles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// DISPLAY FOLDERS
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");

		for (File folder : folders) {
			System.out.println(folder);
		}
		// END DISPLAY FOLDERS
		
		System.out.println();
		
		// DISPLAY FILES (NOT FOLDERS)
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		// END DISPLAY FILES
		
		// CREATE SUBFOLDER BASED ON THE PATH FROM INPUT (e.g "/tmp")
		boolean isSubfolderCreatedSuccessfull = new File(strPath + "/subdir").mkdir();
		System.out.println("Directory created successfuly: " + isSubfolderCreatedSuccessfull);
		sc.close();
	}

}
