package practice02;

import java.util.Arrays;

public class ArrayBasicEx01 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int sum1 = 0;
		
		//배열 값들의 합 (arr1)
		
		for(int i=0; i<arr1.length; i++) {
			sum1 += arr1[i];
		}
		System.out.println(sum1);
		
		//크기가 100인 배열에 1~100까지 값 저장 (arr2)
		int[] arr2 = new int[100];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = i+1;
		}
		System.out.println(Arrays.toString(arr2));
		
		
		//배열 요소의 문자열 합 (arr2)
		String str = "";
		
		for(int i=0; i<arr2.length; i++) {
			str += arr2[i] + " ";
		}
		System.out.println(str);
		
		//큰 값 찾기(arr3)
		
		int[] arr3 = {54, 20, 10, 5, 3, 37, 90};
		
		int max = arr3[0];
		
		for(int i=0; i<arr3.length; i++) {
			
			if(max<arr3[i]) {
				max = arr3[i];
			}			
		}
		System.out.println("가장 큰 값은 "+max+"입니다");
				
		
		//배열 정렬(arr3)
		
		for(int i=0; i<arr3.length-1; i++) {
			
			for(int j=i+1; j<arr3.length; j++) {
				
				if(arr3[i]>arr3[j]) {
				int temp = arr3[i];
				arr3[i] = arr3[j];
				arr3[j] = temp;				
				}
			}			
		}
		System.out.println(Arrays.toString(arr3));
		
		
		//Arrays.sort()
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
				

	}

}
