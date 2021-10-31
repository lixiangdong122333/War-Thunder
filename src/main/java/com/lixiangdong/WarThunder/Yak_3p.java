package com.lixiangdong.WarThunder;

import javax.swing.*;

/**
 * 可操作飞机 雅克 3P
 */
public class Yak_3p extends Warplanes {

    public Yak_3p() {
        super(50, 15, 20, 100, 5);
    }

    @Override
    public void move() {}

    @Override
    public ImageIcon gitImage() {
        return Images.yak_3p;
    }
}
