import java.util.Arrays;

public class ArrayPractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {10,20,30,40,50};
		
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		int[] newArray = Arrays.copyOf(nums, 10);
	}

}
