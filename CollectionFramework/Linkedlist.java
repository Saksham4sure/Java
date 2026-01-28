package CollectionFramework;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Saksham");
        names.add("Sudip");
        names.add("Ujjwal");

        System.out.println(names);

        names.remove("Sudip");

        System.out.println(names);
    }
}
