package Basics_1;

public class CommonExpressions {



    public static void main(String[] args) {


//        ////////  TEXT FORMATTER ////////

//        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html
//        String bulletIt = "Print a Bulleted List:\n" +
//                "\t\u2022 First Point\n" +
//                "\t\t\u2022 Sub Point";
//
//        System.out.println(bulletIt);
//
//        String textBlock = """
//
//                Print a Bulleted List:
//                    \u2022 First Point
//                        \u2022 Sub Point""";
//
//        System.out.println(textBlock);
//
//        int age = 35;
//        System.out.printf("Your age is %d%n", age);
//
//        int yearOfBirth = 2023 - age;
//        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
//        System.out.printf("Your age is %.2f%n", (float) age);
//
//        for (int i = 1; i <= 100000; i *= 10) {
//            System.out.printf("Printing %6d %n", i);
//        }
//
//        String formattedString = String.format("Your age is %d", age);
//        System.out.println(formattedString);
//
//        formattedString = "Your age is %d".formatted(age);
//        System.out.println(formattedString);

//        ////////  TEXT BLOCK ////////
//        String textBlock = """
//                I am groot
//                \u2022 I am grooooooot
//                    \u2022 I am grooooooot
//                I am groot""";
//        System.out.println(textBlock);


//        ////////  WHILE EXAMPLE - WITH CONTINUE ////////

//        int number = 0;
//        while (number < 50) {
//            number+=5;
//            if (number % 25 == 0) {
//                continue;
//            }
//            System.out.print(number + "_");
//        }

//        //////// DO WHILE EXAMPLE ////////

//        int j=1;
//        boolean isReady = false;
//        do{
//            if(j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isReady = (j > 0);
//        } while (isReady);

//        //////// FOR LOOP EXAMPLE ////////

//        for(int counter = 1; counter <=5; counter++) {
//            System.out.println(counter);
//        }

//        //////// SWITCH EXAMPLE ////////

//        int intFive = 3;

//        switch (intFive) {
//            case 5:
//                System.out.println("Five");
//                break;
//            case 4: case 3:
//                System.out.println("Three or Four");
//                break;
//            default:
//                System.out.println("Groot");
//                break;
//        }

//        switch (intFive) {
//            case 5 -> System.out.println("Five");
//            case 4, 3 -> { System.out.println("Three");
//                System.out.println("or Four"); }
//            default -> System.out.println("Groot");
//        }

    }
}
