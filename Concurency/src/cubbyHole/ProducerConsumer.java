package cubbyHole;

public class ProducerConsumer {
    public static void main(String[] args) {
        CubbyHole c = new CubbyHole();
        Thread producer1 = new Thread(new Producer(c,1));
        Thread consumer1 = new Thread(new Consumer(c,1));
        producer1.start();
        consumer1.start();
    }

}
