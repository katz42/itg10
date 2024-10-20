package main.java.ezhidkova.week11;

public class Thread1 {
    public static void main (String[] args) throws InterruptedException{
        Thread unevenThread = new Thread(() -> {
            for (int i = 1; i < 10; i += 2) {
                System.out.println("Uneven thread: " + i);
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even thread: " + i);
            }
        });

        unevenThread.start();
        evenThread.start();
    }
}
