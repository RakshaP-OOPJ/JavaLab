
class MultiThreadingOne extends Thread{
    public void run(){
            System.out.println("Thread is running");
        }
    }
public class TestThread {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            MultiThreadingOne mt1=new MultiThreadingOne();
             mt1.run();
            
        }
        
    }
    
}
