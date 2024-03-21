package Udemy1Basics;
import java.util.Scanner;

public class ScannerMain {

public static void main(String[] args) {

        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

//        String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}



// //// Trial and error

//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Udemy1Basics.Main {
//    public static void main(String[] args) {
//
//        int currentYear = 2024;
//
//        try {
//            System.out.println(getInputFromConsole(currentYear));
//        } catch (NullPointerException e) {
//            System.out.println(getInputFromScanner(currentYear));
//        }
//
////        getInputFromConsole();
//    }
//
//
//    public static String getInputFromConsole(int currentYear) {
//        //execute by running java src/Udemy1Basics.Main.java
//        String name = System.console().readLine("Hola, What is your name? ");
//        System.out.println("Hola " + name + ", that's a cool name");
//        return "";
//    }
//
//    public static boolean isValidYear(int year) {
//        return (year >=1897 && year <= 2024);
//    }
//    public static String getInputFromScanner(int currentYear) {
//        Scanner scanner = new Scanner(System.in);
//        int age = 0;
//        System.out.println("Hola, whats your name? ");
//        String name = scanner.nextLine();
//        System.out.println("Hola " + name + ", that's a cool name");
//        System.out.println("What year were you born?");
//        do {
//
//            System.out.println("Not valid year please enter a year between 1897 and 2024");
//            System.out.println("What year were you born?");
//            try {
//                 dob = scanner.nextLine();
////                dob = scanner.nextLine();
//            } catch (NumberFormatException badUserData) {
//                System.out.println("Characters not allowed. Try again please.");
//            }
//            age = currentYear - Integer.parseInt(dob);
//
//        } while (!isValidYear(Integer.parseInt(dob)));
//
//        return "So you are " + age + " years old";
//    }
//