package OOP;

public class MethodOverloading {
    private static int max(int x,int y){
        return Math.max(x, y);
    }
    private float max(float x,float y){
        return Math.max(x,y);
    }
    private int max(int x,int y,int z){
        return x>y && x>z?x:(Math.max(y, z));
    }

    public static void main(String[] args) {
        MethodOverloading o=new MethodOverloading();
        System.out.println(max(7,6));
        System.out.println(o.max(7.5f,6.5f));

    }
}
