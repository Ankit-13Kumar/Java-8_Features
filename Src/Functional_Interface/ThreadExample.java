package Functional_Interface;

public class ThreadExample {
    public static void main(String[] args) {

        // First Thread: Thread - JOHN
        Runnable thread1 = () -> {
            // This is body for thread
            // Stuff

            for (int i = 0; i <= 10; i++) {
                try {
                    System.out.println("Value of I is :" + i);
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        // Creating a thread using the first runnable
        Thread t = new Thread(thread1);
        t.setName("John"); //Not required to setname ThreadName
        t.start();
    }
}
