package cubbyHole;

public class CubbyHole {
    private int content;
    private boolean available = false;

    public synchronized void put(int value) throws InterruptedException {
        while (available == true){
            wait();
        }
        available = true;
        content = value;
        notifyAll();

    }

    public synchronized int get() throws InterruptedException {
        while (available == false){
            wait();
        }
        available = false;
        notifyAll();
        return content;
    }
}
