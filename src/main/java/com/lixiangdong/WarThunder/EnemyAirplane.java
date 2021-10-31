package com.lixiangdong.WarThunder;

import javax.swing.*;

/**
 * 敌机的父类
 */
public abstract class EnemyAirplane extends Aerocraft {
    private int upAnDownNum;
    public static final int UP=1;
    public static final int DOWN=0;
    private int upOrDown =DOWN;
    public EnemyAirplane(int wide, int high,int life,int pitch,int speed) {
        super(wide, high,life,pitch,speed);
    }

    @Override
    public void move() {
        x-=speed;
        if (upOrDown==UP){
            y-=pitch;
            upAnDownNum++;
        }else if (upOrDown==DOWN){
            y+=pitch;
            upAnDownNum--;
        }
        if (upAnDownNum>30){
            upOrDown=DOWN;
        }else if (upAnDownNum<0){
            upOrDown=UP;
        }
    }

    @Override
    public abstract ImageIcon gitImage();
}
