package Workshop;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberUtilsTest {

    @Test
    void shouldReturnOnlyEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};

        List<Integer> result = NumberUtils.getEvenNumbers(input);

        assertEquals(List.of(2, 4, 6), result);
    }
}

