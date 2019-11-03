package com.zyc.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        test03();

    }

    public static void test01(){
        Collection<String> c = new ArrayList<>();
        c.size();
        c.isEmpty();
        c.add("1");
        c.add("2");

        Object[] o=c.toArray();


        c.remove("1");
        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());
    }

    public static  void test02(){
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");

        list01.addAll(list02);
        System.out.println(list01);

    }

    public static void test03(){
        List l= new ArrayList(10);
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        list.add(2,"sfsd");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2,"qqq");
        System.out.println(list);

        System.out.println(list.get(2));
        list.add("C");
        list.add("B");
        list.add("A");

        System.out.println(list.indexOf("B"));
        System.out.println(list.lastIndexOf("B"));

       System.out.println(8<<1);
    }
}

