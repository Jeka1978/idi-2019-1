package stream_api_examples;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class MainCountWords {
    @SneakyThrows
    public static void main(String[] args) {
        Stream<String> lines = Files.lines(Paths.get("yest.txt"));
        long count = lines.flatMap(word -> Arrays.stream(word.split("\\W+")))
                .count();
        System.out.println("count = " + count);


    }
}
