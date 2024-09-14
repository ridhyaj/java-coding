package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImplementation {
    public static void main(String[] args) {
//        List al=new ArrayList<>();
//        ArrayList<Integer> al=new ArrayList<>(); //homogenous
//        ArrayList<String> al=new ArrayList<>();  //homogenous
        ArrayList al=new ArrayList<>();  //heterogeneous

        //to add element
        al.add("John");
        al.add('C');
        al.add(22);
        al.add(true);

        //to add at specific position give index:
        al.add(1,"Doe");
        System.out.println(al);
        System.out.println(al.size());

        //to remove element from arraylist:
        al.remove(1); //either give index or the element.


        //to check that particular element exist in arraylist or not:
        System.out.println(al.contains("Doe"));  // returns true or false.


        //to retrieve specific element
        System.out.println(al.get(2));

        //change/replace element
        al.set(1,"Doe");

        //isEmpty method to check whether array list is empty.
        System.out.println(al.isEmpty());// returns true or false.

    }


}
