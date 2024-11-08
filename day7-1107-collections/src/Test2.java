
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "Wel^come-#$#43to*Java";
		StringBuilder sb = new StringBuilder();
		
		for(char ch: string.toCharArray()) {
			
			if(Character.isLetterOrDigit(ch) || ch == '-') {
				sb.append(ch);
			}else {
				sb.append("-");
			}
		}

		System.out.println(sb);
	}

}
