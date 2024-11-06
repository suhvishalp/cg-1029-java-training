import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOperations {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		 
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		
		Date date1 = sdf.parse("30-FEB-2024");
		
			
		System.out.println(sdf.format(date1));
		}catch(ParseException ps) {
			System.out.println(ps.getMessage());
			System.out.println("Invalid Date");
		}

	}

}
