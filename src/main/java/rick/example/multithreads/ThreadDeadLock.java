/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.multithreads;

/**
 * To crete a basic deadlock I exchange the lock order in the 2 threads
 */
public class ThreadDeadLock {

    public static void main(String[] args) {
        System.out.println("Main thread started");

        String lock1 = "Riccardo";
        String lock2 = "Bruno";

        Thread t1 = new Thread(() ->
        {
            synchronized (lock1) {
                System.out.println("inside t1 after lock1");
                try {
                    Thread.sleep(0,00001);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("inside t1 after lock2");
                }
            }
        }, "name-t1");


        Thread t2 = new Thread(() ->
        {
            synchronized (lock2) {
                System.out.println("inside t2 after lock2");
                try {
                    Thread.sleep(0,00001);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("inside t2 after lock1");
                }
            }
        }, "name-t1");


        t1.start();
        t2.start();


    }


}
