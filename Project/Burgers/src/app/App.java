package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        Hamburger simple = new Hamburger("Basic Hamburger", "White Roll", 3.56);
        Hamburger healthy = new Hamburger("Healthy Hamburger", "Brown Rye Roll", 5.67);
        Hamburger deluxe = new Hamburger("Deluxe Hamburger", "White Roll", 14.54);

        System.out.println(simple.name);
        System.out.println(healthy.name);
        System.out.println(deluxe.name);

    }
}
