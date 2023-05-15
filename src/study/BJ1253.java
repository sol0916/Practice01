package study;

import java.io.*;
import java.util.*;

public class BJ1253 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine()); //배열 크기
		int[] arrInt = new int[num]; //int배열
				
		//int 배열에 값 넣기
		String[] arrStr = br.readLine().split(" ");		
		for(int i=0; i<arrInt.length; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);			
		}
		
		//two pointer, index, sum(합계), count(good개수)
		int startP = 0;
		int endP = 0;
		int index = 0;
		int sum = 0;
		int count = 0; 
		
		while(startP <= endP) {
			
			if(sum<arrInt[index]) {
				endP++;
				sum = arrInt[endP]+arrInt[endP-1];
			} else if(sum>arrInt[index]) {
				
			} else {
				count++;
				
			
				
			}
			
		}
		
		bw.write(Integer.toString(count));
		
		bw.flush();
		bw.close();

	}

}
