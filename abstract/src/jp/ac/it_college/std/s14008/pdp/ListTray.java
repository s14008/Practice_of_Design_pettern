package jp.ac.it_college.std.s14008.pdp;

import java.util.Iterator;

/**
 * Created by nao on 15/06/10.
 */
public class ListTray extends Tray {
 public ListTray(String caption) {
   super(caption);
 }
 public String makeHTML() {
  StringBuffer buffer = new StringBuffer();
    buffer.append("<li>\n");
    buffer.append(caption + "\n");
  buffer.append("<ul>\n");
  Iterator it = tray.iterator();
  while (it.hasNext()) {
   Item item = (Item)it.next();
   buffer.append(Item.makeHTML());
  }
  buffer.append("</ul>\n");
  buffer.append("</li>\n");
  return buffer.toString();
 }
}