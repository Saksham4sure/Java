public class CircleConstructor {
    public static void main(String[] args) {
        Circle golo = new Circle(2);
    }
}

class Circle {
    Circle(int radius) {
        System.out.println("Area of circle is " + (Math.PI * radius * radius));
    }
}