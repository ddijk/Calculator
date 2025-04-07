package nl.dijkrosoft.sonar;

public class PressureConverter {

    double barToHectoPascal(double input) {

        return input*1000;
    }

    double hectoPascalToBar(double input) {

        return input/1000;
    }
}
