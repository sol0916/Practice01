package study;

import java.util.*;
import java.io.*;

public class BJ11047 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//동전 개수
		int amount = Integer.parseInt(st.nextToken());
		int[] arrInt = new int[amount];
		
		int money = Integer.parseInt(st.nextToken()); 
		int count = 0;
		
		//배열 값
		for(int i=0; i<amount; i++) {
			arrInt[i] = Integer.parseInt(br.readLine());
		}
		
		//배열의 끝에서부터 시작
		for(int i=amount-1; i>=0; i--) {
			
			if(money>=arrInt[i]) {
				count += money/arrInt[i]; //돈을 금액만큼 나눈 횟수 저장
				money %= arrInt[i];
			}
			
		}

		bw.write(Integer.toString(count));
		
		
		bw.flush();
		bw.close();
		
		

	}

}