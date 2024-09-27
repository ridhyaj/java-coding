package array;
//Ques. Create an array of 5 floats and calculate their sum.
import java.util.Scanner;

public class FloatSum {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        float[] array=new float[5];
//        for (int i=0;i<5;i++){
//            array[i]=s.nextFloat();
//        }
        float[] array={34.5f, 67.8f,76f,87.4f};
        float sum=0;
        for (float x:array){
            sum+=x;
        }
        System.out.println(sum);
    }
}
