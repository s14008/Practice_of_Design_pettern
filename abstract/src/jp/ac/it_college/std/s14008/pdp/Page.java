package jp.ac.it_college.std.s14008.pdp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Created by nao on 15/06/10.
 */
public abstract class Page {
 protected String title;
 protected String author;
 protected ArrayList content = new ArrayList();
 public Page(String title, String author) {
  this.title = title;
  this.author = author;
 }
 public void add(Item item) {
  content.add(item);
 }
 public void output() {
  try {
   String filename = title + "html";
   Writer writer = new FileWriter(filename);
   writer.write(this.makeHTML());
   writer.close();
   System.out.println(filename + "/////////////");
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
 public abstract String makeHTML();
}
