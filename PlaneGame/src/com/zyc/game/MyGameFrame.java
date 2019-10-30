package com.zyc.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
    Image bgImg = GameUtil.getImage("images/bg.jpg");
    Image planeImg = GameUtil.getImage("images/plane.png");
    int planeX=250,planeY=250;
    Plane plane = new Plane(planeImg,planeX,planeY);

    @Override
    public void paint(Graphics g) {
        g.drawImage(bgImg,0,0,null);
        plane.drawSelf(g);

    }

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
        new PaintThread().start();
        addKeyListener(new KeyMonitor());
    }

    class PaintThread extends Thread{
        @Override
        public void run() {
            while(true){
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
//            System.out.println(e.getKeyCode());
            plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
//            System.out.println(e.getKeyCode());
            plane.minusDirection(e);
        }
    }


    public static void main(String[] args) {
        MyGameFrame my = new MyGameFrame();
        my.launchFrame();
    }
}
