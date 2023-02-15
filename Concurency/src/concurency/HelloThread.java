package concurency;

public class HelloThread extends Thread{
    private  Counter counter ;

    public HelloThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.decrement();
//        for(int i = 0; i<100; i++){
//            System.out.println("hello");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//    }
    }
}

