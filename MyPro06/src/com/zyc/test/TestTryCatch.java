package com.zyc.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestTryCatch {
    public static void main(String[] args)  {
        List list = new ArrayList<String>();
        FileReader reader = null;
        try {
            reader= new FileReader("/Users/zyc/a.txt");
            char c1 = (char)reader.read();
            System.out.print(c1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
