package jp.ac.it_college.std.s14008.pdp.proxy;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

/**
 * Created by nao on 15/06/18.
 */
public class PrinterProxy implements Printable {
 private String name;
 private Printer real;

 public PrinterProxy() {
 }

 public PrinterProxy(String name) {
  this.name = name;
 }

 @Override
 public synchronized void setPrinterName(String name) {
  if (real != null) {
   real.setPrinterName(name);
  }
  this.name = name;
 }

 @Override
 public String getPrinterName() {
  return name;
 }

 @Override
 public void print(String string) {
  realize();
  real.print(string);
 }

 private synchronized void realize() {
  if (real == null) {
   real = new Printer(name) {
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
     return 0;
    }
   };
  }
 }
}