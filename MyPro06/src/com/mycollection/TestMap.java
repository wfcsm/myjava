package com.mycollection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        System.out.println(map.get(1));

        System.out.println(map.size());

        System.out.println(map.containsKey(2));

        System.out.println(map.containsValue("four"));

    }
}
