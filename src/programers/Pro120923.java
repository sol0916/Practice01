package programers;

import java.util.Arrays;

public class Pro120923 {

	public static void main(String[] args) {

		//연속된 수의 합 구하기

		int[] arr = solution(3, 12);
		System.out.println(Arrays.toString(arr));

	} //main

	public static int[] solution(int num, int total) {
		int[] answer = new int[num];
		int window = 0;
		int index = 0;
		
		
		while(true) {
			
			//window에 값 넣어주기
			for(int i=index; i<num+index; i++) {
				window += i;
			}
			
			if(window==total) break;
			else if(window > total) { //window가 total보다 크다면 index 감소
				window = 0;
				index--;
			} else { //window가 total보다 적다면 증가
				window = 0;
				index++;
			}
			
		}
		
		//배열에 값 넣어주기
		for(int i=0; i<num; i++) {
			answer[i] = index++;
		}
		
		return answer;
	}
	

}