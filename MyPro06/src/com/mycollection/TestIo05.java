package com.mycollection;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestIo05 {
    public static void main(String[] args) {
        byte[] src = "talk is cheap show me code".getBytes();
        try {
            InputStream is = new ByteArrayInputStream(src);
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
