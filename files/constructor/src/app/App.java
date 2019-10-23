package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Student student1 = new Student(1);
        Student student2 = new Student(1, "A Guy");
        Student student3 = new Student("A Guy", 1);
        Student student4 = new Student(1, "A Guy", 22);
        Student student5 = new Student(1, "A Guy", 22, "Programmer Analyst");

        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student5.display();

    }
}
