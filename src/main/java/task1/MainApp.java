package task1;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        long[][] doubleArray = arrayUtils.getRandomArray(3,2);
        Arrays
                .stream(doubleArray)
                .forEach(arr -> System.out.printf(Arrays.toString(arr)));
        System.out.println();
        System.out.println("max: " + arrayUtils.getMaxValueFromArr(doubleArray));
        System.out.println("min: " + arrayUtils.getMinValueFromArr(doubleArray));
        System.out.println("mid: " + arrayUtils.getMidValueFromArr(doubleArray));
    }
}

