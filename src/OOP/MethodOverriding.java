package OOP;
class A{
    public int a;
    public int method1(){
        return 10;
    }
    public void method2(){
        System.out.println("I am method2 of class A.");
    }

}
class B extends A{
    public void method2(){
        System.out.println("I am method2 of class B.");
    }
    public void method3(){
        System.out.println("I am method3 of class B.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a =new A();
        System.out.println(a.method1());;
        a.method2();

        B b=new B();
        b.method2();
    }
}
