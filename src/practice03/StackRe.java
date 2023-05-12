package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class StackRe {

	public static void main(String[] args) {
		
		//stack은 LIFO
		
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));

		pop();
		int r = pop();
		System.out.println("삭제된 데이터:"+r);
		System.out.println(Arrays.toString(arr));
		
		
	} //main
	
	static int[] arr = {1,2,3,4,5};
	
	//push 
	static void push(int data) {
		
		int[] newArr = new int[arr.length+1];
						
		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[newArr.length-1] = data;
		
		arr = newArr;
		newArr = null;		
	}
	
	//pop
	static int pop() {
		
		if(arr.length>0) {
		
		int del = arr[arr.length-1];
			
		int[] newArr = new int[arr.length-1];
		
		for(int i=0; i<newArr.length; i++) {
			newArr[i] = arr[i];
		}
		
		arr = newArr;
		newArr = null;
		
		return del;
		
		}
				
		return 0;
	}

}
