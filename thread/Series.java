public class Series extends Thread{
    void display(){
        System.out.println("nothing");
    }
   
public static void main(String[] args) {
     task1 t1=new task1();
     task2 t2=new task2();
t1.display();
t2.display();
     
        
    }
    
    
}
 class task1 extends Series {
        void display() {
            System.out.println("1,2,3,4");
        }
    }
 class task2 extends Series {
        void display() {
            System.out.println("5,6,7,8");
        }
        
    }