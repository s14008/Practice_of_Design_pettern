package jp.ac.it_college.std.s14008.pdp;

/**
 * Created by nao on 15/06/10.
 */
public abstract class Tray extends Item{
 protected ArrayList tray = new ArratyList();
 public Tray(String caption) {
  super(caption);
 }
 public void add(Item item) {
  tray.add(item);
 }
}
