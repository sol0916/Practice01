package study;

import java.io.*;
import java.util.*;

public class BJ2531 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken()); //접시 수 (배열 길이)
		int kind = Integer.parseInt(st.nextToken()); //초밥 가짓수
		int window = Integer.parseInt(st.nextToken()); //연속해서 먹는 접시수 (sliding window)
		int coupon = Integer.parseInt(st.nextToken()); //쿠폰

		int count = 0;
		int index = 0;
		
		int[] arrInt = new int[size];
		int[] newArr = new int[size+1];
		
		//배열에 값 넣기
		for(int i=0; i<size; i++) {
			arrInt[i] = Integer.parseInt(br.readLine());							
		}

		while(true) {
					
			for(int i=0; i<window; i++) {
				newArr[i] = arrInt[i+index]; 
				
				if(count+1>window) break;
				else {
					count++;
				}
			}
			
		
	
		}
		
	}

}
