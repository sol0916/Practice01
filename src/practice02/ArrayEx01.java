package practice02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {


		//이진탐색 -반을 분할해서 찾아가는 방법
		//조건 - 먼저 순서대로 정렬이 되어 있어야 함
		/*
		 * 1.포인터(start, end)를 처음과 끝에 2개를 배치
		 * 2.중간 값을 구함
		 * 3. 중간 값이 찾는 값인지 확인
		 * 4. 중간 값이 찾는 값보다 크다면, end를 중간값 -1로 내림
		 * 5. 중간 값이 찾는 값보다 작다면, start를 중간값+1로 올림		 
		 */
		
		int[] arr = {10,20,30,40,50,60,70};
		
		int start = 0;
		int end = arr.length -1; //배열은 0부터 시작하기 때문에 항상 크기보다 -1이 적음
		
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 값을 입력하시오 >");
		int find = scan.nextInt();
		
		while(start<=end) {
			
			count++;
			
			int mid = (start+end) / 2;
			
			if(arr[mid]==find) {
				System.out.println("회전수: "+count);
				System.out.println("찾는 값은 "+mid+"번째에 위치하고 있습니다");
				break;
			} 
			
			//arr[mid]>find ? end = mid -1 : start = mid + 1; //end와 start가 담는 값이 달라서 삼항 연산자로 사용할 수 없다
			
			if(arr[mid]<find) {
				start = mid + 1;			
			} else {
				end = mid - 1;
			}			
			
		}
		
		if(start>end) {
			System.out.println("찾는 값이 없습니다");
		}
		


		//깊은 복사 - 완전히 새로운 배열을 만들고, 요소를 담는다
		
		int[] newArr = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		
		System.out.println();


		//삭제의 개념 - 배열은 삭제가 없습니다
		//배열index의 값을 없앤 뒤, 뒤에 있는 정보를 끌어와 채움
		//arr[i] = arr[i+1]
		
		int[] newArr2 = new int[arr.length-1];
		
		System.out.print("삭제할 index을 입력하시오 >");
		int targetIndex = scan.nextInt();
		
		for(int i=targetIndex; i<arr.length-1; i++) {	
			arr[i] = arr[i+1]; 									
		}
		
		for(int i=0; i<newArr2.length; i++) {
			newArr2[i] = arr[i];
		}
		
		arr = newArr2;
		newArr2 = null;
		
		System.out.println(Arrays.toString(arr));
		
		
		
		//삽입
		
		
		
		
	}

}
