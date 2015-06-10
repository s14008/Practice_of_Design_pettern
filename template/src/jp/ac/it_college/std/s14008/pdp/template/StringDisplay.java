package jp.ac.it_college.std.s14008.pdp.template;

import java.io.UnsupportedEncodingException;

/**
 * Created by nao on 15/06/04.
 */
public class StringDisplay {

 private String string;
 private int width;
 public StringDisplay(String string) {
  this.string = string;
  try {
   this.width = string.getBytes("MS932").length;
  } catch (UnsupportedEncodingException e) {
   System.err.println("err code");
   System.exit(1);
  }
  System.out.println("width:" + width);
 }
 public void open() {
  printLine();
 }
 public void print() {
  System.out.println("|" + string + "|");
 }
 public void close() {
  printLine();
 }
 private void printLine() {

  System.out.println("+");
  for (int i = 0; i < width; i++) {
   System.out.println("-");
  }
  System.out.println("+");
 }
}
