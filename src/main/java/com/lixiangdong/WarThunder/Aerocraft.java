package com.lixiangdong.WarThunder;

import java.util.Random;

/** 所有飞行器的父类 */
public abstract class Aerocraft {
    protected int wide;
    protected int high;
    protected int x;
    protected int y;
    //速度
    protected int speed;
    //生命值
    protected int life;
    //垂直性能
    protected int pitch;
    public Aerocraft(int wide, int high,int life,int pitch,int speed){
        this.wide=wide;
        this.high=high;
        x=-wide;
        y= new Random().nextInt(1000);
        this.speed=speed;
        this.life=life;
        this.pitch=pitch;
    }
    public Aerocraft(int wide, int high, int x, int y, int speed,int life,int pitch){
        this.wide=wide;
        this.high=high;
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.life=life;
        this.pitch=pitch;
    }
    /** 移动 */
    public abstract void move();
    public abstract void gitImage();
}
