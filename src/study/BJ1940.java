package study;

import java.util.*;

public class BJ1940 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt(); //재료의 개수
		int armor = scan.nextInt(); //갑옷 
		
		//배열
		int[] arrInt = new int[num];
		
		//갑옷을 만들 수 있는 개수
		int count = 0;

		for(int i=0; i<arrInt.length; i++) {
		arrInt[i] = scan.nextInt();
		}
		
		for(int i=0; i<arrInt.length; i++) {
			for(int j=i+1; j<arrInt.length; j++) {
				
				int result = arrInt[i] + arrInt[j]; 
				
				if(result==armor) {
					count++;
				}
				
			}
		}
		
		System.out.println(count);
		
		
		
	}

}
