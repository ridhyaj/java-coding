package ridhya;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Yess");
        }
        else {
            System.out.println("No");
        }
    }
}
