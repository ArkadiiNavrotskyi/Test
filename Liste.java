package Test;

import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();


        myList.add("Andreas");
        myList.add("Mah");
        myList.add("Håkon");
        myList.add("Jack");
        myList.add("Kristian");


        System.out.println("Beste venner:");
        for (String item : myList) {
            System.out.println(item);
        }


        System.out.println("BVE: " + myList.size());


        myList.remove("Andreas");


        System.out.println("Bedre liste:");
        for (String item : myList) {
            System.out.println(item);
        }
    }
}
