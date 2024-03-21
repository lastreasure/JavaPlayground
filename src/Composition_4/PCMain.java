package Composition_4;

/*
    As a general rule when designing programs in Java, it's beneficial to
    look at composition first over inheritance
 */
public class PCMain {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

        /*
            This method require the user to know about the monitor, motherboard,
            computercase methods in order to invoke them
        */
//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        /*
         This method the user does not need to know about the personal computer parts
         ot get the PC to do something
         Composition is like creating objects within objects
         */
        thePC.powerUp();
    }
}
