package practice03;

import java.util.*;

public class ArrayListRe {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//끝에 추가 add()
		list.add("하늘");
		list.add("바다");
		list.add("구름");
		
		//길이 확인 size()
		System.out.println(list.size());
		
		//중간에 추가
		list.add(1, "햇살");
		
		//값 확인 get
		System.out.println(list.get(1));
		
		//값 수정 set
		list.set(3, "숲");
		
		System.out.println(list.toString());
		
		//값 제거 remove
		list.remove(3);
		
		System.out.println(list.toString());
		
		//객체가 저장되어 있는지 조사 contains
		if(list.contains("바다")) {
			System.out.println("저장되어 있습니다");
		}
				
		//빈 리스트 확인 isEmpty
		System.out.println(list.isEmpty());
		
		//전부 삭제 clear
		list.clear();
		
		System.out.println(list.toString());
		
		//리스트 병합
		List<String> list2 = Arrays.asList("a","b","c","d","e");
		
		list.addAll(list2);
		
		System.out.println(list.toString());

	}

}
