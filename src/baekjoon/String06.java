package baekjoon;

import java.io.*;

public class String06 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//단어
		String word = br.readLine();		
		char[] arrWord = word.toCharArray(); 

		//알파벳 소문자 배열
		char[] alphabet = new char[26];		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = (char)(97 + i);
		}

		//값 전부 -1로 초기화
		int[] arrResult = new int[26];
		for(int i=0; i<arrResult.length; i++) {
			arrResult[i] = -1;
		}

		for(int i=0; i<arrWord.length; i++) {
			for(int j=0; j<alphabet.length; j++) {
				if(arrWord[i]==alphabet[j] && arrResult[j]==-1) {
					arrResult[j] = i;
					break;
				} 
			}
		}

		//출력
		for(int result : arrResult) {
			bw.write(String.valueOf(result));
			bw.write(" ");
		}


		bw.flush();
		bw.close();


	}

}
