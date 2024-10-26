package pkg1;
class Multithreading4 extends Thread {
    int threadNumber;
    Multithreading4(int tNo) {
        this.threadNumber=tNo;
        
    }
    public void run() {
        for(int i=1;i<6;i++) {
            System.out.println("Task "+i+ "by ThreadNumber "+threadNumber);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                
            }
        }
    }
}
public class TestMultithreading4 {
    public static void main(String[] args) {
        for(int i=1;i<8;i++) {
            Multithreading4 mt1=new Multithreading4(i);
            mt1.start();
        }
    }
}