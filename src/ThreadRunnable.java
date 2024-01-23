import java.util.TreeMap;

public class ThreadRunnable implements Runnable {

    public void run()
    {
        System.out.println("thread is run!!!");
    }

    public static void main(String[] args) {
        ThreadRunnable thread=new ThreadRunnable();
        Thread threadInitialized=new Thread(thread);

        threadInitialized.start();

    }
}
