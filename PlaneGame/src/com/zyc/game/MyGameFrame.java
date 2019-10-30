package com.zyc.game;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

public class MyGameFrame extends Frame {
    Image bgImg = GameUtil.getImage("images/bg.jpg");
    Image planeImg = GameUtil.getImage("images/plane.png");
    int planeX = 250, planeY = 250;
    Plane plane = new Plane(planeImg, planeX, planeY);
    Shell[] shells = new Shell[50];
    Explode explode;
    Date startTime = new Date();
    Date endTime;
    int duringTime;

    @Override

    public void paint(Graphics g) {
        g.drawImage(bgImg, 0, 0, null);
        plane.drawSelf(g);
        for (int i = 0; i < 50; i++) {
            shells[i].draw(g);
            boolean collision = shells[i].getRect().intersects(plane.getRect());
            if (collision) {
//                System.out.println("相撞了！！！！！！！！！");
                plane.live = false;
                if (explode == null) {
                    explode = new Explode(plane.x, plane.y);
                    endTime = new Date();
                    duringTime = (int)((endTime.getTime() - startTime.getTime())/1000);
                }
                explode.draw(g);
            }
            if (plane.live==false){
                Font font = new Font("宋体",Font.BOLD,18);
                g.setColor(Color.red);
                g.setFont(font);
                g.drawString("游戏时间："+duringTime+"秒",200,200);
            }
        }

    }

    public void launchFrame() {
        this.setTitle("飞机大战");
        this.setVisible(true);
        this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        this.setLocation(300, 300);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new PaintThread().start();
        addKeyListener(new KeyMonitor());

//      初始化50个炮弹
        for (int i = 0; i < 50; i++) {
            shells[i] = new Shell();

        }
    }

    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    class KeyMonitor extends KeyAdapter {
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

    //    添加双缓冲技术
    private Image offScreenImage = null;

    public void update(Graphics g) {
        if (offScreenImage == null)
            offScreenImage = this.createImage(500, 500);//这是游戏窗口的宽度和高度

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }
}
