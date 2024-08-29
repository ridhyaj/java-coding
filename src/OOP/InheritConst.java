package OOP;


class Parent1{
    public Parent1(){  //this constructor need not to be called using super until it does not have any parameter in it;
        System.out.println("Parent Constructor");
    }
}
class Child1 extends Parent1{
    public Child1(){
        System.out.println("Child Constructor");
    }
}
public class InheritConst {
    public static void main(String[] args) {
        Child1 c=new Child1();
    }
}

