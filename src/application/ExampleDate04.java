package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExampleDate04 {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2024-12-05");
		LocalDateTime d05 = LocalDateTime.parse("2024-12-05T01:38:25");
		Instant d06 = Instant.parse("2024-12-05T01:38:25Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextMonthLocalDate = d04.plusDays(31);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextMonthLocalDateTime = d05.plusDays(31);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextMonthInstant = d06.plus(31, ChronoUnit.DAYS);
		
		
		System.out.println("Past Week Local Date: " + pastWeekLocalDate);
		System.out.println("Next Week Local Date: " + nextMonthLocalDateTime);
		
		System.out.println("Past Week Local Date: " + pastWeekLocalDateTime);
		System.out.println("Next Week Local Date: " + nextMonthLocalDateTime);
		
		System.out.println("Next Week Instant: " + pastWeekInstant);
		System.out.println("Next Month Instant: " + nextMonthInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
	
		
		
		System.out.println("t1 dias: " + t1.toDays());
		System.out.println("t2 dias: " + t2.toDays());
		System.out.println("t3 dias: " + t3.toDays());
		System.out.println("t4 dias: " + t4.toDays());
	}

}
