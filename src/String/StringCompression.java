package String;


import java.util.LinkedList;

public class StringCompression {
public static String compress(String str){
    String newStr="";

    for(int i=0;i<str.length();i++){
        int count=1;
        //Integer count=1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }
        newStr+=str.charAt(i);
        if(count>1){
            newStr+=Integer.toString(count);
//            newStr+=count.toString();
        }
    }
    return newStr;
}

    //using StringBuilder
    public static String compression(String str){
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<str.length();i++){
        int count=1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }
        sb.append(str.charAt(i));
        if(count>1){
            sb.append(Integer.toString(count));
        }
    }
    return sb.toString();
    }
    public static void main(String[] args) {
        String str="aaabbbbbcc";
        System.out.println(compress(str));
        System.out.println(compression(str));
    }

}