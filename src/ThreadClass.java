public class ThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {

        ThreadClass threadClass=new ThreadClass();
        threadClass.run();

    }
}
