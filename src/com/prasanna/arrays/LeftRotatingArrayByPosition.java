package com.prasanna.arrays;

import java.util.Arrays;

public class LeftRotatingArrayByPosition {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		int position = 3;
		
		rotateArrayPositionByLeft(arr, position);
		
	}

	private static void rotateArrayPositionByLeft(int[] arr, int position) {
		
		if(position < 0) {
			System.out.println("Position must be positive integer");
			return;
		}
		
		int[] rotateArray = new int[arr.length];
		int index = 0;
		for(int i = position; i <= arr.length; i++) {
			if(i == arr.length) {
				for(int k = 0; k<position;k++) {
					rotateArray[index] = arr[k];
					System.out.print(rotateArray[index]);
					index++;
				}
				break;
			}
			rotateArray[index] = arr[i];
			System.out.print(rotateArray[index]);
			index++;
		}
	}
}
