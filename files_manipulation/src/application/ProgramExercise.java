package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class ProgramExercise {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> listProducts = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		// create out folder
		boolean isOutFolderCreated = new File(sourceFolderStr + "/out").mkdir();
		// target file (where we will write the result)
		String targetFileStr = sourceFolderStr + "/out/summary.csv";
		
		// Try with resources block
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			// if enter here, that means could read the file (/tmp/input.csv)
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				// instantiate Product
				Product product = new Product(name, price, quantity);
				listProducts.add(product);
				
				itemCsv = br.readLine(); 
			}
			
			// try to write on targetFile
			try(BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileStr)) ){

				for (Product item : listProducts) {
					
				}

				System.out.println(targetFileStr + " CREATED!");
			}
			catch(IOException e) {
				System.out.println("Error reading file: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		sc.close();

	}

}
