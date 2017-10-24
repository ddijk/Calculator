package nl.dijkrosoft.sonar;

/**
 * Created by dickdijk on 22/06/2017.
 */
public class PressureConverter {

    double barToHectoPascal(double input) {

        return input*1000;
    }

    double hectoPascalToBar(double input) {

        return input/1000;
    }
}
