package nl.dijkrosoft.sonar;

import java.util.Objects;

public class Color {

    String kleur;

    public Color(String kleur) {
        this.kleur = kleur;
    }


    @Override
    public String toString() {
        return "Color: " + kleur;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Color other)) {
            return false;
        }

        return Objects.equals(kleur, other.kleur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kleur);
    }
}
