package programers;

import java.util.Arrays;

public class Pro120808 {
	
	public static void main(String[] args) {
		
	int[] arr = {1, 2, 3, 4};

	
	int[] answer = new int[2];
	
	arr[0] *= arr[3];
	arr[2] *= arr[1];
	arr[1] *= arr[3];
	
	int num = arr[0] + arr[2];
	
	int max = Math.max(arr[1], num);
	int min = Math.min(arr[1], num);
	
	//최대공약수 구하기
	while(max!=0) {
		int remainder = min%max;
		min = max;
		max = remainder;
	}
	
	answer[0] = num / min;
	answer[1] = arr[1] / min;
	
	
	
	System.out.println(min);
	System.out.println(Arrays.toString(answer));
	System.out.println(8%4);
	}

}
