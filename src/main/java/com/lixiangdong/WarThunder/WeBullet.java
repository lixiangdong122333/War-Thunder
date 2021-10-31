package com.lixiangdong.WarThunder;

import javax.swing.*;

/**
 * 我方子弹
 */
public class WeBullet extends Bullet{

    public WeBullet(int x, int y) {
        super(x, y);
    }

    @Override
    public void move() {

    }

    @Override
    public ImageIcon gitImage() {
        return Images.webullet;
    }
}
