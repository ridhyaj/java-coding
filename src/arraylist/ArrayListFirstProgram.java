package arraylist;

import java.util.ArrayList;

public class ArrayListFirstProgram {
    public static void main(String[] args) {
        ArrayList <Integer> l=new ArrayList<>();
        l.add(5);
        l.add(7);
        l.add(9);
        l.add(5);
        for (int ele : l) {
            System.out.println(ele);
        }

    }
}
