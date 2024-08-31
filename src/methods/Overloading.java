package methods;

public class Overloading {
    //this sum method with ...arr takes the argument value in the arr.
    //...arr works as int[] arr;
    //instead of using method overloading with different parameters we can use only one method.
    static int sum(int x, int ...arr){
        for (int ele:arr){
            x+=ele;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2,3,4 is "+sum(2,3,4));
        System.out.println("The sum of 2 is "+sum(2));
    }
}
