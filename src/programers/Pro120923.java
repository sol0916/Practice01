package programers;

import java.util.Arrays;

public class Pro120923 {

	public static void main(String[] args) {

		//연속된 수의 합 구하기

		solution(3, 12);



	} //main

	public static int[] solution(int num, int total) {
		int[] answer = new int[num];
		int[] pSum = new int[num+1];

		//구간합 알고리즘
		//pSum이 total과 같을 때 해당 숫자 이전부터 num까지 구하고 정렬 후 출력


		while(true) {

			for(int i=0; i<num; i++) {
				pSum[i+1] += i;
				
				if(pSum[i] == total) {} break;
				
				
			}


		}




		//return answer;
	}



}
