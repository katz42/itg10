package main.java.ezhidkova.week11;

public class Thread2 {
    public static void main (String[] args) throws InterruptedException{
        Thread firstThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 1) {
                System.out.println("Поток 1: число " + i);
            }
        });

        Thread secondThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 1) {
                System.out.println("Поток 2: число " + i);
            }
        });

        firstThread.start();
        Thread.sleep(1*1000);
        secondThread.start();
    }
}