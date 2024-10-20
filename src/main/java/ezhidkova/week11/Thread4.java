package main.java.ezhidkova.week11;

import java.util.Random;

public class Thread4 {
    public static class cars implements Runnable {

        String car;
        int start;
        int finish;

        public cars(String car, int start, int finish) {
            this.car = car;
            this.finish = finish;
            this.start = start;
        }

        public String getCar() {
            return car;
        }

        public int getFinish() {
            return finish;
        }

        public int getStart() {
            return start;
        }

        @Override
        public void run() {
            Random randomSpeed = new Random();
            int speed;

            while (getStart() < getFinish()) {
                try {
                    speed = randomSpeed.nextInt(5);
                    start += speed;
                    if (start > 10) {
                        break;
                    }
                    System.out.println(car + " перемещается со скоростью " + speed + " в точку " + start);
                } finally {
                    if (start == 10) {
                        System.out.println("Победитель: " + car);
                    }
                }

            }
        }
    }

    public static void main(String[] args) throws Exception {
        cars car1 = new cars("Машина 1", 0, 10);
        cars car2 = new cars("Машина 2", 0, 10);
        Thread firstCar = new Thread(car1);
        Thread secondCar = new Thread(car2);

        firstCar.start();
        secondCar.start();

        try {
            firstCar.join();
            secondCar.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
