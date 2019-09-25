package stream_api_examples;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class MainReduceEamples {
    public static void main(String[] args) {
        List<String> strings = asList("Jeka", "Eldad", "Avishay");
        Optional<String> optional = strings.stream().reduce((s, s2) -> s + ", " + s2);
        System.out.println(optional.orElse(""));

        Stream.generate(() -> "IDI").forEach(System.out::println);
    }
}
