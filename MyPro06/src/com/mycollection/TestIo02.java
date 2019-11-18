package com.mycollection;

import java.io.*;

//12345
public class TestIo02 {
    public static void main(String[] args) {
        File file = new File("dest.txt");
        OutputStream os =null;
        try {
             os = new FileOutputStream(file);
             String msg ="asdad";
             byte[] data = msg.getBytes();
             os.write(data);
             os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
