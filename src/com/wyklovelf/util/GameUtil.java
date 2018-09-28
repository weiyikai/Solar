package com.wyklovelf.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * ��Ϸ�����еĳ��õĹ�����(���磺����ͼƬ�ȷ���)
 * @author weiyikai
 *
 */ 
public class GameUtil {
  
	/**
	 * 
	 * @param path
	 * @return
	 */
	public static Image getImage(String path) {
		URL u = GameUtil.class.getResource(path);
		BufferedImage img = null;
		
		try {
			img = ImageIO.read(u);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
		
	}
	
//	public static Image getImage(String path) {
//		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
//	}
}
