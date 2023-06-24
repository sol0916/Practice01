package programers;

import java.util.*;

public class ProTest {
	public static void main(String[] args) {

		String my_string = "cccCCC";
		
		String answer = "";
		String[] arr = my_string.split("");
		
		String s = "[a-z]";
		String l = "[A-Z]";
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i].matches(s)) {
				answer += arr[i].toUpperCase();
			} else {
				answer += arr[i].toLowerCase();				
			}
		}
		
		System.out.println(answer);
		
		
	}


}


