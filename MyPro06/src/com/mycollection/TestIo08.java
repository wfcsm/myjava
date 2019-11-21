package com.mycollection;

import java.io.*;

public class TestIo08 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("qqq.pdf");
            OutputStream outputStream = new FileOutputStream("aaa.pdf");
            copy(inputStream,outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream){
        try(inputStream; outputStream) {
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = inputStream.read(flush)) != -1) {
                outputStream.write(flush,0,len);
            }
            outputStream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void close(Closeable... ios){
            for (Closeable io : ios) {
                try {
                    if(io!=null){
                        io.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}
