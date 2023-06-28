package study;

import java.util.*;

public class Pro72410 {
	
	public static void main(String[] args) {
		
		//신규 아이디 추천 - 정규표현식
		
//		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String new_id = "z-+.^.";
		
		
		String answer = new_id.toLowerCase();
		answer = answer.replaceAll("[^a-z0-9-_.]", "");
		answer = answer.replaceAll("[..]+", ".");
		answer = answer.replaceAll("^[.]|[.]$", "");
		
		if(answer.isEmpty()) {
			answer = "a";
		}
		
		if(new_id.length()>=16) {
			answer = answer.substring(0, 15);
			answer = answer.replaceAll("[.]$", "");
		}
	    
		if (answer.length() <= 2) {
		    while (answer.length() < 3) {
		        if (answer.length() > 0) {
		            answer += answer.charAt(answer.length() - 1);
		        } else {
		            answer += "a";
		        }
		    }
		}
		
	    System.out.println(answer);
	
		
	}

}
