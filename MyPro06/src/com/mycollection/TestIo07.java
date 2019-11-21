package com.mycollection;

import java.io.*;

//
public class TestIo07 {
    public static void main(String[] args) {
        byte[] data=fileToByteArray("qqq.pdf");
//        System.out.println(data.length);
        ByteArrayToFile(data,"aaa.pdf");
    }

   public static byte[] fileToByteArray(String filePath){
        File file = new File(filePath);
        InputStream inputStream=null;
       try {
           inputStream = new FileInputStream(file);
           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
           byte[] flush = new byte[1024];
           int len=-1;
           while((len=inputStream.read(flush))!=-1){
               byteArrayOutputStream.write(flush,0,len);
           }
           byteArrayOutputStream.flush();
           return byteArrayOutputStream.toByteArray();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           try {
               if(inputStream != null){
                   inputStream.close();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
       return null;
   }

    public static void ByteArrayToFile(byte[] src , String filePath){
        ByteArrayInputStream byteArrayOutputStream = new ByteArrayInputStream(src);
        OutputStream outputStream=null;
        try {
            outputStream = new FileOutputStream(filePath);
            byte[] flush = new byte[1024];
            int len =-1;
            while((len=byteArrayOutputStream.read(flush))!=-1){
                outputStream.write(flush,0,len);
            }
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(outputStream != null){
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
