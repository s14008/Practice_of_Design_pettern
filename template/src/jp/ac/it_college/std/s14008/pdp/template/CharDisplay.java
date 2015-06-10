package jp.ac.it_college.std.s14008.pdp.template;

/**
 * Created by nao on 15/06/04.
 */
public class CharDisplay {
 private char ch;
 public CharDisplay(char ch) {
  this.ch = ch;
 }
 public void open() {
  System.out.println("<<");
 }
 public void print() {
  System.out.println(ch);
 }
 public void close() {
  System.out.println(">>");
 }
}
