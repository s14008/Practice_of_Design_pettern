package jp.ac.it_college.std.s14008.pdp;

import jp.ac.it_college.std.s14008.adapter.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        arrayListTest2();
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

        for (int i = 0; i< list.size(); i++) {
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
        map.put("Alice",100);
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
}
