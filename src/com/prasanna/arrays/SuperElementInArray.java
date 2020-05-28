package com.prasanna.arrays;

public class SuperElementInArray {

	public static void main(String[] args) {

		int[] arr= {1,2,4,5,6,9,8,7};
		findSuperElements(arr, arr.length);
	}

	private static void findSuperElements(int[] arr, int length) {
		if(length<3) {
			System.out.println("No Super Elements");
		}
		
		for (int i = 0; i < length; i++) { 
	        int count = 0; 
	        for (int j = 0; j < length; j++) 
	            if (arr[j] > arr[i]) 
	                count++; 
	        if (count >= 2) 
	        System.out.print(arr[i] + " "); 
	    } 
	}

}
