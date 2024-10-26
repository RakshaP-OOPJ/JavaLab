package pkg1;
class Multithreading2 implements Runnable{
    public void run() {
        try {
            System.out.println("Thread"+Thread.currentThread().getId()+"is running");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        
        
        }
    }
}
public class TestMultithreading2 {
    public static void main(String[] args){
        for(int i=0;i<8;i++) {
            Multithreading2 mt1=new Multithreading2();
            Thread t1 = new Thread(mt1);
            t1.start();
            
        }
    }
    
}