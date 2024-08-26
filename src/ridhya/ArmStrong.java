package ridhya;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        String str=Integer.toString(number);
        int length=str.length();
        int num=number;
        int ans=0;
        while(number!=0){
            int digit=number%10;
            ans+=(int)Math.pow(digit,length);
            number=number/10;
        }
        System.out.println(num == ans);
    }
}
