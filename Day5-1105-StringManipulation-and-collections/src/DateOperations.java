import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOperations {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		 
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		Date date1 = sdf.parse("29-OCT-24");
		
		int month = date1.getMonth();
		System.out.println("date1 month : "+ month);
		
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(date1));

	}

}
