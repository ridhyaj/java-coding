package ridhya;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        System.out.println("Length of the first string is "+str1.length());
        System.out.println("Length of the second string is "+str2.length());
        StringBuilder reverse1=new StringBuilder(str1);
        StringBuilder reverse2=new StringBuilder(str2);
        System.out.println("The reverse of the first string is "+reverse1.reverse());
        System.out.println("The reverse of the second string is "+reverse2.reverse());
        System.out.println("The concatenated string is "+str1.concat(str2));
        int size=Math.min(str1.length(),str2.length());
        for (int i =0;i<size;i++){
            char char1=str1.charAt(i);
            char char2=str2.charAt(i);
            if(char1<char2){
                System.out.println(str1+" comes before "+ str2);
                break;
            } else if (char2<char1) {
                System.out.println(str2+" comes before "+ str1);
                break;
            }
            else if(char1==char2) {
                continue;
            }
            else {
                System.out.println("same");
            }
        }



    }
}
