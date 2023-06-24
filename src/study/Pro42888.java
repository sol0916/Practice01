package study;

import java.util.*;

public class Pro42888 {

	public static void main(String[] args) {
		
		//오픈채팅방 - 정규표현식 문제
		
		String[] recode = {"Enter uid1234 Muzi", 
				"Enter uid4567 Prodo",
				"Leave uid1234",
				"Enter uid1234 Prodo",
				"Change uid4567 Ryan"}; 

		
		Map<String, String> map = new HashMap<String, String>();
		
		for(int i=0; i<recode.length; i++) {
			String[] arr = recode[i].split(" ");
			map.put(arr[1], arr[2]);
			
		}
	}

}
