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
  int color = (25 * 65536) + (105 * 256) + (1);
  int color2 = (10 * 65536) + (15 * 256) + (1);
  int color3 = (50 * 65536) + (122 * 256) + (1);
  int color4 = (100 * 65536) + (75 * 256) + (1);
  int color5 = (20 * 65536) + (196 * 256) + (252);
  BufferedImage img = new BufferedImage(width, height, type);

  public void setRGB(int x, int y, int color) {
    for (x = 0; x < width; x++) {
      for (y = 0; y < height; y++) {
        img.setRGB(x, y, color);
      }
    }
  }


  public void fillRect(int x, int y, int w, int h, int color2) {
    for (x = 80; x <= w; x++) {
      for (y = 120; y <= h; y++) {
        img.setRGB(x, y, color2);
      }
    }
  }

  public void drawLine (int a, int b, int w, int h, int color4){
    for (a = 78; a <= h; a++) {
      for (b = 120; b <= w; b++) {
        img.setRGB(a, b, color4);
      }
    }
  }

    public void drawLine2 (int c, int d, int w, int h, int color5){
      for (c = 80; c <= h; c++) {
        for (d = 120; d <= w; d++) {
          img.setRGB(c, d, color5);
        }
      }

  }
  public void drawRect(int x, int y, int w, int h, int color3) {
    for (x = 80; x < 299; x++) {
      for (y = 120; y < 299; y++) {
            img.setRGB(x, y, color3);
          }
        }
      }

  public static void main(String[] args) throws IOException {
    Main obj = new Main();

    obj.setRGB(0, 0, obj.color);
    obj.fillRect(400, 400, 300, 300, obj.color2);
    obj.drawRect(400, 400, 301, 301, obj.color3);
    obj.drawLine(300, 300,300,80, obj.color4);
    obj.drawLine2(300, 300,122,300, obj.color5);
    ImageIO.write(obj.img, "png", new File("image.png"));

  }
}
