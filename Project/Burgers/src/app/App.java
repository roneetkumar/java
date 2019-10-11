package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        Hamburger basic = new Hamburger("Basic Hamburger", "White Roll", 3.56);
        Hamburger healthy = new Hamburger("Healthy Hamburger", "Brown Rye Roll", 5.67);
        Hamburger deluxe = new Hamburger("Deluxe Hamburger", "White Roll", 14.54);

        System.out.println(basic.cheese);

    }
}
