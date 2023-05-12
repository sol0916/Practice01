package practice03;

import java.util.*;

public class TokenRe {
	
	public static void main(String[] args) {
		
		String str = "오늘은 날이 참 좋네요";
		
		StringTokenizer st = new StringTokenizer(str);
		
		//토큰의 개수 확인
		int count = st.countTokens();
		System.out.println(count);
		
		//다음 토큰의 여부 확인
		System.out.println(st.hasMoreTokens());
		
		while(st.hasMoreTokens()!=false) {
			
			//다음 토큰 확인
			System.out.println(st.nextToken());
			
		}
						
		//다양한 구분자를 한번에 지정해서 토큰화 가능
		
		String str2 = "자바/공부는/왜/이렇게.어려운.건가요/?";
		
		StringTokenizer st2 = new StringTokenizer(str2, "/.");
		
		while(st2.hasMoreTokens()!=false) {
			System.out.println(st2.nextToken());
		}
		
		//구분자를 토큰에 포함시킴
		StringTokenizer st3 = new StringTokenizer(str2, "-", true);
		for(int i=1; st3.hasMoreTokens(); i++) {
			System.out.print(st3.nextToken());
		}
		
		
	}

}
