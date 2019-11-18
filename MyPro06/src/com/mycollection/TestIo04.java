package com.mycollection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestIo04 {
    public static void main(String[] args) {
        File file = new File("dest.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            String msg = "扎实打十分大`";
            writer.write(msg);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
