package practice04;

import java.util.*;

public class Lotto {


	/*
		 로또를 구매하고, 구매한 로또의 번호와
		 이번 주 당첨 번호를 비교해서 꽝인지, 당첨이 됐는지 출력해봅시다.
		 단, 로또를 구매할 때 수동으로 번호 3개를 지정합니다.
		 (Random 클래스는 API 주제여서 사용하진 않았으나, 사용하셔도 됩니다.)

 		 ex. lotto(3,7,10);   
 		 출력시 -> [3,7,10,39,36,43]

	 */

	TreeSet<Integer> set = new TreeSet<>();
	TreeSet<Integer> set2 = new TreeSet<>();

	int count = 0;

	public void lotto(int a, int b, int c) {

		//수동
		set.add(a);
		set.add(b);
		set.add(c);

		//자동
		while(set.size()<6) {			
			int ran = (int)(Math.random()*45)+1;
			set.add(ran);
		}

	}

	public void randomNum() {

		while(set2.size()<6) {
			int ran = (int)(Math.random()*45)+1;
			set2.add(ran);
		}
	}

	public void result() {

		randomNum();

		for(int i=0; i<set.size(); i++) {
			if(set.equals(set2)) { //비교 찾아보기
				count++; 
			}
			
		}

		switch(count) {
		case 6 :
			System.out.println("축하합니다!");
			System.out.println("1등 당첨");
			break;
		case 5 :
			System.out.println("축하합니다!");
			System.out.println("2등 당첨");
			break;
		case 4 : 
			System.out.println("축하합니다!");
			System.out.println("3등 당첨");
			break;
		case 3 :
			System.out.println("축하합니다!");
			System.out.println("5천원 당첨");
		default :
			System.out.println("미당첨");
			break;

		}


		//출력
		System.out.println("내가 산 로또:"+set.toString());
		System.out.println("당첨 로또:"+set2.toString());

	}


}
