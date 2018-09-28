package com.wyklovelf.test;

import java.awt.Graphics;
import java.awt.Image;

import com.wyklovelf.util.*;
import com.wyklovelf.util.GameUtil;
import com.wyklovelf.util.MyFrame;

/**
 * Ì«ÑôÏµ´°¿Ú
 * @author weiyikai
 *
 */
public class SolarFrame extends MyFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Image img = GameUtil.getImage("/images/galaxy_1.jpg");//¼ÓÔØ±³¾°Í¼Æ¬
	
	Star sun = new Star("/images/4.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2);
	
	
	
	Plant earth = new Plant(sun,"/images/7.jpg", 150, 100, 0.1);
	
	Plant a = new Plant(sun,"/images/aa.jpg", 200, 120, 0.15);
	
	Plant b = new Plant(sun,"/images/bb.jpg", 220, 140, 0.18);
	
	Plant c = new Plant(sun,"/images/cc.jpg", 240, 160, 0.2);
	
	Plant d = new Plant(sun,"/images/dd.jpg",350,200,0.05);
	
	Plant dd = new Plant(d,"/images/ddd.jpg",50,40,0.1,true);
	
	
	public void paint(Graphics g) {
		g.drawImage(img,0,0,null);
		
		sun.draw(g);
		
		earth.draw(g);
		
		a.draw(g);
		
		b.draw(g);
		
		c.draw(g);
		
		d.draw(g);
		
		dd.draw(g);
	}
	
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}
	
	
	
}
