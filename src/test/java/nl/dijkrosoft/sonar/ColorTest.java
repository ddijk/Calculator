package nl.dijkrosoft.sonar;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by dickdijk on 30/08/2017.
 */
public class ColorTest {


    @Test
    public void test() {


        Color color1 = new Color("blauw");
        Color color2 = new Color("rood");
        Color color3 = new Color("groen");

        List<Color> input = Arrays.asList(color1, color2, color3);


        List<Color> expectedResult = Arrays.asList(color2);

        Predicate<Color> onlyReds = createPredicate("rood");
        assertEquals(expectedResult, applyFilter(input, onlyReds));
    }

    private Predicate<Color> createPredicate(String kleur) {

        return color -> color.kleur.equals(kleur);
    }

    private List<Color> applyFilter(List<Color> input, Predicate<Color> filter) {

        return input.stream().filter(filter).collect(Collectors.toList());
    }
}
