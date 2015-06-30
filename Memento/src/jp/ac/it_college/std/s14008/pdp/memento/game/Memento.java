package jp.ac.it_college.std.s14008.pdp.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nao on 15/06/17.
 */
public class Memento {
 int money;
 ArrayList<String> fruits;
 public int getMoney() {
  return money;
 }
 Memento(int money) {
  this.money = money;
  this.fruits = new ArrayList();
 }
 void addFruit(String fruit) {
  fruits.add(fruit);
 }
 List getFruits() {
  return (List<String>) fruits.clone();
 }
}
