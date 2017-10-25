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
        return super.equals(obj);
    }
}
