package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> employeesList = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().toLowerCase().charAt(0);
			while (ch != 'y' && ch != 'n') {
				System.out.println("Invalid choice. Please choose 'y' or 'n'");
				System.out.print("Outsourced (y/n)? ");
				ch = sc.next().toLowerCase().charAt(0);	
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employeesList.add(new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employeesList.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : employeesList) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}
}
