package app;

import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        Vector<Vector<String>> v = new Vector<Vector<String>>();

        System.out.println(v.size());
        System.out.println(v.size());
        System.out.println(v.size());
        System.out.println(v.size());

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

    }
}
