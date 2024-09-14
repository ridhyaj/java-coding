package arraylist;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(5);
        l.add(7);
        l.add(9);
        l.add(5);
        ArrayList<Integer> l2 = new ArrayList<>(l);
        System.out.println(l2);
        boolean b = l2.removeAll(l);
        System.out.println(b);
    }
}
