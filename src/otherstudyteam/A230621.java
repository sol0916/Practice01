package otherstudyteam;

import java.util.ArrayList;

public class A230621 {

	public static void main(String[] args) {
		
		//ArrayList를 이용하여 두 정수 집합 {1~10}, {3,5,6,7,11}의
		//교집합, 차집합, 합집합을 구하세요 
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i=1; i<=11; i++) {
			if(i<11) {
				list1.add(i);
			} 
			if(i%2==1&&i>1) {
				list2.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(list2);
		
		ArrayList<Integer> in = new ArrayList<>(); //교집합
		ArrayList<Integer> d = new ArrayList<>(); //차집합
		ArrayList<Integer> u = new ArrayList<>(); //합집합
		
		
		
		list1.retainAll(list2);
		System.out.println(list1);
		list1.removeAll(list2);
		list1.addAll(list2);
		
		
		System.out.println("교집합="+in);
		System.out.println("차집합="+d);
		System.out.println("합집합="+u);
		
		

	}

}
