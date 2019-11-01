package com.zyc.test;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for(int i=0; i<26; i++){
            char temp=(char)('a'+i);
            builder.append(temp);
        }
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        builder.insert(0,"我");
        System.out.println(builder);

    }
}
