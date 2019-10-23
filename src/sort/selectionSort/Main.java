package sort.selectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var array = new int[]{12, 5, 7, 8, 2};

        for (int i = 0; i < array.length - 1; i++) {
            var minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }

                var tmp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = tmp;
            }
        }

        // [2, 5, 8, 7, 12]
        System.out.print(Arrays.toString(array));
    }
}
