package application;

import java.util.Scanner;

import entities.PrintService;

public class PrinterMainEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> printService = new PrintService<>();
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			printService.addValue(value);
		}
		
		printService.print();
		System.out.println("First: " + printService.first());
		
		sc.close();
	}

}
