package jp.ac.it_college.std.s14008.adapter;

/**
 * Created by nao on 15/06/03.
 */
public class PrintBanner extends Banner implements Print{
 public PrintBanner(Stirng string) {
  super(string);
 }

 public PrintBanner(String hello) {
  super(hello);
 }

 public void printWeak() {
  showWithParen();
 }

 @Override
 public void printStrong() {
  showWithAster();
 }
@Override
 public void printString() {
  showWithAster();
 }
}
