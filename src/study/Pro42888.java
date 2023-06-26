package study;

import java.util.*;

public class Pro42888 {

	public static void main(String[] args) {

		//오픈채팅방

		String[] record = {"Enter uid1234 Muzi", 
						   "Enter uid4567 Prodo",
						   "Leave uid1234",
						   "Enter uid1234 Prodo",
						   "Change uid4567 Ryan"}; 

		String[] answer = new String[record.length];
		Map<String, String> map = new HashMap<String, String>();

		for(int i=0; i<record.length; i++) {
			String[] arr = record[i].split(" ");
						
			switch(arr[0]) {
			case "Enter":
				map.put(arr[1], arr[2]);			
				answer[i] = map.get(arr[1])+"님이 들어왔습니다.";
				break;
			case "Leave":
				answer[i] = map.get(arr[1])+"님이 나갔습니다.";
				map.remove(arr[1]);
				break;
			case "Change":
				map.put(arr[1], arr[2]);
				break;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
