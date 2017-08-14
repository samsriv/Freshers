package sam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayProblem {

	private static long daysBetween(Date one, Date two) { 
		long difference = (two.getTime()-one.getTime())/86400000;
		long weeks = difference/7;
		System.out.println(weeks);
		return Math.abs(difference); 
	}

	
	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date d1 = df.parse("1999/08/10");
		Date d2 = df.parse("2017/04/19");
		System.out.println(new SimpleDateFormat("EEEE").format(d2));
		System.out.println(daysBetween(d1, d2));

	}

}
