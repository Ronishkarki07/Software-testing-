package Tutorial;

public class TempConverter {
    public double convertToFahrenheit(double celsius){
        return (celsius * ((double) 9 / 5)) + 32;
    }

    public double convertToCelsius(double fahrenheit){
        return (fahrenheit -32) * 5 / 9;
    }
}
