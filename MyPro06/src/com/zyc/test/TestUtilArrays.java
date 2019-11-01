package com.zyc.test;

import java.util.Arrays;

public class TestUtilArrays {
    public static void main(String[] args) {
         int[] a = {100,20,30,5,150,80};
         System.out.println(a);
         System.out.println(Arrays.toString(a));
//         Arrays.sort(a);
//         System.out.println(a);
//         System.out.println(Arrays.toString(a));

         System.out.println(Arrays.binarySearch(a,2000000));
    }
}
