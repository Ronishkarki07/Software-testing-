package Workshop;

import Tutorial.TempConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TempConverterTest {

    @Test
    public void testCelsiusToFahrenheit(){
        TempConverter converter = new Tutorial.TempConverter();
        assertEquals(68.0, converter.convertToFahrenheit(20), 0.01);
        assertEquals(212.0, converter.convertToFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius(){
        TempConverter converter = new TempConverter();
        assertEquals(20.0, converter.convertToCelsius(68), 0.01);
        assertEquals(100.0, converter.convertToCelsius(212), 0.01);
    }
}