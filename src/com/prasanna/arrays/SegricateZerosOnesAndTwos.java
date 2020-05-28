package com.prasanna.arrays;

public class SegricateZerosOnesAndTwos {
	// Sort the input array, the array is assumed to have values in {0, 1, 2} 
    static void sort012(int[] a, int arrSize) 
    { 
        int lo = 0; 
        int hi = arrSize - 1; 
        int mid = 0, temp = 0; 
        while (mid <= hi) { 
            switch (a[mid]) { 
            case 0: { 
                temp = a[lo]; 
                a[lo] = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        } 
    } 
  
    static void printArray(int[] arr, int arrSize) { 
        for (int i = 0; i < arrSize; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    public static void main(String[] args) { 
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        int arrSize = arr.length; 
        sort012(arr, arrSize); 
        System.out.println("Array after seggregation "); 
        printArray(arr, arrSize); 
    } 
}
