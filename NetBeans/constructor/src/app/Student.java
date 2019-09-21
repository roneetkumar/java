package app;

public class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student() {

    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("\n\n");
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.course);
    }

}
