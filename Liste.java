package Test;

import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();


        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");


        System.out.println("Liste:");
        for (String item : myList) {
            System.out.println(item);
        }


        System.out.println("Size: " + myList.size());


        myList.remove("Banana");


        System.out.println("Liste etter :");
        for (String item : myList) {
            System.out.println(item);
        }
    }
}