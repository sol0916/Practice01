package practice04;

import java.util.*;

public class Parents {

	/*
		오버로딩과 오버라이딩 개념을 통해 
		int배열, char배열의 오름차순 정렬 메서드, 내림차순 정렬 메서드를 만들어 봐요.

		int 배열에 대입할 숫자의 범위 : (int)(Math.random()*100 + 1);

		char배열에 대입할 대문자의 범위 : ((char) ((int) (Math.*random*() * 26) + 65)); A-Z

		오름차순 정렬(1 ~ 10)은 부모 클래스 지정해주시고, 
		내림차순 정렬(10~1)은 자식클래스로 오버라이딩해서 작성해주세요.

		메인클래스에서는 배열의 크기를 랜덤 숫자로 받아서 실행할 때마다 
		다른 크기의 배열이 나오게 만들어주세요. ( 단, 두 배열의 크기는 동일합니다.)

		- 배열 크기의 범위 : int num = (int)(Math.random()*15) + 5;
	 */
		
	int size;
	
	//기본 생성자
	Parents() {	
	}
	
	//size값을 받는 생성자
	Parents(int size) {
		this.size = size;
	}

	//정렬 메서드
	public void sort() {

		asc();
	}

	//오름차순 메서드
	public void asc() {

		int[] arrInt = new int[size];		
		char[] arrChar = new char[size]; 
		
		for(int i=0; i<arrInt.length; i++) {
			int number = (int)(Math.random()*100+1);
			char alphabet = (char)((int)(Math.random()*26)+65);

			arrInt[i] = number;
			arrChar[i] = alphabet;
		}
		
		Arrays.sort(arrInt);
		Arrays.sort(arrChar);

	}




}
