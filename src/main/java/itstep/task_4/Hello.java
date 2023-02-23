package itstep.task_4;

public class Hello extends Thread {

    private int counter;

    public Hello(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (this.counter > 0) {
            try {
                System.out.println("Hello, world!");
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.counter--;
        }
    }
}
