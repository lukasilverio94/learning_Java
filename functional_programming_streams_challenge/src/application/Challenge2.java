package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Challenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double average = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / list.size();
			
			System.out.println("Average price: " + String.format("%.2f", average));
			
			// This comparator it will order in ascending order (alfabetically)
			Comparator<String> comparator = (str1, str2) -> str1.toUpperCase().compareTo(str2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < average)
					.map(p -> p.getName())
					.sorted(comparator.reversed())
					.collect(Collectors.toList());
			
			// print names that attends requirements
			names.forEach(System.out::println);
		}
		catch(IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
