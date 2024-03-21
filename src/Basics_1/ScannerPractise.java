package Basics_1;

import java.util.Scanner;

public class ScannerPractise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        System.out.println("The sum of the 5 numbers = " + sum);
    }

//    public static void main(String[] args) {
//        System.out.println(getNumbers());
//    }

//    public static String getNumbers() {
//        Scanner scanner = new Scanner(System.in);
//        boolean validNum = false;
//        int inputNumber = 0;
//        int total = 0;
//
//        for(int counter = 1; counter < 6; counter++) {
//            System.out.println("Enter number #" + counter + ": ");
//
//            do {
//                System.out.println("Enter an integer: ");
//                try {
//                    inputNumber =  validateData(scanner.nextLine());
//                    validNum = inputNumber >= 0;
//                } catch (NumberFormatException badUserData) {
//                    System.out.println("Characters not allowed!!! Try again.");
//                }
//            } while (!validNum);
//
//            total += inputNumber;
//        }
//        return "Total " + total;
//    }
//
//    public static int validateData(String numberStr) {
//        int number = Integer.parseInt(numberStr);
//        if(number <= 0) {
//            return -1;
//        }
//      return number;
//    }

}
