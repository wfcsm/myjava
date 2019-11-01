package com.zyc.test;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File f = new File("mm.txt");
//        f.createNewFile();
//        f.renameTo(new File("mm.txt"));
        f.delete();
    }
}
