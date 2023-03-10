package dateAndTime;

import java.time.Duration;
import java.time.LocalTime;

public class Time_Difference {

	public static void main(String[] args) {
		
		LocalTime t1 = LocalTime.of(1, 15);
		
		Duration d = Duration.between(t1, LocalTime.now());
		
		System.out.println(d);

		System.out.println(d.toHours());
		System.out.println(d.getSeconds());
		System.out.println(d.toMinutesPart());
	}

}
