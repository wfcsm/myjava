package com.mycollection;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        File src = new File("qqq.pdf");
        File dest = new File("aaa.pdf");
        InputStream input = null;
        OutputStream output = null;
        try {
             input= new FileInputStream(src);
             output = new FileOutputStream(dest);
             byte[] flush = new byte[1024];
             int len;
             while ((len=input.read(flush)) != -1){
                 output.write(flush,0,len);
             }
             output.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(output != null){
                    output.close();
                }
                if(input != null){
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
