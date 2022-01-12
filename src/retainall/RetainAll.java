package retainall;

import java.util.ArrayList;

public class RetainAll {
    public static void main(String[] args)
    {
        // Creating an empty array list
        ArrayList<String> bags = new ArrayList<String>();

        // Add values in the bags list.
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");

        // Creating another array list
        ArrayList<String> boxes = new ArrayList<String>();

        // Add values in the boxes list.
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");

        // Before Applying method print both lists
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);

        // Apply retainAll() method to boxes passing bags as parameter
        boxes.retainAll(bags);

        // Displaying both the lists after operation
        System.out.println("\nAfter Applying retainAll()"+
                " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);
    }
}
