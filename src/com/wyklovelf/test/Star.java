package com.wyklovelf.test;

import java.awt.Graphics;
import java.awt.Image;

import com.wyklovelf.util.GameUtil;

/**
 * 星系类
 * @author weiyikai
 *
 */
public class Star {
	Image img;
	double x,y;
	int width,height;//图片的宽度和高度
	
	public void draw(Graphics g) {
		g.drawImage(img,(int)x,(int)y,null);
	}
	
	public Star(Image img) {
		this.img = img;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	
	
	public Star(String imgpath,double x,double y) {
		this(GameUtil.getImage(imgpath),(int)x,(int)y);//通过this调用另一个构造方法
		
	}

	public Star(Image img, double x, double y) {
//		super();
//		this.img = img;
		this(img);
		this.x = x;
		this.y = y;
//		this.width = img.getWidth(null);
//		this.height = img.getHeight(null);
		
	}
	
	public Star() {
		
	}
}
