package programers;

public class Pro120851 {
	
	public static void main(String[] args) {
		
		String my_string = "aAb1B2cC34oOp";
		String my_string2 = "1a2b3c4d123";
		
		int answer = 0;
		
		my_string = my_string.replaceAll("[a-zA-Z]", "");
		String[] arr = my_string.split("");

		for(int i=0; i<arr.length; i++) {
			
			answer += Integer.valueOf(arr[i]);
			
		}
		
		System.out.println(answer);
	}

}
