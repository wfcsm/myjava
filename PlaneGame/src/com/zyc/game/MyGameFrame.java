package com.zyc.game;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
    public void launchFrame(){
        this.setTitle("飞机大战");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }

    public static void main(String[] args) {
        MyGameFrame my = new MyGameFrame();
        my.launchFrame();
    }
}
