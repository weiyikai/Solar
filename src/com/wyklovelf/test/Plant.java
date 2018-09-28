package com.wyklovelf.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import com.wyklovelf.util.GameUtil;

/**
 * ������
 * @author wyk
 *
 */
public class Plant extends Star {
	
	//����ͼƬ�����ꡣ��������ĳ����Բ���У����ᣬ���ᣬ�ٶȡ��Ƕ�,����ĳ��Star��
	double longAxis;//��Բ�ĳ���
	double shortAxis;//��Բ�Ķ���
	double speed;//
	Star center;//
	double degree;//�Ƕȳ�ʼ��Ϊ0���ˣ�Ŷ
	boolean satellite;
	
	
	
//	@Override
	//��д�����draw����
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		super.draw(g);
		
//		g.drawImage(img, (int)x, (int)y, null);
		
		move();		
		if(!satellite) {
			drawTrace(g);
		}
	}
	
	public void drawTrace(Graphics g) {//���������ƺ��ǵ���Բ�켣
		double ovalX,ovalY,ovalWidth,ovakHeight;//��Բ�����о��ε�����(ovalX,ovalY),����ovalWidth,����ovakHeight
		
		ovalWidth = longAxis*2;
		ovakHeight = shortAxis*2;
		ovalX = (center.x + center.width/2) - longAxis;
		ovalY = (center.y + center.height/2) - shortAxis;
		
		
		
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		g.drawOval((int)ovalX,(int)ovalY,(int)ovalWidth,(int)ovakHeight);
		g.setColor(c);
	}
	
	public void move() {//�����ǵ���������̫��������תȦȦ�����������ƺ�����ת�ĽǶȣ����ƹ켣����Ԫ��Ϥ�����ᣬ���ᣩ��ִ�����ǵ��ƶ�
		//������Բ�켣����
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
