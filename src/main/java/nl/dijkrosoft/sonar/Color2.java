package nl.dijkrosoft.sonar;

public class Color2 {

    String kleur;

    public Color2(String kleur) {
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
