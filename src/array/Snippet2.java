package array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class Snippet2 {
	public static void main(String[] args) throws ParseException {String time1 = "12:00:00";
	String time2 = "12:01:00";
	 
	SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	Date date1 = format.parse(time1);
	Date date2 = format.parse(time2);
	long difference = date1.getTime() - date1.getTime();
	System.out.println(difference/1000);}
	
	
}

