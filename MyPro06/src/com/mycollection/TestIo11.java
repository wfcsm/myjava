package com.mycollection;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class TestIo11 {
    public static void main(String[] args) throws IOException {
//        File file = new File("a.txt");
        File file = new File("aaa.txt");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
        randomAccessFile.writeBytes("I Love You");
//        System.out.println(randomAccessFile.getFilePointer());
//        System.out.println(file.length());
//        for(int i = 0; i<randomAccessFile.length();i+=2){
//            randomAccessFile.seek(i);
//            System.out.println((char)randomAccessFile.readByte());
//        }
        InputStream is = new FileInputStream(file);
        System.out.println(is.skip(11));
//        FileUtils

    }

}
