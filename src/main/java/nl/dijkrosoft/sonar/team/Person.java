package nl.dijkrosoft.sonar.team;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Person {

    private static final Logger logger = Logger.getLogger(Person.class.getName());
    String name;
    List<Skill> skills = new ArrayList<>();

    public static Person copy(Person original) {
        Person p = new Person();
        p.name = original.name;
        p.skills = new ArrayList<>(original.skills);

        return p;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person jaap = new Person();
        jaap.name = "jaap";
        jaap.skills.add(new Skill("Java", 5));

        Person kees = (Person) jaap.clone();
        kees.name = "kees";

        jaap.skills.add(new Skill("Kotlin", 3));

        logger.info("Name van kees is '%s'".formatted(kees.name));
        logger.info("Skills van kees zijn '%s'".formatted(kees.skills));

        logger.info("Name van jaap is '%s'".formatted(jaap.name));
        logger.info("Skills van jaap zijn '%s'".formatted(jaap.skills));

    }
}
