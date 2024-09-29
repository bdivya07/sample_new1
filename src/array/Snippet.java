package array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class Snippet {
	public static void main(String[] args) throws Exception {
		Snippet s=new Snippet();
		s.a();
}
	void a() throws Exception{
		try
		{
			System.out.println("hii");
		}
		catch(Exception e)
		{
			throw new Exception(e);
		}
	}
	
}

