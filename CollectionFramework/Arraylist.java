package CollectionFramework;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            studentName.add("Saksham " + (i+1));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(studentName.get(i));
        }

        System.out.println("Removing");
        studentName.remove(0);

        System.out.println(studentName);
    }
}
