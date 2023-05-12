package practice03;

import java.util.Arrays;

public class ArrayRe {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 7, 5, 9, 10};
		
		//배열 정렬 (sort)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//배열을 문자열로 (toStirng)
		System.out.println(Arrays.toString(arr));
		
		//탐색 (binarySearch) 
		//선행조건 : 정렬 필수 (값에 대한 위치 반환, 음수가 나오면 값 x)
		System.out.println(Arrays.binarySearch(arr, 10));
		System.out.println(Arrays.binarySearch(arr, 11));
		
		//배열 복사 (copyOf)
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(newArr));
				
		//배열크기 지정 복사 (copyOfRange)
		int[] newArr2 = Arrays.copyOfRange(arr, 2, 7);
		System.out.println(Arrays.toString(newArr2));
		
		//배열의 원소 비교
		if(Arrays.equals(arr, newArr)) {
			System.out.println("두 배열이 동일함");
		}
		
		

	}

}
