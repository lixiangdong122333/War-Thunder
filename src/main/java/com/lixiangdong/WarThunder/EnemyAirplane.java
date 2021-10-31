package com.lixiangdong.WarThunder;

import javax.swing.*;

/**
 * 敌机的父类
 */
public abstract class EnemyAirplane extends Aerocraft {
    private int upAnDownNum;
    public EnemyAirplane(int wide, int high,int life,int pitch,int speed) {
        super(wide, high,life,pitch,speed);
    }

    @Override
    public void move() {
        x-=speed;
        if (upAnDownNum>10){
            y+=pitch;
            upAnDownNum--;
        }else if (upAnDownNum < -10){
            y-=pitch;
            upAnDownNum++;
        }
    }

    @Override
    public abstract ImageIcon gitImage();
}
