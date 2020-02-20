import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class SampleDate
{
	public static void main(String args[])
	{
		LocalDate date=LocalDate.now();
		// default format
		System.out.println("default format of LocalDate= "+date);
		//specific format
		System.out.println("pattern"+date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
		LocalTime lt=LocalTime.now();
		System.out.println("Time : "+lt);
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("default format of LocalDateTime= "+dateTime);
		//specific format
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuuHH::mm::ss")));
		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
	}
}
