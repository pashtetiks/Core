package task1;

import java.util.concurrent.TimeUnit;

public class ArrayUtils {
    private final static long startArr = -1000L;
    private final static long endArr = 1000L;

    public long[] getRandomArray(int length) {
        long[] arr = new long[length];
        int j = 0;
        for (int i = 0; i < length; i++) {
            arr[i] = generateRandomNumber();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return arr;
    }

    public long getMaxValueFromArr(long[] arr) {
        long max = startArr;
        for (long i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public long getMinValueFromArr(long[] arr){
        long min = endArr;
        for (long i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public double getMidValueFromArr(long[] arr){
        long sum = 0;
        for (long i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;

    }

        private long generateRandomNumber () {
            return startArr + System.currentTimeMillis() % (endArr - startArr);
        }
    }
