package com.mycollection;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class TestTreeSet {
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<>();

        set.add(300);
        set.add(200);
        set.add(600);

        for(Integer i:set){
            System.out.println(i);
        }


        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        for(Iterator<String> iter = list.iterator(); iter.hasNext(); ){
            String temp = iter.next();
            System.out.println(temp);
        }


//        Map<Integer,String> map1 = new HashMap<>();
//        map1.put(100,"aa");
//        map1.put(200,"bb");
//        map1.put(300,"bb");
//        Set<Map.Entry<Integer,String>> ss = map1.entrySet();
//        for(Iterator< Map.Entry<Integer,String> > iter = ss.iterator(); iter.hasNext();){
//            Map.Entry<Integer,String> temp =  iter.next();
//
//            System.out.println(temp.getKey()+"--"+temp.getValue());
//        }


        Map<Integer,String> map2 = new HashMap<>();
        map2.put(100,"aa");
        map2.put(200,"bb");
        map2.put(300,"bb");
        Set<Integer> ss2 = map2.keySet();
        for(Iterator<Integer> iter = ss2.iterator(); iter.hasNext();){
            Integer key =  iter.next();

            System.out.println(key+"--"+map2.get(key));
        }


    }
}
