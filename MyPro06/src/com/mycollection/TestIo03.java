package com.mycollection;

import java.io.*;

public class TestIo03 {
    public static void main(String[] args) {
        File file = new File("dest.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
            char[] flush = new char[1024];
            int len = -1;
            while ((len=reader.read(flush))!=-1){
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {

            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
