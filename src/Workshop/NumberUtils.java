package Workshop;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static List<Integer> getOddNumbers(int[] numbers) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 1) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}
