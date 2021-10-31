package com.lixiangdong.WarThunder;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/** 所有飞行器的父类 */
public abstract class Aerocraft {
    public static final int LIVE=1;
    public static final int DEAD=0;
    protected int state=LIVE;
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
        x=World.WIDTH-this.wide;
        y= new Random().nextInt(800)+50;
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
    public abstract ImageIcon gitImage();
    public void paintImage(Graphics g){
        if (this.state==LIVE)
            this.gitImage().paintIcon(null,g,x,y);
    }
}
