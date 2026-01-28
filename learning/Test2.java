
public class Test2 {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException err) {
            System.out.println("Something spicy here");
        }
    }
}
