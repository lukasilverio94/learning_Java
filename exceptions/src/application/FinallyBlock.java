package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		File file = new File("/tmp/test.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (sc != null) {
				sc.close();		
				System.out.println();
				System.out.println("It runs anyway, if exception or not!");
			}
		}
	}

}
