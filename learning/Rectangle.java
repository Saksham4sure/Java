public class Rectangle extends Thread{

    public void run(){
        System.out.println("Running");
    }
    

    public static void main(String[] args) {
        Thread t1 = new Thread(new Rectangle());

        t1.start();
    }
}