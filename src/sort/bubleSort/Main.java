package sort.bubleSort;
import ArrayExample.Array;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var array = Array.handle();

        for (int i = 0; i < array.length - 1; i++) {
            iterate(array, i);
        }

        // [2, 5, 8, 7, 12]
        System.out.print(Arrays.toString(array));
    }

    private static void iterate(@NotNull int[] array, int i) {
        IntStream.range(0, array.length - 1 - i).forEach(j -> checkIfTHeValueAfterIsSmaller(array, j));
    }

    private static void checkIfTHeValueAfterIsSmaller(@NotNull int[] array, int j) {
        if (array[j] > array[j+1]) {
            changeThePlace(array, j);
        }
    }

    private static void changeThePlace(@NotNull int[] array, int j) {
        int tmp = array[j+1];
        array[j+1] = array[j];
        array[j] = tmp;
    }
}
