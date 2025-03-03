package date_time_java;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main4CalculusDateTime {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		// count -7 days (last week) from date
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		// count +7 days (one week later) from date
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		// add 7 years to localDate
		LocalDate sevenYearsLaterLocalDate = d04.plusYears(7);

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("sevenYearsLater = " + sevenYearsLaterLocalDate);
		// output 3 print above:
		// pastWeekLocalDate = 2022-07-13
		// nextWeekLocalDate = 2022-07-27
		// sevenYearsLater = 2029-07-20

		// LocalDateTime
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		// output 2 print above:
		// pastWeekLocalDateTime = 2022-07-13T01:30:26
		// nextWeekLocalDateTime = 2022-07-27T01:30:26

		// INSTANT
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); 

		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		// output 2 print above
		// pastWeekInstant = 2022-07-13T01:30:26Z
		// nextWeekInstant = 2022-07-27T01:30:26Z

		// Calcular duration
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d05.minusMonths(3));
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}