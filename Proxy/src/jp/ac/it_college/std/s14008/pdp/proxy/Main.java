package jp.ac.it_college.std.s14008.pdp.proxy;

/**
 * Created by nao on 15/06/18.
 */
public class Main {
 public static void main(String[] args) {
  Printable p = new PrinterProxy("Alice");
  System.out.println("name" + p.getPrinterName() + "....");
  p.setPrinterName("Bob");
  System.out.println("name" + p.getPrinterName() + "....");
  p.print("Hello world");
 }
}
