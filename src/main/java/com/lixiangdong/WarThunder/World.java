package com.lixiangdong.WarThunder;

import javax.swing.*;
import java.awt.*;

public class World extends JPanel {
    public static final int WIDTH=1600;
    public static final int HEIGHT=900;
    Warplanes yak_3p=new Yak_3p();
    EnemyAirplane[] enemyAirplanes={new F6f(),new A6M_Zero()};
    Bullet[] bullets={new EnemyBullet(11,11),new WeBullet(100,100)};
    public void action(){

    }
    public void paint(Graphics g){
        Images.buckground.paintIcon(null,g,0,0);
        yak_3p.paintImage(g);
        for (int i=0;i<enemyAirplanes.length;i++){
            enemyAirplanes[i].paintImage(g);
        }
        for (int i=0;i<bullets.length;i++){
            bullets[i].paintImage(g);
        }

    }
    public static void main(String[] args) {
        World world=new World();
        JFrame frame=new JFrame();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+16,HEIGHT+39);
        frame.setLocationRelativeTo(null);
        //设置窗口可见并尽快调用paint()方法
        frame.setVisible(true);

        world.action();
    }
}
