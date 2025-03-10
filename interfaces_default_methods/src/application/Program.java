package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;
import entities.UsaInterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		InterestService isBr = new BrazilInterestService(2.0);
		double paymentBrazil = isBr.payment(amount, months);

		InterestService isUsa = new UsaInterestService(2.5);
		double paymentUsa = isUsa.payment(amount, months);

		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", paymentBrazil) + " with Brazil Intereset");

		System.out.println();

		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", paymentUsa) + " with Usa Intereset");

		sc.close();
	}
}