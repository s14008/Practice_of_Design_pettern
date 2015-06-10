package jp.ac.it_college.std.s14008.pdp;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import jp.ac.it_college.std.s14008.adapter.*;
import jp.ac.it_college.std.s14008.pdp.template.AbstractDisplay;
import jp.ac.it_college.std.s14008.pdp.template.CharDisplay;
import jp.ac.it_college.std.s14008.pdp.template.StringDisplay;

import javax.xml.parsers.FactoryConfigurationError;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.KeyStore;
import java.util.*;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        templateTest();
    }

    public static void iteratorMain() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Chinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

    public static void practice1_1() {
        BookShelf2 bookShelf = new BookShelf2(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Chinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

    public static void adapterMain() {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printString();
    }

    public static void adapterMain2() {
        Print2 p = new PrintBanner2("Hello");
        p.printWeak();
        p.printString();
    }

    public static void arrayListTest1() {
        ArrayList<String> list = new ArrayLIst();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        for (String name : list) {
            System.out.println(name);
        }
    }

    public static void arrayListTest2() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(56);
        list.add(78);
        list.add(90);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "i" + list.get(i));
        }
        System.out.println();

        if (list.contains("Alice")) {
            System.out.println("list Alice");
        } else {
            System.out.println("list Alice");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
            list.add(String.valueOf((Math.random() * 100)));
        }
    }

    public static void linkedListTest() {
        LinkedList<Stirng> list = new LinkedList<>();
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");
    }

    public static void queueTest1() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        System.out.println("" + queue);
        queue.offer("Bob");
        System.out.println("" + queue);
        queue.offer("Chris");
        System.out.println("" + queue);
        queue.offer("Diana");
        System.out.println("" + queue);

        while (true) {
            String name = queue.element();
            System.out.println("" + name);

            name = queue.remove();
            System.out.println("" + name);
            System.out.println("" + queue);
        }
    }

    public static void queueTest2() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        System.out.println("" + queue);
        queue.offer("Bob");
        System.out.println("" + queue);
        queue.offer("Chris");
        System.out.println("" + queue);
        queue.offer("Diana");
        System.out.println("" + queue);

        while (true) {
            String name = queue.element();
            System.out.println("" + name);

            name = queue.remove();
            System.out.println("" + name);
            System.out.println("" + queue);
        }
    }

    public static void hashSetTest() {
        set<String> set = new HashSet<>();

        set.add("Alice");
        set.add("Bob");
        set.add("Chris");
        set.add("Diana");
        set.add("Elmo");
        for (String name : set) {
            System.out.println(name)
        }
        if (set.contains("Alice")) {
            System.out.println("alice");
        } else {
            System.out.println("alice");
        }
    }

    public static void hashMapTest() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 100);
        map.put("Bob", 57);
        map.put("Chris", 85);
        map.put("Diana", 85);
        map.put("Elmo", 92);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        for (String name : map.keySet()) {
            System.out.println(name);
        }
        for (int value : map.values()) {
            System.out.println(value);
        }
        for (String name : map.keySet()) {
            System.out.println(name + " => " + map.get(name));
        }
        System.out.println();

        System.out.println("Bob" + map.get("Bob"));

        System.out.println("Fred" + map.get("Fred"));
    }

    public static void templateTest() {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello World");
        AbstractDisplay d3 = new StringDisplay("hello");
        d1.display();
        d2.display();
        d3.display();
    }

    public static void factoryMain() {
        Factory factory = new IDCardFactory();
        product card1 = factory.create("名前1");
        product card2 = factory.create("名前2");
        product card3 = factory.create("名前3");
        card1.use();
        card2.use();
        card3.use();
    }

    public static void SingletonMain() {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("if instance");
        } else {
            System.out.println("no instance");
        }
        System.out.println("End.");
    }

    public static void PrototypeMain() {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox();
        MessageBox sbox = new MessageBox();
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello world");
        Product p3 = manager.create("slash box");
        p3.use("Hello world");
    }

    public abstract class Builser {
        public abstract void makeTitle(String title);
        public abstract void makeString(String str);
        public abstract void makeItems(String[] items);
        public abstract void close();
    }

    public class Director {
        private LongStream.Builder builder;
        public Director(LongStream.Builder builder) {
            this.builder = builder;
        }
        public void construct() {
            builder.makeTitle("Greeting");
            builder.makeString("monig is hiru");
            builder.makeItems(new String[]{
              "goodmoning",
              "kon",
            });
            builder.makeString("night");
            builder.makeItems(new String[]{
              "goodivening",
              "goodnight",
              "seeyou",
            });
            builder.close();
        }
    }

    public class TextBuilder extends Builder {
        private StringBuffer buffer = new StringBuffer();
        public void makeTitle(String title) {
            buffer.append("==============================\n");
            buffer.append("" + title + "");
            buffer.append("\n");
        }
        public void makeString(String str) {
            buffer.append(' ' + str + "\n");
            buffer.append("\n");
        }
        public void makeItems(Stringp[] items) {
            for (int i = 0; i < items.length; i++) {
                buffer.append("  '" + items[i] + "\n");
            }
            buffer.append("\n");
        }
        public void close() {
            buffer.append("==============================\n");
        }
        public String getResult() {
            return buffer.toString();
        }
    }

    public class HTMLBuilder extends Builder{
        private String filename;
        private PrintWriter writer;
        public void nakeTitle(String title) {
            filename = title + ".html";
            try {
                writer = new PrintWriter(new FileWriter(filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
            writer.println("<html><head><title>" + title + "</title></head><body>");
            writer.println("<h1>" + title + "</h1>");
        }
        public void makeItems(String str) {
            writer.println("<p>" + str + "</p>");
        }
        public void makeItems(String[] items) {
            writer.println("\n");
            for (int i = 0; i < items.length; i++) {
                writer.println("<li>" + items[i] + "</li>");
            }
            writer.println("</ul>");
        }
        public void close() {
            writer.println("</body></html>");
            writer.close();
        }
        public String getResult() {
            return filename;
        }
    }



}