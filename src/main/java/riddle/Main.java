package riddle;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(
                asList("Arnold", "Stallone", "Chuck Norris", "Brus Lee"));


        strings.removeIf(s -> s.equals("Brus Lee"));

        System.out.println("strings = " + strings);
    }
}
