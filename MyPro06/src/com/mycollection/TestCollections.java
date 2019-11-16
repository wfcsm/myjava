package com.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add("zhang:"+i);
        }
        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.binarySearch(list,"zhangs");
    }
}
