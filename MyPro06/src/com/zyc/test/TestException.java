package com.zyc.test;

public class TestException {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        if(a!=0){
            System.out.println(b/a);
        }
        String str = null;
        if(str!=null){
            str.length();
        }

    }
}
