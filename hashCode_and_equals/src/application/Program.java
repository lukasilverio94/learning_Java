package application;

import entities.Client;

public class Program {
	
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "alex@gmail.com");
	
		System.out.println(c1.hashCode()); // -495238894
		System.out.println(c2.hashCode()); // 1254250042
		System.out.println(c1.equals(c2)); // false -> different objects
		System.out.println(c1 == c2);  	   // false -> different memory reference
	}
	
}
