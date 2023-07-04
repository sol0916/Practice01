package programers;

import java.util.Arrays;

public class ProTest {
	public static void main(String[] args) {

		
//		String a = "aBcDeFg";
//		String answer = "";
//		String pattern1 = "[a-z]";
//		String[] arr = a.split("");
//		for(int i=0; i<arr.length; i++) {
//			answer += arr[i].matches(pattern1) ? arr[i].toUpperCase() : arr[i].toLowerCase();
//		}
//		
//		System.out.println(answer);
		
		
		String my_string = "Program29b8UYP";
		String overwrite_string = "merS123";
		int s = 7;
		
		String answer = my_string.substring(0, s) + overwrite_string;
		if(my_string.length()>answer.length()) {
			int a = my_string.length()-answer.length();
			int b = my_string.length();
			answer += my_string.substring(b-a, b);
		}
		System.out.println(answer);
		
}
	
}


