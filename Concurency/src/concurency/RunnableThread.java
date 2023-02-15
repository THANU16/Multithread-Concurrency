package concurency;

import static java.lang.Thread.sleep;

public class RunnableThread implements Runnable{
    private Counter counter;

    public RunnableThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
        counter.increment();
//        for(int i = 0; i<100; i++){
//            System.out.println("hello=> "+i);
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }


    }
}
