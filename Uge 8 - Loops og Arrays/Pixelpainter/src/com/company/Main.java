package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Main {

  final int width = 400;
  final int height = 400;
  int type = BufferedImage.TYPE_INT_RGB;
  int color = (51 * 65536) + (255 * 256) + (1);
  int color2 = (51 * 65536) + (255 * 256) + (1);;
  BufferedImage img = new BufferedImage(width, height, type);

  public void setRGB(int x, int y, int color){
    for (x=0;x<width;x++){
      for (y=0;y<height;y++){
        img.setRGB(x, y, color);
      }
    }
  }

  public void fillRect(int x, int y, int w, int h, int color2){
    for (x=100;x<=w;x++){
      for (y=120;y<=h;y++){
        img.setRGB(x,y,color2);
      }
    }
  }

public static void main(String[]args)throws IOException{
    Main obj=new Main();

    obj.setRGB(0,0, obj.color);
    obj.fillRect(200,200,200,100, obj.color2);
    ImageIO.write(obj.img,"png",new File("image.png"));

    }
}
