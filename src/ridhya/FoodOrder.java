package ridhya;

import java.util.Scanner;

class TotalPrice{
    int food_price=0;
    char food_type;
    int food_quantity;
    int distance;
    void getDetails(char type,int quantity,int distance){
        this.food_type=type;
        this.food_quantity=quantity;
        this.distance=distance;
    }
    public int getFoodPrice() {
        if (food_type == 'V') {
            food_price = 12 * food_quantity;
        } else if (food_type == 'N') {
            food_price = 15 * food_quantity;
        } else {
            food_price=-1;
        }
        return food_price;
    }
    public int totalDistance(){
        getFoodPrice();
        while(distance>6){
            food_price=food_price+2;
            distance--;
        }
        while (distance>3){
            food_price=food_price+1;
            distance--;
        }
        return food_price;
    }
}
public class FoodOrder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        TotalPrice t=new TotalPrice();
        char food_type=s.next().charAt(0);
        int food_quantity= s.nextInt();
        int distance=s.nextInt();
        t.getDetails(food_type,food_quantity,distance);
        System.out.println(t.totalDistance());

    }
}
