package jp.ac.it_college.std.s14008.pdp.proxy;

/**
 * Created by nao on 15/06/18.
 */
public interface Printable {
 public abstract void setPrinterName(String name);
 public abstract String getPrinterName();
 public abstract void print(String string);
}
