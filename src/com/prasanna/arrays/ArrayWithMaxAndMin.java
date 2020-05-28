package com.prasanna.arrays;

import java.util.Arrays;

public class ArrayWithMaxAndMin {

	public static void main(String[] args) {

		int[] arr = {1,5,4,9,6,7,3,2};
		Arrays.sort(arr);
		arrangeArrayWithMaxAndMin(arr, arr.length);
	}

	private static void arrangeArrayWithMaxAndMin(int[] arr, int length) {
		
		// Auxiliary array to hold modified array 
        int temp[] = new int[length]; 
      
        // Indexes of smallest and largest elements 
        // from remaining array. 
        int small=0, large=length-1; 
      
        boolean flag = true; 
      
        for (int i=0; i<length; i++) { 
            if (flag) 
                temp[i] = arr[large--]; 
            else
                temp[i] = arr[small++]; 
      
            flag = !flag; 
        } 
        System.out.println(Arrays.toString(temp));
	}
	
}
