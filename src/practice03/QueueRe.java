package practice03;

import java.util.Arrays;

public class QueueRe {

	public static void main(String[] args) {

		//queue - FIFO
		
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));
		
		pop();
		int r = pop();
		System.out.println("삭제된 데이터:"+r);
		System.out.println(Arrays.toString(arr));

		
	} //main

	static int[] arr = {1,2,3,4,5};

	static void push(int data) {

		int[] newArr = new int[arr.length+1];

		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}

		newArr[newArr.length-1] = data;

		arr = newArr;
		newArr = null;		
	}

	static int pop() {

		if(arr.length>0) {
			int del = arr[0];

			int[] newArr = new int[arr.length-1];

			for(int i=0; i<newArr.length; i++) {
				newArr[i] = arr[i+1];
			}
			
			del = arr[0];
			
			arr = newArr;
			newArr = null;

			return del;
		}
		return 0;
	}



}
