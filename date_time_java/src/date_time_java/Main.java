package date_time_java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/21/docs/api//java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now();  // output : 2025-02-22
		LocalDateTime d02 = LocalDateTime.now(); //output: 2025-02-22T15:30:50.654977453
		Instant d03 = Instant.now(); // 2025-02-22T14:31:49.361822512Z (WITH GMT)
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //-3 means -3 compared to the London time
		
		//d08 • Custom text format ➞ date hour
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		// LocalDate.of
		// Used to pass year, month and day,  separately 
		LocalDate d10 = LocalDate.of(2025, 2, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		// is the same as call d01.toString();
		// because is a object Date, and by default println knows that is a object type Date
		System.out.println("d01: " + d01.toString());
		System.out.println("d02: " + d02.toString());
		System.out.println("d03: " + d03.toString());
		System.out.println("d04: " + d04.toString());
		System.out.println("d05: " + d05.toString());
		System.out.println("d06: " + d06.toString());
		System.out.println("d07: " + d07.toString());
		System.out.println("d08: " + d08.toString());
		System.out.println("d09: " + d09.toString());
		System.out.println("d10: " + d10.toString());
		System.out.println("d11: " + d11.toString());
	}

}
