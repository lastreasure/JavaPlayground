package Arrays_8;

import java.util.Arrays;

public class ArraysRefvsValueTypes {

    public static void main(String[] args) {

        // both arrays nmake a ref to the obj in memory hence updating one updates the other
        // as they're referencing the same obj
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        // here we are not necessarily passing the object itself but the reference/address to that obj
        modifyArray (myIntArray);

        System.out.println("after change myIntArray = "
                + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " +
                Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {

        array[1] = 2;
    }

}
