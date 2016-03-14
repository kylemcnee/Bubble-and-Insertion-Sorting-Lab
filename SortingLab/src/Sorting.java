import java.util.Arrays;
import java.util.Random;

/**
 * Created by charlie on 3/14/16.
 */
public class Sorting {
    public static void main(String[] args) {
        int[] array = getRandomArray(10, -1000, 1000);
        System.out.println("Unsorted:\t" + Arrays.toString(array));

        System.out.println("Bubble:\t\t" + Arrays.toString(bubbleSort(array)));
        System.out.println("Insertion:\t" + Arrays.toString(insertionSort(array)));
    }

    public static int[] bubbleSort(int[] array) {
        int temp, swaps;
        for (int i = 1; i < array.length; i++) {
            swaps = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) { break; }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] getRandomArray(int length, int minValue, int maxValue) {
        int[] array = new int[length];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < length; i++) {
            array[i] = minValue + random.nextInt(maxValue - minValue + 1);
        }
        return array;
    }
}
