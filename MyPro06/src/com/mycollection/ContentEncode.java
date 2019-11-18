package com.mycollection;

import java.io.*;
//12345679
public class ContentEncode {
    public static void main(String[] args) {
       File file = new File("dest.txt");
        InputStream is = null;
        try {
             is = new FileInputStream(file);
             byte[] flush = new byte[2];
             int len = -1;
             while ((len= is.read(flush))!=-1){
                 String str = new String(flush,0,len);
                 System.out.println(str);
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(is!=null){
                    is.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
