package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class CalculatorEx2 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		String path = "/tmp/in.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			Product maxNum = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(maxNum);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
