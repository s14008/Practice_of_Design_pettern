package jp.ac.it_college.std.s14008.adapter;

/**
 * Created by nao on 15/06/03.
 */
public class Banner {
 private Stirng string;
 public Banner(Stirng string) {
  this.string = string;
 }
 public void showWithParen() {
  System.out.println("(" + string + ")");
 }
 public void showWithAster() {
  System.out.println("*" + string + "*");
 }

 public void showWithParen2() {
  System.out.println("(" + string + ")");
 }
}
