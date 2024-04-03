package Arrays_8;

public class VarArgs {
    public static void main(String... args) {

        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    // var args means that we can be more flexible with calling the method
    // though there are restrictions:
    // - there can only be one var arg in a method
    // - the var arg much be the last argument
    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}
