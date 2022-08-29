package task1;

import java.util.concurrent.TimeUnit;

public class ArrayUtils {
    private final static long startArr = -1000L;
    private final static long endArr = 1000L;

    public long[][] getRandomArray(int length1, int length2) {
        long[][] arr = new long[length1][length2];
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                arr[i][j] = generateRandomNumber();
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        return arr;
    }

    public long getMaxValueFromArr(long[][] doubleArray) {
        long max = startArr;
        for (long[] array : doubleArray) {
            for (long i : array) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }

    public long getMinValueFromArr(long[][] doubleArray) {
        long min = endArr;
        for (long[] array : doubleArray) {
            for (long i : array) {
                if (i < min) {
                    min = i;
                }
            }
        }
        return min;
    }

    public double getMidValueFromArr(long[][] doubleArray) {
        long sum = 0;
        for (long[] array : doubleArray) {
            for (long i : array) {
                sum += i;
            }
        }
        return (double) sum / doubleArray.length;

    }

    private long generateRandomNumber() {
        return startArr + System.currentTimeMillis() % (endArr - startArr);
    }
}
