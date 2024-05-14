package Method_Reference;

import java.time.LocalDate;

public class Stuff {
    public static void doStuff() {
        System.out.println("I am doing Task:");
        System.out.println("It is my second Task:");
        LocalDate now = LocalDate.now();
        System.out.println(now.toString());
    }

    public static void threadTask() {
        int num = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

    //Non Static Methods
    public void printNumber() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);


            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

}