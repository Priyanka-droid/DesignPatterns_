import java.util.Scanner;

public class NonFactoryDesignPattern{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        String inputLogisticMode= sc.nextLine();
        switch(inputLogisticMode){
            case "ship":{
                ShipTemp ship=new ShipTemp();
                ship.deliver();
                int deliveryCost= ship.shipDeliveryCost();
                System.out.println(deliveryCost);
            }
            break;
            case "truck":{
                TruckTemp truck= new TruckTemp();
                truck.deliver();
                int deliveryCost= truck.truckDeliveryCost();
                System.out.println(deliveryCost);
            }
            break;
           default:{
                System.out.println("What the hell do you want to deliver with!!!"); 
            }
        }



        //adding another logistics requires making changes in this class. too lazy for that. Better way to do this=> check for factory pattern class

    }
}


class ShipTemp{
    void deliver(){
        System.out.println("deliver with ship");
    }
    int shipDeliveryCost(){
        return 10;
    }
}

class TruckTemp{
    void deliver(){
        System.out.println("deliver with truck");
    }

    int truckDeliveryCost(){
        return 20;
    }
}