package task2;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ArraySorter arraySorter = new ArraySorter();
        int[] arr = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        System.out.println(Arrays.toString(arraySorter.sort(arr)));
    }
}
