package cubbyHole;

import static java.lang.Thread.sleep;

public class Producer implements Runnable{
    private CubbyHole c;
    private int number;
    public Producer(CubbyHole c, int number) {
        this.c = c;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            try {
                c.put(i);
                System.out.println("produce => " + i);
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
