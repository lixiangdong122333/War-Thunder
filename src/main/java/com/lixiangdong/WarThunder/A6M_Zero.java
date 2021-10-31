package com.lixiangdong.WarThunder;

import javax.swing.*;

/**
 * 敌机 零式战斗机
 */
public class A6M_Zero extends EnemyAirplane{

    public A6M_Zero() {
        super(50, 15, 60,4,2);
    }

    @Override
    public ImageIcon gitImage() {
        return Images.a6m_zero;
    }
}
