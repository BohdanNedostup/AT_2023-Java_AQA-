package itstep.task_4;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void code() {
        System.out.println(this.name + " is coding");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }
}
