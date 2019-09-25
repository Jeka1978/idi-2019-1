package java8_examples;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Equalator<T> {
    boolean equals(T t1, T t2);

}
