package com.zyc.test;

import java.util.Arrays;

public class Test2DimensionArray {
    public static void main(String[] args) {
//        int[] a = new int[3];
//        Car[] cars = new Car[3];
//        int[][] a = new int[3][];
//        a[0] = new int[]{20,30};
//        a[1] = new int[]{10,15,80};
//        System.out.println(a[1][2]);
        Object[] emp1 = {1001,"dsdf",18,"werw","2006.6.6"};

        Object[][] tableData = new Object[3][];
        tableData[0] = emp1;
        tableData[1] = emp1;
        tableData[2] = emp1;
        for (int i=0;i<3;i++){
            System.out.println(Arrays.toString(tableData[i]));
        }
    }
}

class Car{}
