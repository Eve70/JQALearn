public class CarPerson {
    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.name = "Ferrari";
        ferrari.year = 2020;
        ferrari.price = 200000.99;
        ferrari.isSportCar=true;
        ferrari.fuelTankCapacity=30;
        ferrari.freeFuel=30;
        ferrari.engineFuelOperationSystem= "MC";

        Car bentley = new Car();
        bentley.name = "Bentley";
        bentley.year = 2021;
        bentley.price = 190000.0;
        bentley.isSportCar=false;
        bentley.fuelTankCapacity=40;
        bentley.freeFuel=40;
        bentley.engineFuelOperationSystem="iOS";

        bentley.useFuel(35);
        ferrari.changeЕngineFuelOperationSystem("MO");

        System.out.println("The first car is " + ferrari.name + " from year " + ferrari.year + " with price of " + ferrari.price + ",is sport car:" + ferrari.isSportCar + ", fuel tank capacity of:" +ferrari.fuelTankCapacity + ", which is currently " + ferrari.freeFuel + " and OS is " + ferrari.engineFuelOperationSystem);
        System.out.println("The first car is " + bentley.name + " from year " + bentley.year + " with price of " + bentley.price + ",is sport car:" + bentley.isSportCar + ", fuel tank capacity of:" +bentley.fuelTankCapacity + ", which is currently " + bentley.freeFuel + " and OS is " + bentley.engineFuelOperationSystem);

    }
}
