package nl.dijkrosoft.sonar;

public class TemperatureConverter {

    public static double convertFromFahrenheitToCelcius(double valueFahrenheit) {
        return (valueFahrenheit - 32) * 5 / 9;
    }

    public static double convertFromCelsiusToFahrenheit(double valueCelcius) {
        double valueFahrenheit = valueCelcius * 9 / 5 + 32;
        return valueFahrenheit;
    }

    public static double convertFromCelciusToKelvin(double valueCelcius) {

        double temp = valueCelcius + 273;
        return temp;
    }
}