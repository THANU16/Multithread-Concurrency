package concurency;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread myThread = new HelloThread(counter);
        Thread runnableThread = new Thread(new RunnableThread(counter));
         myThread.run();  //run the thread --> HelloThread
        runnableThread.start();
//        for(int i = 0; i<100; i++) {
//            if (i==2){
//                runnableThread.join();
//            }
//            System.out.println(i);
//            sleep(2000);
//        }
    }
}
