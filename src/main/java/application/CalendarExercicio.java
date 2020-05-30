package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExercicio {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date data = sdf.parse("25/06/2020 15:30:12");

		Calendar cal = Calendar.getInstance();
		
		cal.setTime(data);
		
		System.out.println(sdf.format(data));
		
		cal.add(cal.HOUR_OF_DAY, 4);
		data = cal.getTime();
		
		System.out.println(sdf.format(data));
	}

}
