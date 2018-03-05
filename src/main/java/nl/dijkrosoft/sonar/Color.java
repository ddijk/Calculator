package nl.dijkrosoft.sonar;

/**
 * Created by dickdijk on 30/08/2017.
 */
public class Color {

    String kleur;

    public Color(String kleur) {
        this.kleur = kleur;
    }


    @Override
    public String toString() {
        return "Color met kleur " + kleur;
    }

    @Override
    public boolean equals(Object obj) {

        Color other = (Color) obj;
        return kleur.equals(other.kleur);
    }
}
