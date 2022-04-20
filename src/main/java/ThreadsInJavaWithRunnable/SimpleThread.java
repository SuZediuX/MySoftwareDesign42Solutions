package ThreadsInJavaWithRunnable;

public class SimpleThread extends Base implements Runnable{
    public SimpleThread(String str){
        super(str);
    }

    public void print() {
        for(int i=0; i<10; i++){
            System.out.println(i+" "+Name);
            try{
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Done!"+Name);
        }
    }

    public void run(){
        for(int i = 0; i < 10; i++) {
            System.out.println(i + "" + Name);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("DONE!"+Name);
        }

    }
}
