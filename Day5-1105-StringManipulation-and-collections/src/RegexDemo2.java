import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pattern pattern = Pattern.compile("\\d{3}");
//		
//		Matcher matcher = pattern.matcher("387");
//		
//		if(matcher.find())
//			System.out.println("true");
//		else
//			System.out.println("Invalid");
		
		String logData = "2023-11-01 10:12:34 INFO User JohnDoe logged in\n" +
                "2023-11-01 10:15:40 ERROR Database connection failed\n" +
                "2023-11-01 10:18:12 INFO User JaneSmith logged out";
		
        String logPattern = "(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}) (INFO|ERROR) (.+)";

        Pattern pattern = Pattern.compile(logPattern);
        Matcher matcher = pattern.matcher(logData);
        
        while (matcher.find()) {
            System.out.println("Date: " + matcher.group(1));
            System.out.println("Level: " + matcher.group(2));
            System.out.println("Message: " + matcher.group(3));
            System.out.println();
        }


	}

}
