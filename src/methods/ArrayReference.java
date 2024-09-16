package methods;

public class ArrayReference {
    static void changeValue(int[] a){
        a[0]=10;
    }

    private static void changeValue1(int b) {
        b=100;
    }
    public static void main(String[] args) {
        int x=20;
        changeValue1(x);
        System.out.println(x);
//the value of x is passed to the methods in which copy of x is given to b and the value of b is then changed to 100
        //but this will not change the initial value of x;

        int[] arr={3,4, 1,54 , 3,29, 7};
        changeValue(arr);
        System.out.println(arr[0]);
        //but in array the arr is a reference to the elements which points to the address
        //the reference is passed so in that specific address the value will get changed.
        //so the value of arr[0] will be changed to 10;
    }

}
