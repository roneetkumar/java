package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        // Ladder ladder = new Ladder();

        // ladder.display().down().display().up().up().up().up().display();

        Calculator<Integer, Integer> multiplier = getCalculatorFunc();

        System.out.println("Result : " + multiplier.calculate(6, 9));
    }

    static Calculator getCalculatorFunc() {
        Calculator<Integer, Integer> multiplier = (a, b) -> a * b;
        return multiplier;
    }
}
