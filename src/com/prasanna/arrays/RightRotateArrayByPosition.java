package com.prasanna.arrays;

public class RightRotateArrayByPosition {

	public static void main(String[] args) {
		int[]  arr = {1,2,3,4,5,6,7,8,9};
		int posit = 3;
		
		rotateArrayPositionByRight(arr, posit);
		
	}
private static void rotateArrayPositionByRight(int[] arr, int position) {
		
		if(position < 0) {
			System.out.println("Position must be positive integer");
			return;
		}
		int length = arr.length;
		int[] rotateArray = new int[length];
		int index = 0;
		for(int i = length-position; i <= arr.length; i++) {
			if(i == length) {
				for(int k = 0; k<length-position;k++) {
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
