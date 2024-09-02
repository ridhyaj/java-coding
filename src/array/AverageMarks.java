package array;

import java.util.Scanner;

//Ques. Calculate the average marks from an array containing marks of all students in physics using each loop.
public class AverageMarks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] marks=new int[n];
        for (int i=0;i<marks.length;i++){
            marks[i]=s.nextInt();
        }
        System.out.println("The marks of "+marks.length+" students in physics are:");
        for (int x:marks){
            System.out.print(x+" ");
        }
        float avg=0;
        for (int x:marks){
            avg+=x;
        }
        avg/=marks.length;
        System.out.println("therefore the avg marks is :"+ avg);
    }
}
