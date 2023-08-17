import java.time.LocalDate;
import static java.time.DayOfWeek.*;

public class Sample {
	public static void main(String[] args) {
		var today = LocalDate.now().with(TUESDAY).getDayOfWeek();
		switch (today) {
			case	SUNDAY:
			case	SATURDAY:
				System.out.println("weekend");
				break;
			case	MONDAY:
						FRIDAY: System.out.println("working");
			default:
				System.out.println("other");
		}
	}
}