package jp.ac.it_college.std.s14008.pdp.command;

import java.awt.*;

/**
 * Created by nao on 15/06/18.
 */
public class DrawCanvas extends Canvas implements Drawable{
 private Color color = Color.red;

 private  int radius = 6;

 private MacroCommand history;

 public DrawCanvas(int width, int height, MacroCommand history) {
  setSize(width,height);
  setBackground(Color.white);
  this.history = history;
 }
 public void point(Graphics g) {
  history.execute();
 }

 @Override
 public void draw(int x, int y) {
  Graphics g = getGraphics();
  g.setColor(color);
  g.fillOval(x - radius, y - radius, radius * 2, radius *2);
 }
}
