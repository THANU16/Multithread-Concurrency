package concurency.runnable;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("we can't start ");
        Thread myThread = new Thread(new HelloThread());
        myThread.start();  //start the thread --> HelloThread
        for(int i = 0; i<10; i++) {
            if (i==2){
                myThread.join();
            }
            System.out.println(i);
            sleep(2000);
        }
    }
}
