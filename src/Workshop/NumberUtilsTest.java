package Workshop;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberUtilsTest {

    @Test
    void shouldReturnOnlyEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> result = NumberUtils.getOddNumbers(input);

        assertEquals(List.of(1, 3, 5, 7, 9), result);
    }
}

