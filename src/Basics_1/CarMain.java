package Basics_1;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}


