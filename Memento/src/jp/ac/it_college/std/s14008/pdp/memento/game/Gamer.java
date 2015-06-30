package jp.ac.it_college.std.s14008.pdp.memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by nao on 15/06/17.
 */
public class Gamer {
 private int money;
 private List fruits = new ArrayList();
 private Random random = new Random();
 private static String[] fruitsname = {
   "Apple", "Grape", "Banana", "Orange",
 };
 public Gamer(int money) {
  this.money = money;
 }
 public int getMoney() {
  return money;
 }
 public void bet() {
  int dice = random.nextInt(6) + 1;
  if (dice == 1) {
   money += 100;
   System.out.println("up money");
  } else if (dice == 2) {
   money /= 2;
   System.out.println("half money");
  } else if (dice == 6) {
   String f = getFruit();
   System.out.println("fruit(" + f + ")get...");
   fruits.add(f);
  } else {
   System.out.println("not found");
  }
 }
 public Memento createMemento() {
  Memento m = new Memento(money);
  Iterator it = fruits.iterator();
  while (it.hasNext()) {
   String f = (String)it.next();
   if (f.startsWith("delicious")) {
    m.addFruit(f);
   }
  }
  return m;
 }
 public void restoreMemento(Memento memento) {
  this.money = memento.money;
  this.fruits = memento.getFruits();
 }
 public String toString() {
  return "[money = " + money + ",fruits = " + fruits + "]";
 }
 private String getFruit() {
  String prefix = "";
  if (random.nextBoolean()) {
   prefix = "delicious";
  }
  return prefix + fruitsname[random.nextInt(fruitsname.length)];
 }
}
