class MultiplicationTable implements Runnable {
    private int multiplier;
    private int start;
    private int end;

    public MultiplicationTable(int multiplier, int start, int end) {
        this.multiplier = multiplier;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + multiplier + " * " + i + " = " + (multiplier * i));
        }
    }
}

public class MultiThreadedTable {
    public static void main(String[] args) {
        // Create two threads for the multiplication table of 2
        Thread thread1 = new Thread(new MultiplicationTable(2, 1, 5));
        Thread thread2 = new Thread(new MultiplicationTable(6, 6, 10));

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
