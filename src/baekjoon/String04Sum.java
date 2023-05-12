package baekjoon;

import java.util.*;
import java.io.*;

public class String04Sum {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String str = "";
		int sum = 0;
		
		for(int i=0; i<br.read(); i++) {
			
			st = new StringTokenizer(str);			
			int num = Integer.parseInt(st.nextToken());
			sum += num;
		}
		
		bw.write(sum);
		
		bw.flush();
		bw.close();	
			

	}

}
