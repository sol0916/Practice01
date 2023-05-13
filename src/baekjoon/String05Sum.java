package baekjoon;

import java.io.*;

public class String05Sum {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		
		int count = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		String[] arrStr = str.split("");
		
		for(int i=0; i<count; i++) {	
			int num = Integer.parseInt(arrStr[i]);
			sum += num;
		}
		
		bw.write(Integer.toString(sum));
		
		bw.flush();
		bw.close();	
			

	}

}
