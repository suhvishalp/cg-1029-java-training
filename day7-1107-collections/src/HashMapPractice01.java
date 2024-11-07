import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "Mahesh");
		map.put(102, "Suresh");
		map.put(103, "Dinesh");
		map.put(104, "Jignesh");
		map.put(105, "Ramesh");
		map.put(106, "Dinesh");
		
		map.put(null, "some value");
		
		map.put(null, "some value 2");
		
		map.put(104, "Hitesh");

		Collection<String> collection = map.values();
		
		Set<Integer> keySet =  map.keySet();
		
//		for(Integer key: keySet) {
//			System.out.println(map.get(key));
//		}
		
		
		Set<Map.Entry<Integer, String>> entrySet =  map.entrySet();
		
		for(Map.Entry<Integer, String> entry:  entrySet) {
			System.out.print("\nKey: " + entry.getKey());
			System.out.print(" Value: " + entry.getValue() + "\n");
		}
		
	}

}
