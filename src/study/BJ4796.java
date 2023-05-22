package study;

import java.io.*;
import java.util.*;

public class BJ4796 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int l = 0;
		int p = 0;
		int v = 0;
		
		int count = 0; //case 횟수
		int result = 0; //결과값

		while(true) {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		l = Integer.parseInt(st.nextToken()); //캠핑장 사용기간
		p = Integer.parseInt(st.nextToken()); //캠핑장 연속 사용 기간
		v = Integer.parseInt(st.nextToken()); //휴가기간
		
		if(l==0&&p==0&&v==0) break; //종료 조건
		
		
		//캠핑장 이용가능일 (전체휴가기간 / 연속 사용 기간 * 사용기간)
		//연속으로 몇번 사용 가능한지 파악
		int aDate = v/p*l;
		//남은 일수 (전체 휴가기간 % 연속 사용 기간)
		//남은 일수를 파악하여 며칠 더 사용 가능한지 파악
		int bDate = v%p;
		
		//남은 일수는 사용기간보다 작아야 함
		if(bDate<l) {
			result = aDate+bDate;
		} else { //남은 일수가 사용기간보다 크거나 같을 경우
			bDate = l;
			result = aDate+bDate;
		}
		
		count++;
		bw.write("Case "+count+": "+Integer.toString(result)+"\n");
		
		}
		
		bw.flush();
		bw.close();
		
	}

}
