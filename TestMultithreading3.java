package pkg1;
class Multithreading3 extends Thread{
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                
            }
        }
    }
}
public class TestMultithreading3 {
    public static void main(String[] args) {
        Multithreading3 mt1=new Multithreading3();
        mt1.start();
        
        
    }
    
}