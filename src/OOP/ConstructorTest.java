package OOP;

class Cons{

    Cons(int a){
        System.out.println("Parent");
    }   //here the const is taking a parameter so it is needed to be called using super in the inheritor class constructor;
}
class ConstructorTest extends Cons{

    ConstructorTest(){
        super(100);
        System.out.println("Child");
    }

    public static void main(String[] args) {
        ConstructorTest c=new ConstructorTest();
        System.out.println(c);   //address;

    }
}
