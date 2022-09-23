//find out the current time in Asia/Kolkata zone and convert it to America/New York Zone

package datetime;

import java.time.LocalTime;
import java.time.zone.*;
import java.time.*;

public class zonechange {
	
	public static void main(String[] args) {
				
		System.out.println(LocalTime.now());
	
		
		ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
		ZoneId etZoneId = ZoneId.of("America/New_York");
		
		LocalDateTime currentDateTime = LocalDateTime.now();
	     
	    ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);      
	    ZonedDateTime currentETime = currentISTime.withZoneSameInstant(etZoneId);	     
	    System.out.println(currentISTime);
	    System.out.println(currentETime);
				
				
				
		
	}

}
