package nl.dijkrosoft.sonar;

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

        Color other = (Color) obj;
        return kleur.equals(other.kleur);
    }
}
