package OOP;

import java.util.* ;

class Car {
    int noOfGear;
    String color;
    void printCarInfo(){
        System.out.println(noOfGear);
        System.out.println(color);
    }

}

class RaceCar extends Car {  
    int maxSpeed;
    RaceCar(int m){
        super();
        maxSpeed=m;
    }

    public RaceCar(int noOfGear, String color, int maxSpeed) {
        super();
    }


    void printRaceCarInfo(){

        System.out.println(maxSpeed);
    }

}

class InheritanceCar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfGear = sc.nextInt();

        // [IGNORE]: Extra "end line" in previous line.
        sc.nextLine();

        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printRaceCarInfo();
    }
}