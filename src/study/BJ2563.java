package study;

import java.util.*;
import java.io.*;

public class BJ2563 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		//검은색 색종이 개수
		int count = Integer.parseInt(br.readLine());

		//최댓값 찾는 배열
		int[] arrX = new int[count];
		int[] arrY = new int[count];

		//최대값
		int maxX = 0;
		int maxY = 0;

		//최종 결과 값
		int sum = 0;

		for(int i=0; i<count; i++) {

			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); //가로 
			int y = Integer.parseInt(st.nextToken()); //세로

			arrX[i] = x;
			arrY[i] = y;

			if(arrX[i]>maxX) {
				maxX = arrX[i];
			}
			if(arrY[i]>maxY) {
				maxY = arrY[i];
			}

		}

		//2차원 배열
		int[][] arrInt = new int[maxX+10][maxY+10];

		//배열 값 넣기
		for(int i=0; i<count; i++) {
			for(int j=arrX[i]; j<arrX[i]+10; j++) {
				for(int k=arrY[i]; k<arrY[i]+10; k++) {
					//중복 값 빼고 기존에 값이 없는 경우에만 입력
					if(arrInt[j][k]==0) { 
						arrInt[j][k] = 1;
						sum++;
					}
				}
			}
		}


		bw.write(Integer.toString(sum));

		bw.flush();
		bw.close();



	}

}
