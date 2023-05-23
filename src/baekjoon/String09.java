package baekjoon;

import java.io.*;

public class String09 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arrStr = br.readLine().split(" ");

		StringBuilder first = new StringBuilder(arrStr[0]);
		StringBuilder second = new StringBuilder(arrStr[1]);
		
		int num1 = Integer.parseInt(first.reverse().toString());		
		int num2 = Integer.parseInt(second.reverse().toString());		
		
		if(num1>num2) {
			bw.write(Integer.toString(num1));			
		} else {
			bw.write(Integer.toString(num2));
		}
		
		
		bw.flush();
		bw.close();

	}


}
