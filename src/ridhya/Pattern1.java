package ridhya;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int space=(l/2)+1;
        if(l%2==0){
            System.out.println("Invalid number");
        }
        else{
            for (int r=1;r<space;r++){
                for (int c=1;c<=r;c++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
