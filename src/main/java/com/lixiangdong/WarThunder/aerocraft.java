package com.lixiangdong.WarThunder;

/** 所有飞行器的父类 */
public abstract class aerocraft {
    private int wide;
    private int high;
    private int x;
    private int y;
    private int speed;
    /** 移动 */
    public abstract void move();
    public abstract void gitImage();
}
