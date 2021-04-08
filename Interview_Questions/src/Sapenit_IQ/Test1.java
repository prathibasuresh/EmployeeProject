package Sapenit_IQ;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	
	public static String addMonthtoDate(String addMonth)
	{
		Calendar cal=Calendar.getInstance();
		int addMonthInt= Integer.parseInt(addMonth);
		cal.add(Calendar.MONTH, (1+addMonthInt));
		cal.set(Calendar.DAY_OF_MONTH, 1);
		SimpleDateFormat format1=new SimpleDateFormat("dd/MM/YYYY");
		Date date=cal.getTime();
		String date1=format1.format(date);
		return date1;
	}

	public static void main(String[] args) {
		System.out.println(addMonthtoDate("0"));
		
	}
}


