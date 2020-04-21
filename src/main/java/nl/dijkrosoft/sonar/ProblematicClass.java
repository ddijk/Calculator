package nl.dijkrosoft.sonar;


import java.util.logging.Logger;

public class ProblematicClass {


    private static final Logger LOGGER = Logger.getLogger("mylogger");

    public boolean testIfContainsX(String input) {
        return input.indexOf("X") > 0;
    }

    @Override
    public boolean equals(Object obj) {
        String val = (String) obj;

        int age = 0;
        try {
            age = Integer.parseInt(val);
        } catch (Exception ex) {

            // apparently not an integer
            LOGGER.warning("Oops." + ex);
        }
        return age == 18;
    }
}
