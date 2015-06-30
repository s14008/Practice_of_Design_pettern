package jp.ac.it_college.std.s14008.pdp.proxy;


import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 * Created by nao on 15/06/18.
 */
public abstract class Printer implements Printable {
 private String name;

 public Printer() {
  heavyJob("Printer instance make...");
 }

 public Printer(String name) {
  this.name = name;
  heavyJob("Printer instance(" + name + ") this make... ");
 }

 public void setPrinterName(String name) {
  this.name = name;
 }

 public String getPrinterName() {
  return name;
 }

 public void print(String string) {
  System.out.println("=== " + name + " ===");
  System.out.println(string);
 }

 public void heavyJob(String msg) {
  System.out.print(msg);
  for (int i = 0; i < 5; i++) {
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
   }
   System.out.print(".");
  }
  System.out.println("Completion");
 }
}