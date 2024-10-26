package pkg1;
class Multithreading1 extends Thread{
    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+"is running");
        
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
            
        }
    }
    
}
public class TestMultithreading1 {
    public static void main(String[] args) {
        for(int i=0;i<8;i++) {
            Multithreading1 mt1=new Multithreading1();
            mt1.start();
            
        }
    }    
}