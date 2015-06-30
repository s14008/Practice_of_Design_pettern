package jp.ac.it_college.std.s14008.pdp.command;

import com.sun.scenario.effect.impl.prism.ps.PPSDrawable;

import java.awt.*;

/**
 * Created by nao on 15/06/18.
 */
public class DrawCommand implements Command {

 protected Drawable drawable;

 private Point position;

 public DrawCommand(Drawable drawable, Point position) {
  this.drawable = drawable;
  this.position = position;
 }
 public void execute() {drawable.draw(position.x, position.y);
 }
}
