package com.mycollection;

import java.util.*;

public class TestStoreData {
    public static void main(String[] args) {
        Map<String,Object> row1 = new HashMap<>();
        row1.put("id",1001);
        row1.put("name","张三");
        row1.put("薪水","300000");


        Map<String,Object> row2 = new HashMap<>();
        row2.put("id",1002);
        row2.put("name","张三ae");
        row2.put("薪水","30000000");

        List<Map<String,Object>> list = new ArrayList<>();
        list.add(row1);
        list.add(row2);


        for(Map<String,Object> row:list){
           Set<String> keySet=row.keySet();
           for(String key:keySet){

           }
        }

    }


}
