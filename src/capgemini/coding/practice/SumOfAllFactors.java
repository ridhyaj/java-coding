package capgemini.coding.practice;

import java.util.Scanner;

public class SumOfAllFactors {
    public static int sumFactors(int num){
        int sum=0;
        if (num==1) return 1;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                int othern=num/i;
                sum=sum+i+othern;

            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();

        System.out.println(sumFactors(num));
    }
}
