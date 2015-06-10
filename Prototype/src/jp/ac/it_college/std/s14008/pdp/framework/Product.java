package jp.ac.it_college.std.s14008.pdp.framework;

/**
 * Created by nao on 15/06/04.
 */
public interface Product {
 public abstract void use(String s);
 public abstract Product createClone();
}