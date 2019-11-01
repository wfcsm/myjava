package com.zyc.test;

import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 6, 2, 9, 0, 7, 4, 5, 8 };
        Arrays.sort(arr);

        System.out.println(myBinarySearch(arr,8));
        Integer i = new Integer(1);
        Integer a = Integer.valueOf(2);
        System.out.println(a);

    }

    public static int myBinarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (low+high)/2;
            if (value == arr[mid]){
                return mid;
            }
            if (value<mid){
                high = mid-1;
            }
            if (value>mid){
                low = mid+1;
            }
        }
        return -1;
    }
}
