package ThreadsInJavaWithRunnable;

public class TwoThreads {
    public static void main(String[] args){
        /*ExecutorService threadExecutor;
        threadExecutor = Executors.newCachedThreadPool();
        SimpleThread s1 = new SimpleThread("Jamaica");
        SimpleThread s2 = new SimpleThread("Fiji");
        threadExecutor.execute(s1);
        threadExecutor.execute(s2);*/

        SimpleThread s1 = new SimpleThread("Jamaica");
        SimpleThread s2 = new SimpleThread("Fiji");

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
    }
}
