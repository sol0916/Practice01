package study;

import java.util.*;
import java.io.*;

public class BJ2563A {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    // 2차원 배열
	    int[][] arr = new int[101][101];

	    // 검은색 색종이 개수
	    int n = Integer.parseInt(br.readLine());

	    // 색종이의 좌표에 1 입력
	    for (int i = 0; i < n; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());

	        for (int j = x; j < x + 10; j++) {
	            for (int k = y; k < y + 10; k++) {
	                arr[j][k] = 1;
	            }
	        }
	    }

	    // 합계 계산
	    int sum = 0;
	    for (int i = 0; i < 101; i++) {
	        for (int j = 0; j < 101; j++) {
	            if (arr[i][j] == 1) {
	                sum++;
	            }
	        }
	    }

	    System.out.println(sum);
	}

}
