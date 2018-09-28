package com.wyklovelf.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import com.wyklovelf.util.GameUtil;

/**
 * 行星类
 * @author wyk
 *
 */
public class Plant extends Star {
	
	//除了图片，坐标。行星沿着某个椭圆运行：长轴，短轴，速度。角度,绕着某个Star飞
	double longAxis;//椭圆的长轴
	double shortAxis;//椭圆的短轴
	double speed;//
	Star center;//
	double degree;//角度初始化为0度了，哦
	boolean satellite;
	
	
	
//	@Override
	//重写父类的draw方法
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		super.draw(g);
		
//		g.drawImage(img, (int)x, (int)y, null);
		
		move();		
		if(!satellite) {
			drawTrace(g);
		}
	}
	
	public void drawTrace(Graphics g) {//画出行星绕恒星的椭圆轨迹
		double ovalX,ovalY,ovalWidth,ovakHeight;//椭圆的外切矩形的坐标(ovalX,ovalY),长轴ovalWidth,短轴ovakHeight
		
		ovalWidth = longAxis*2;
		ovakHeight = shortAxis*2;
		ovalX = (center.x + center.width/2) - longAxis;
		ovalY = (center.y + center.height/2) - shortAxis;
		
		
		
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		g.drawOval((int)ovalX,(int)ovalY,(int)ovalWidth,(int)ovakHeight);
		g.setColor(c);
	}
	
	public void move() {//让行星的中心绕着太阳的中心转圈圈，根据行星绕恒星所转的角度，所绕轨迹的土元熟悉（长轴，短轴）来执行行星的移动
		//沿着椭圆轨迹飞行
				x = (center.x + center.width/2) + longAxis*Math.cos(degree) - img.getWidth(null)/2;
				y = (center.y + center.height/2) + shortAxis*Math.sin(degree) - img.getHeight(null)/2;
				
				degree += speed;
	}

	public Plant(Star center,String imgpath, double longAxis, double shortAxis, double speed) {
		
//		super(imgpath, x, y);
		super(GameUtil.getImage(imgpath));
		this.center = center;
		this.x = center.x + longAxis;
		this.y = center.y;
//		this.img = GameUtil.getImage(imgpath);
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	
	
	public Plant(Star center,String imgpath, double longAxis, double shortAxis, double speed,boolean satellite) {
		this(center, imgpath, longAxis, shortAxis, speed);
		this.satellite  = satellite;
	}

	public Plant(String imgpath, double x, double y) {
		super(imgpath, x, y);
	}
	
	public Plant(Image img,double x,double y) {
		super(img, x, y);
	}
}
