package Polymorphism_6;

public class CarMain {

    public static void main(String[] args) {
//        Car iambrumbrum = new Car("brum brum");
//        runRace(iambrumbrum);
//
//        Car iamgasbrumbrum = new GasPoweredCar("gasbrum", 22.4, 6);
//        runRace(iamgasbrumbrum);

        Car car = new Car("Blue Ferrari");
        runRace(car);

        Car ferrari = new GasPoweredCar("Blue Ferrari",
                15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("Red Tesla",
                568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("Black Ferrari",
                16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }

}
