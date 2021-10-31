package com.lixiangdong.WarThunder;

import javax.swing.*;

public class Images {
    public static ImageIcon yak_3p;
    public static ImageIcon buckground;
    public static ImageIcon f6f;
    public static ImageIcon a6m_zero;
    public static ImageIcon enemybullet;
    public static ImageIcon webullet;
    static {

        yak_3p=new ImageIcon("Images/yak_3p.png");
        buckground=new ImageIcon("Images/background.png");
        f6f=new ImageIcon("Images/f6f.png");
        a6m_zero=new ImageIcon("Images/a6m_zero.png");
        enemybullet=new ImageIcon("Images/enemybullet.png");
        webullet=new ImageIcon("Images/webullet.png");
    }

    public static void main(String[] args) {
        System.out.println(yak_3p.getImageLoadStatus());
        System.out.println(buckground.getImageLoadStatus());
        System.out.println(f6f.getImageLoadStatus());
        System.out.println(a6m_zero.getImageLoadStatus());
        System.out.println(enemybullet.getImageLoadStatus());
        System.out.println(webullet.getImageLoadStatus());
    }
}
