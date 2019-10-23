package searchSortedList;

import java.util.Arrays;
import java.util.List;

// O(log2n)
public class Main {
    public static void main(String[] args) {
        boolean found = false;
        var comparisonNumber = 32;
        List<Integer> numbers = Arrays.asList(3, 7, 20, 32, 45, 55, 60, 75);

        int low = 0;
        int high = numbers.size() - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (comparisonNumber < numbers.get(middle)) {
                high = middle - 1;
            } else if (comparisonNumber > numbers.get(middle)) {
                low = middle + 1;
            } else {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.print("number " + comparisonNumber + " exist");
        } else {
            System.out.print("number "+ comparisonNumber +" is not exist");
        }
    }
}
