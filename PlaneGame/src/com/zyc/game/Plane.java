package com.zyc.game;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {
    boolean left,right,up,down;
    boolean live = true;

    @Override
    public void drawSelf(Graphics g) {
        if (live){
            super.drawSelf(g);
            if (left){
                x -= speed;
            }
            if (right){
                x+=speed;
            }
            if (up){
                y-=speed;
            }
            if (down){
                y+=speed;
            }
        }

    }
    public  Plane(Image img, double x, double y){
        super(img,x,y);
//        this.x = x;
//        this.y = y;
//        this.img = img;
        this.speed =3;
        this.width =img.getWidth(null);
        this.height = img.getHeight(null);

    }

    public void addDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
            default:
                break;
        }
    }

    public void minusDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
            default:
                break;
        }
    }
}
