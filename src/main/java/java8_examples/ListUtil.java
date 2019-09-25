package java8_examples;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtil {
    public static <T> int countDuplicates(List<T> list, T t, Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                counter++;
            }
        }
        return counter;
    }














}
