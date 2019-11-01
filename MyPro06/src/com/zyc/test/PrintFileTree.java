package com.zyc.test;

import java.io.File;

public class PrintFileTree {
    public static void main(String[] args) {
        printFile(new File("/Users/zyc/IdeaProjects"), 0);
    }

    static void printFile(File file, int level){
        for(int i=0; i<level; i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(int i=0;i<files.length;i++){
                printFile(files[i], level+1);
            }
        }
    }
}
