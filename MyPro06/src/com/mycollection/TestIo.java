package com.mycollection;

import java.io.File;
import java.io.IOException;

public class TestIo {
    private long len;
    private String path;
    private File src;

    public TestIo(String path){
        this.path = path;
        this.src = new File(path);
        count(this.src);
    }

    public static void main(String[] args) throws IOException {
        TestIo dir = new TestIo("/Users/zyc/Desktop/测试");

//        System.out.println(File.separator);
//        String path = "/Users/zyc/Desktop/测试/a.txt";
//
//        System.out.println(System.getProperty("user.dir"));
//        File src = new File(path);
//        System.out.println(src.length());

//        File src = new File("/Users/zyc/Desktop/测试/c");
//        System.out.println(src.getName());
//        System.out.println(src.getPath());
//        System.out.println(src.getAbsolutePath());
//        System.out.println(src.getParent());
//        System.out.println(src.getParentFile().getName());
//        System.out.println(src.exists());
//        System.out.println(src.isFile());
//        System.out.println(src.length());
//        boolean flag = src.createNewFile();
//        System.out.println(flag);
//        src.delete();
//        File src = new File("/Users/zyc/Desktop/测试");
//        String[] ls =src.list();
//        for(String s:ls){
//            System.out.println(s);
//        }
//
//        System.out.println("----------");
//        File[] files = src.listFiles();
//        for(File f:files){
//            System.out.println(f.getAbsolutePath());
//        }
//
//        System.out.println("----------");





    }

    public static void printName(File src, int deep){
        for(int i=0;i<deep;i++){
            System.out.println("-");
        }

        System.out.println(src.getName());
        if(src == null || !src.exists()){
            return;
        }else if(src.isDirectory()){
            for(File s:src.listFiles()){
                printName(s,deep+1);
            }
        }
    }

    private   void count(File src){
        if(src != null && src.exists()){
            if(src.isFile()){
                len += src.length();
            }else{
                for(File s:src.listFiles()){
                    count(s);
                }
            }
        }
    }

}

class DirCount{

}
