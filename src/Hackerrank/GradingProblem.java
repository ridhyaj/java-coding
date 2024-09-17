package Hackerrank;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<grades.size();i++){
            int grade=grades.get(i);
            int multiple=5;
            if(grade>=38){
                // int multiple=((grade/5)+1)*5;
                while(multiple<grade){
                    multiple+=5;
                }
                if(multiple-grade<3){
                    grade=multiple;
                }
            }
            list.add(grade);
        }
        return list;

    }

}

public class GradingProblem {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        int length=s.nextInt();
     List<Integer> list=new ArrayList<>(length);
     for (int i=0;i<length;i++){
         list.add(s.nextInt());

     }
        System.out.println(Result.gradingStudents(list));


    }
}
