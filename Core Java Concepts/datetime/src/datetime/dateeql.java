//create one date object with year=2016,month=july,date=10 ;create date object with same values and check if dates are same or not

package datetime;

import java.time.LocalDate;

public class dateeql {
	
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2016, 7, 10);
		LocalDate d2 = LocalDate.of(2016, 7, 10);
		System.out.println(d1.isEqual(d2));
		
	}

}
