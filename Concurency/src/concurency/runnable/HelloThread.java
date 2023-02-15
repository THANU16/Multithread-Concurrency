package concurency.runnable;

import static java.lang.Thread.sleep;

public class HelloThread implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println("hello=> "+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
