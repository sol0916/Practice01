package study;

import java.util.*;
import java.io.*;

public class BJ11660 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken()); //배열 크기
		int count = Integer.parseInt(st.nextToken()); //횟수

		int[][] arrInt = new int[size+1][size+1];

		for(int i=0; i<size; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<size; j++) {
				int num = Integer.parseInt(st.nextToken());				
				arrInt[i+1][j+1] = arrInt[i+1][j] + arrInt[i][j+1] - arrInt[i][j] + num;

			}
		}

		int preSum = 0;
		
		for(int i=0; i<count; i++) {
			st = new StringTokenizer(br.readLine()); 
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			preSum = arrInt[x2][y2] - arrInt[x1-1][y2] - arrInt[x2][y1-1] + arrInt[x1-1][y1-1];
			bw.write(Integer.toString(preSum));
			bw.write("\n");
			
		}
		
		
		bw.flush();
		bw.close();

	}

}
