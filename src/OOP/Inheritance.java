package OOP;
class Base{
    int x;
    int y;
    Base(){
        x=1;
        y=1;
        System.out.println("hii");
    }
    Base(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
class Derived extends Base{
    int a;
    Derived(){
        super();
        a=2;
    }
    Derived(int a){
        super(7,4);
        this.a=a;
    }

    public int getA() {
        return a;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived d=new Derived();
        Derived e=new Derived(70);
        System.out.println(d.getY());
        System.out.println(e.getY());
        System.out.println(d.getX());
        System.out.println(d.getA());
    }
}
