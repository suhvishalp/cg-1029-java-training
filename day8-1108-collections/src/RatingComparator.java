import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class RatingComparator implements Comparator<Map.Entry<Product, Double>>{

	@Override
	public int compare(Entry<Product, Double> o1, Entry<Product, Double> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().compareTo(o2.getValue());
	}

}
