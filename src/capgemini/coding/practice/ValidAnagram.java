package capgemini.coding.practice;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean validAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();

        for(Character ch:str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Character ch:str2.toCharArray()){
            if(!map.containsKey(ch)) return false;
         map.put(ch,map.get(ch)-1);
            if(map.get(ch)<0) return false;
        }

//        if(map.isEmpty()) return true;
        return true;
    }

    public static void main(String[] args) {
        String str1="knee";
        String str2="kjen";
        System.out.println(validAnagram(str1,str2));
    }
}
