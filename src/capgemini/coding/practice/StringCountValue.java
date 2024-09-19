package capgemini.coding.practice;

import java.util.HashSet;

public class StringCountValue {
    public static int validDuolified(String str){
        int sum=0;
        HashSet<Character> seen=new HashSet<>();
        for(char ch:str.toCharArray()){
            if(seen.contains(ch)){
                sum+=1;
            }else{ sum+=2; seen.add(ch);}
        }
        return sum;
    }

    public static void main(String[] args) {
        String str="balloon";
        System.out.println(validDuolified(str));
    }
}
