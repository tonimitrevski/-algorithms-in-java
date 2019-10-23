package ArrayExample;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Array {
    @NotNull
    @Contract(value = " -> new", pure = true)
    public static int[] handle() {
         return new int[]{12, 5, 7, 8, 2};
    }
}

