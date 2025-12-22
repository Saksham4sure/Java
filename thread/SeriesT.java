public class SeriesT implements Runnable{
   public void run(){
        System.out.println("nothing");
    }
   
public static void main(String[] args) {
           Thread t1 = new Thread(new task1());
        Thread t2 = new Thread(new task2());

t1.start();
t2.start();;
     
        
    }
    
    
}
 class task1 extends SeriesT {
       public void run() {
            System.out.println("1,2,3,4");
        }
    }
 class task2 extends SeriesT {
       public void run() {
            System.out.println("5,6,7,8");
        }
        
    }