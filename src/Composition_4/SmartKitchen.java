package Composition_4;

public class SmartKitchen {
    private Fridge smartFridge;
    private DishWasher smartDishWasher;
    private CoffeeMaker smartCoffeeMaker;

    public SmartKitchen() {
        smartCoffeeMaker = new CoffeeMaker();
        smartFridge = new Fridge();
        smartDishWasher = new DishWasher();
    }

    public Fridge getSmartFridge() {
        return smartFridge;
    }

    public DishWasher getSmartDishWasher() {
        return smartDishWasher;
    }

    public CoffeeMaker getSmartCoffeeMaker() {
        return smartCoffeeMaker;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag) {

        smartCoffeeMaker.setHasWorkToDo(coffeeFlag);
        smartFridge.setHasWorkToDo(fridgeFlag);
        smartDishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        smartCoffeeMaker.brewCoffee();
        smartFridge.orderFood();
        smartDishWasher.doDishes();
    }

}

class Fridge {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {

        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }

}

class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {

        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}

