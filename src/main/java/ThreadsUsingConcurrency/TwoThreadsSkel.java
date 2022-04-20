package ThreadsUsingConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TwoThreadsSkel {
    public static void main(String[] args){
        ExecutorService threadExecutor;
        threadExecutor = Executors.newCachedThreadPool();
        SimpleThread s1 =  new SimpleThread("Delhi");
        SimpleThread s2 = new SimpleThread("Mumbai");
        threadExecutor.execute(s1);
        threadExecutor.execute(s2);
    }
}
