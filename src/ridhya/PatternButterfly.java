package ridhya;

import java.util.Scanner;

public class PatternButterfly {


    //my approach
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("row:");
        int row=s.nextInt();
//        System.out.print("col:");
//        int col=s.nextInt();

for (int r=1;r<=row;r++){
    for (int c=1;c<=r;c++){
        System.out.print("*");
    }
    for (int c=1;c<=row-r;c++){
        System.out.print(" ");
    }
    for (int c=1;c<=row-r;c++){
        System.out.print(" ");
    }
    for (int c=1;c<=r;c++){
        System.out.print("*");
    }
    System.out.println();
}
for (int r=row-1;r>=1;r--) {
    for (int c = 1; c <= r; c++) {
        System.out.print("*");
    }
    for (int c = 1; c <= row - r; c++) {
        System.out.print(" ");
    }
    for (int c = 1; c <= row - r; c++) {
        System.out.print(" ");
    }
    for (int c = 1; c <= r; c++) {
        System.out.print("*");
    }
    System.out.println();
}
    }

//different approach
//    public static void main(String[] args) {
//        Scanner m=new Scanner(System.in);
//        int row=m.nextInt();
//        for (int r=1;r<=row;r++){
//            for(int c=1;c<=r;c++){
//                System.out.print("*");
//            }
//            for (int s=1;s<=2*(row-r);s++){
//                System.out.print(" ");
//            }
//            for (int c=1;c<=r;c++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int r=row;r>=1;r--){
//            for(int c=1;c<=r;c++){
//                System.out.print("*");
//            }
//            for (int s=1;s<=2*(row-r);s++){
//                System.out.print(" ");
//            }
//            for (int c=1;c<=r;c++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}
