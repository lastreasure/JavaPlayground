package Udemy1Basics;

public class Car  {
    private String make = "VW";
    private String model = "Groot";
    private String colour = "Black";
    private int doors = 4;
    private boolean convertible;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        if (make == null) {
            make = "Unknown";
        }
        String lowercaseMake = make.toLowerCase();
//        supporting only 3 car manufacturers
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
//        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " + colour + " "
        + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }

}
