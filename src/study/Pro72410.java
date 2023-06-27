package study;

import java.util.*;

public class Pro72410 {
	
	public static void main(String[] args) {
		
		//신규 아이디 추천 - 정규표현식
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		String pattern1 = new_id.toLowerCase();
		String pattern2 = new_id.replaceAll("[^a-z0-9-_.]", "");
		String pattern3 = new_id.replaceAll("[..]+", ".");
		String pattern4 = new_id.replaceAll("^[.]|[.]$", "");
		
		String pattern5 = "";
		String[] arr = new_id.split("");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==null) {
				arr[i] = "a";
			}
			pattern5 += arr[i];
		}
		
		String pattern6 = "";
		if(new_id.length()>=16) {
			pattern6 = new_id.substring(0, 15);
		}
	    pattern6 = new_id.replaceAll("[.]$", "");
	    
	    String pattern7 = "";
	    if(new_id.length()<=2) {
	    	String[] arr2 = new_id.split("");
	    	for(int i=0; i<=new_id.length(); i++) {
	    		pattern7 += arr2[i];
	    		if(arr2[i]==arr2[arr2.length]) {
	    			
	    		}
	    	}
	    }
		
		System.out.println(pattern5);
	
	
		
	}

}
