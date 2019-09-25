package lombok_examples;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Person {
    private String name;
    private int age;
    @Getter
    private int salary;
    @Singular
    private Map<String,Integer> beers;

    @Singular
    private List<String> children;

    @Singular("דג")
    private List<String> fish;


}
