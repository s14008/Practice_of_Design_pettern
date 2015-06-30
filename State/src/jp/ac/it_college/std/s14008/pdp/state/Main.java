package jp.ac.it_college.std.s14008.pdp.state;

/**
 * Created by nao on 15/06/17.
 */
public class Main {
 public static void main(String[] args) {
  SafeFrame frame = new SafeFrame("State Smple");
  while (true) {
   for (int hour = 0; hour < 24; hour++) {
    frame.setClock(hour);
    try {
     Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
   }
  }
 }
}
