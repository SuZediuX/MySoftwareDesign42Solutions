package Threads;

public class SimpleThread extends Thread {
    private String Name;
    public SimpleThread(String str){
        Name = str;
    }
    public void print(){
        for(int i=0; i<10; i++){
            try {
                Thread.sleep((int) (Math.random() * 1000));
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println("DONE!"+Name);
        }
    }
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Currently "+i+" for "+Name);
            try{
                Thread.sleep((int)(Math.random()*1000));
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println("Up! "+Name);
        }
    }
}
