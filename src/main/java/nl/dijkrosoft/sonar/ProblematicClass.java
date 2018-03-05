package nl.dijkrosoft.sonar;


/**
 * Created by dickdijk on 19/06/2017.
 */
public class ProblematicClass {


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

            // apparantly not an integer
            ex.printStackTrace();
        }
        return age == 18;
    }
}
