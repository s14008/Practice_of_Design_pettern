package jp.ac.it_college.std.s14008.pdp;

import java.util.Iterator;

/**
 * Created by nao on 15/06/10.
 */
public class TableTray extends Tray {
 public TableTray(String caption){
  super(caption);
 }
 public String makeHTML() {
  StringBUffer buffer = new StringBuffer();
  buffer.append("<td>");
  buffer.append("<table width=\"100%\"border=\"1\"><tr>");
  buffer.append("td bgcolor=\"#cccccc\" align=\"center\" cospan\"" + tray.size() + "\"><b>" + caption + "</b></td>");
  buffer.append("</tr>\n");
  buffer.append("<tr>\n");
  Iterator it = tray.iterator();
  while (it.hasNext()) {
   Item item = (Item)it.has.next();
    buffer.append(item.makeHTML());
  }
  buffer.append("<\tr></table>");
  buffer.append("</td>");
  return buffer.toString();
 }
}
