package HashSetCF;

import java.util.HashSet;
//HashSet has initial capacity of 16 and load factor 0.75 i.e when HashSet is 75 percent full it will create a new HasSet in memory of more capacity.
public class FirstHashSet {
    public static void main(String[] args) {
//        HashSet<Integer> hs=new HashSet<>();
        HashSet<String> hs=new HashSet<>(100,(float)0.75);
//        HashSet hs=new HashSet<>();
        hs.add(Integer.toString(2));
//        hs.add(4);
//        hs.add(7);
        hs.add("John");
        for(int i = 5; i>0; i--){
            hs.add(Integer.toString(i));
        }
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.contains("john"));  //will return false bcz case sensitive.
        hs.clear();   //to delete all elements.
        System.out.println(hs);
    }
}
