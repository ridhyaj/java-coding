package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] arr = {"John", "Doe", "Camila", "Cabello"};
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
        System.out.println(al);



    }
}
