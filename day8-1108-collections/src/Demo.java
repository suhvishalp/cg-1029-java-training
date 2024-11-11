import java.util.HashMap;
import java.util.Map;

public class Demo implements Display {

	@Override
	public void displayResults(String string) {
		// TODO Auto-generated method stub
		System.out.println("String : " + string);
		
		Map<String, String> map = new HashMap<>();
        map.put("Hello", "World");
        map.put("Java", "Programming");
        map.put("Example", "CaseInsensitive");
	}

}
