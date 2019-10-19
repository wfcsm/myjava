package test;
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image table = Toolkit.getDefaultToolkit().getImage("images/table.jpg");

    double x = 100;
    double y = 100;
//    boolean right = true;
    double degree = 3.14/3;
    //画窗口的方法
    public void paint(Graphics g){
        g.drawImage(table,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        x  = x+ 10*Math.cos(degree);
        y  = y +10*Math.sin(degree);

        if(y > 500-50-30 || y<40+40){
            degree = -degree;
        }
        if(x >856-50-30 || x<40+30){
            degree = 3.14 - degree;
        }
    }

    //窗口加载
    void launchFrame(){

        setSize(856, 500);
        setLocation(50, 50);
        setVisible(true);
        while(true){
            repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        BallGame2 game = new BallGame2();
        game.launchFrame();
    }
}
