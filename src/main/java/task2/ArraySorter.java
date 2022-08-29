package task2;

public class ArraySorter {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int previousValue = arr[i];
            int place = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    place = j;
                }
            }
            arr[i] = min;
            if (place != 0) {
                arr[place] = previousValue;
            }
        }
        return arr;
    }
}
