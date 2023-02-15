package concurency;

public class Counter {
    private Integer c=0;
    private Integer c1=0;
//    public  synchronized void increment(){
//        c++;
//        System.out.println("increment => "+c);
//    }
//    public synchronized void decrement(){
//        c--;
//        System.out.println("decrement => "+c);
//    }
//}

    public   void increment(){
        synchronized (c) {
            c++;
            System.out.println("increment => " + c);
        }
    }
    public  void decrement(){
        synchronized(c) {
            c--;
            System.out.println("decrement => " + c);
        }
    }
}
