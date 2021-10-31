package com.lixiangdong.WarThunder;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class World extends JPanel {
    public static final int WIDTH=1600;
    public static final int HEIGHT=900;
    Warplanes aircraft=new Yak_3p();
    EnemyAirplane[] enemyAirplanes={};
    Bullet[] bullets={};
    public void move(){
        for (int i=0;i<enemyAirplanes.length;i++){
            enemyAirplanes[i].move();
        }
        for (int i=0;i<bullets.length;i++){
            bullets[i].move();
        }
    }
    /**返回一个随机类型的敌机*/
    public EnemyAirplane getEnemyAirplane(){
        Random random=new Random();
        int num=random.nextInt(30);
        if (num>15){
            return new A6M_Zero();
        }else{
            return new F6f();
        }
    }
    private static int addEnemyAirplaneFrequencyLimit;
    /**扩容数组并把随机类型的飞机置于末位*/
    public void addEnemyAirplane(){
        addEnemyAirplaneFrequencyLimit++;
        if (addEnemyAirplaneFrequencyLimit%30==0) {
            EnemyAirplane obj = getEnemyAirplane();
            enemyAirplanes = Arrays.copyOf(enemyAirplanes, enemyAirplanes.length + 1);
            enemyAirplanes[enemyAirplanes.length - 1] = obj;
        }
    }
    public void action(){
        //计时
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                move();
                addEnemyAirplane();
                repaint();
            }
        },10,10);

    }
    public void paint(Graphics g){
        Images.buckground.paintIcon(null,g,0,0);
        aircraft.paintImage(g);
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
