package jp.ac.it_college.std.s14008.pdp;

/**
 * Created by nao on 15/06/10.
 */
public abstract class Link extends Item{
 protected String url;
 public Link(String caption, String url) {
  super(caption);
  this.url = url;
 }
}
