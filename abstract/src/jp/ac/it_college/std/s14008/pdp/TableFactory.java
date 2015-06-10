package jp.ac.it_college.std.s14008.pdp;

/**
 * Created by nao on 15/06/10.
 */
public class TableFactory extends Factory {
 public Link creatLink(String caption, String url) {
  return new TableLInk(caption, url);
 }
 public Tray creatTray(String caption) {
  return new TableTray(caption);
 }
 public Page creatPage(String title, String author) {
  return new TablePage(titlem author);
 }
}
