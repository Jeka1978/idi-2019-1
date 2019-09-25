package multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Mother {

    default void talkToChildren(){
        System.out.println("BE QUIET!!!");
    }
}
