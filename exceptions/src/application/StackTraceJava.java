package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTraceJava {

	public static void main(String[] args) {
		method1();
		System.out.println("End of program");

	}

	public static void method1() {
		System.out.println("***** METHOD1 STARTS");
		method2();
		System.out.println("***** METHOD1 ENDS");
	}

	public static void method2() {
		System.out.println("***** METHOD2 STARTS");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index position");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}

		System.out.println("***** METHOD2 ENDS");
		sc.close();
	}

}