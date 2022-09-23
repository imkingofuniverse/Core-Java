//create a program to find and print current date and time and print date and time in this format "yyyy-MM-dd HH:mm:ss "  ;print date and time exactly after two days;print current month,reduce one month,one week, one day out of current time ; print just only the date;print current time,find out the current day(like monday)

package datetime;

import java.time.*;

public class currentdt {
	
	public static void main(String[] args) {
		
		LocalDate dt = LocalDate.now();
		LocalTime tm = LocalTime.now();
		System.out.println("Date : "+dt+" Time : "+tm);
		LocalDate dt2d = LocalDate.now().plusDays(2);
		LocalTime tm2d = LocalTime.now().plusHours(24);
		System.out.println("Date after 2 days : "+dt2d);
		System.out.println("Time after 2 days : "+tm2d);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Local Date Time : "+datetime);
		System.out.println("After 1m 1w 1d = "+datetime.plusDays(1).plusWeeks(1).plusMonths(1));
		
		System.out.println("Current date and time in (yyyy-mm-dd hh:mm:ss a): " + LocalDateTime.now().toString());
		System.out.println("Current date: " + LocalDate.now());
		System.out.println("Current time: " + LocalTime.now());
		System.out.println("Current month: " + LocalDateTime.now().getMonth());
		System.out.println("Current day: " + LocalDate.now().getDayOfWeek());
		
	}

}
