package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();	
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();			
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);

		System.out.println();

		System.out.print("Enter amount for withdraw: ");
		double withdrawValue = sc.nextDouble();
		
		try {			
			acc.withdraw(withdrawValue);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		} 
		catch (BusinessException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
		catch(Exception e) {
			System.out.println("Unexpected error");
		}		
		finally{
			if(sc != null) {
				sc.close();
			}
		}
		

	}

}
