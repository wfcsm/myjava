package com.zyc.test;

public class TestArray {
    public static void main(String[] args) {

        String[] s = {"阿里","尚学堂","京东","搜狐","网易"};
//        String[] s2 = new String[10];
//        System.arraycopy(s1,2,s2,6,2);
//        for(String m:s2){
//            System.out.println(m);
//        }
        removeElement(s,2);
    }

    public static void removeElement(String[] s1,int index){
//        String[] s1 = {"aa","bb","cc","dd","ee"};
        System.arraycopy(s1,index+1,s1,index,s1.length-index-1);
        s1[s1.length-1]=null;
        for(String m:s1){
            System.out.println(m);
        }
    }

}
