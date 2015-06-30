package jp.ac.it_college.std.s14008.pdp.observer;

import java.util.Random;

/**
 * Created by nao on 15/06/16.
 */
public class RandomNumberGenerator extends NumberGenerator {
 private Random random = new Random();
 private int number;

 @Override
 public int getNumber() {
  return number;
 }

 @Override
 public void execute() {
  for (int i = 0; i < 20; i++) {
   number = random.nextInt(50);
   notifyObservers();
  }
 }
}
