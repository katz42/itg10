package main.java.ezhidkova.week11;

public class Thread3 {
    public static class perfectSquare implements Runnable {
        private final int number;

        public perfectSquare(Integer number) {
            this.number = number;
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": квадрат " + number + " = " + number*number);
        }
    }

    public static void main(String[] args) throws Exception{
        int i = 1;
        int n = 10;
        while (i <= n) {
            Thread thread = new Thread(new perfectSquare(i));
            thread.start();
            i++;
        }
    }
}
