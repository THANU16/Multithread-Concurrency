package cubbyHole;

public class Consumer implements Runnable {
    private CubbyHole c;
    private int number;

    public Consumer(CubbyHole c, int number) {
        this.c = c;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            try {
                System.out.println("consume => " + c.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }

}
