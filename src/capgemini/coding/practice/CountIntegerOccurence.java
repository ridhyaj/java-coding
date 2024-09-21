package capgemini.coding.practice;

import java.util.HashMap;

public class CountIntegerOccurence {
    public static void countOccurence(int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
       for(int i:arr){
           map.put(i,map.getOrDefault(i,0)+1);
       }
       for(Integer key:map.keySet()){
           System.out.println(key+" occur "+map.get(key)+" times.");
       }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,4,5,1,2};
        countOccurence(arr);

    }
}
