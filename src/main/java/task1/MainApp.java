package task1;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        long[] arr = arrayUtils.getRandomArray(11);
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayUtils.getMaxValueFromArr(arr));
        System.out.println(arrayUtils.getMinValueFromArr(arr));
        System.out.println(arrayUtils.getMidValueFromArr(arr));
    }
}

