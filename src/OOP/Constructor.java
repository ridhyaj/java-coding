package OOP;
class Student{
    private final int roll_no;
    private final String name;
    public Student(){
        roll_no=0;
        name="your-name-here";
    }
    public Student(int r,String n){
        roll_no=r;
        name=n;
    }
    public int getRoll_no(){
        return roll_no;
    }
    public String getName(){
        return name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student one=new Student(23,"Ritika");
        Student two=new Student();
        System.out.println("The name of Student is "+one.getName()+" and roll number is "+one.getRoll_no()+".");
        System.out.println("The name of Student is "+two.getName()+" and roll number is "+two.getRoll_no()+".");

    }
}
