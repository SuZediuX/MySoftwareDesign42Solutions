package Threads;

public class TwoThreadsSkel {
    public static void main(String[] args){
        SimpleThread s1 =  new SimpleThread("Delhi");
        SimpleThread s2 = new SimpleThread("Mumbai");
        s1.start();
        s2.start();
    }
}
