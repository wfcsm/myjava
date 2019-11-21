package com.mycollection;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestIo06 {
    public static void main(String[] args) {
        byte[] dest;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            String msg = "dfsdfsfs师德师风";
            byte[] data = msg.getBytes();
            baos.write(data,0,data.length);
            baos.flush();
            dest=baos.toByteArray();
            System.out.println(dest.length);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
