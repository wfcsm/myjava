package com.mycollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestSet {
//    Set<String> set = new HashSet<>();
    HashMap map;

    private static final  Object PRESENT = new Object();

    public  TestSet(){
        map = new HashMap();
    }

    public int size(){
        return map.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Object key: map.keySet()){
            sb.append(key+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public void add(Object o){
        map.put(o,PRESENT);
    }
}
