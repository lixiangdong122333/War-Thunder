package com.lixiangdong.WarThunder;

import javax.swing.*;

/**
 * 可操纵飞机的父类
 */
public abstract class Warplanes extends Aerocraft {
    public Warplanes(int wide, int high, int speed, int life,int pitch) {
        super(wide, high, 0, 500, speed,life,pitch);
    }

    public abstract void move();

    public abstract ImageIcon gitImage();
}
