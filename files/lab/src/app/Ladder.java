package app;

public class Ladder {

    private int steps = 0;

    public Ladder up() {
        this.steps++;
        return this;
    }

    public Ladder down() {
        this.steps--;
        return this;
    }

    public Ladder display() {
        System.out.println("Steps : " + this.steps);
        return this;

    }

}
