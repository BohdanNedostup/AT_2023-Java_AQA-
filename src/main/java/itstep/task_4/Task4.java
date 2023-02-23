package itstep.task_4;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    //    V13.
//    a)	Create a thread that outputs "Hello, world!" every second using Thread and sleep.
//    b)	Create your own custom class, and make an object for it. Use getDeclaredMethods() to print out all the methods of the class and their return types. Choose a specific method by name and call it using invoke(). Print out your results of invoking.
//    c)	Create a generic class that can store a list of elements of any type, and add elements to it using List<T> and add().
    public static void main(String[] args) {

        threadHello();
        reflection();
        genericClass();
    }

    private static void reflection() {
        Student student = new Student("Wasya");
        System.out.println(Arrays.toString(Student.class.getDeclaredMethods()));
        try {
            Student.class.getMethod("code").invoke(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void threadHello() {
        Hello hello = new Hello(5);
        hello.start();
        try {
            hello.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void genericClass() {
        Box<String> box = new Box<>();
        box.add(List.of(new String[]{"book", "pen", "toy"}));
        System.out.println(box.getItems());
    }
}
