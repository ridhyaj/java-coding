import java.util.Scanner;

public class Chinki {
    public static boolean isPrime(int num){
        for (int i = 2; i<=num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int counter(int start, int end,int n){
        int count=0;

        for(int i=start;i<=end;i++){
            int number =i;
            int sum=0;
            if(isPrime(number)){
                while(number>0){
                    int digit=number%10;
                    sum+=digit;
                    number=number/10;
                }
                if(sum%n==0){
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int n=s.nextInt();
        System.out.println(counter(a,b,n));
    }
}
