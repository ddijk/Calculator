package nl.dijkrosoft.sonar;

public class TempuratureConverter {

    public static double convertToCelcius(double valueFahrenheit) {
        return (valueFahrenheit - 32) * 5 / 9;
    }

    public static double convertToFahrenheit(double valueCelcius) {
        return valueCelcius * 9 / 5 + 32;
    }
}
