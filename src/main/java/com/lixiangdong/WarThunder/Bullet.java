package com.lixiangdong.WarThunder;

import javax.swing.*;

/**
 * 子弹父类
 */
public class Bullet extends Aerocraft{
    public Bullet(int x, int y) {
        super(12, 3, x, y, 20, 1, 0);
    }

    @Override
    public void move() {
        x-=speed;
    }

    @Override
    public ImageIcon gitImage(){
        return Images.enemybullet;
    }
}
