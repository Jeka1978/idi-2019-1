package collectors_examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Evgeny", 41);
        hashMap.compute("Evgeny", (s, integer) -> integer + 1);
        System.out.println(hashMap);






        List<String> list = Arrays.asList("java","java","kotlin","groovy");
        List<String> list1 = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("list1 = " + list1);
        Map<String, Integer> map = list1.stream()
                .collect(Collectors.toMap(Function.identity(), String::length, Integer::sum));
        System.out.println("map = " + map);
    }
}
