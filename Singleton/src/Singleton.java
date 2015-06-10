/**
 * Created by nao on 15/06/04.
 */
public class Singleton {
 private static Singleton singleton = new Singleton();
 private Singleton() {
  System.out.println("");
 }
 public static Singleton getInstance() {
  return singleton;
 }
}
