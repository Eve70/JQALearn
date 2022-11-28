import java.util.Scanner;

class Car {
    String name;
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;



    void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem){
        engineFuelOperationSystem = newЕngineFuelOperationSystem;
        System.out.println("The new engine fuel OS is " + engineFuelOperationSystem);
    }

    void useFuel(double fuel){
        if (freeFuel > fuel){
                double temp = freeFuel - fuel;
                freeFuel = temp;
                System.out.println("Fuel left is " + freeFuel);
    } else{
        System.out.println("Not enough free fuel!");}
    }

}

