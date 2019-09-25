package design_patterns;

/**
 * @author Evgeny Borisov
 */
public class King implements Hero {
    @Override
    public void kick() {
        // logic which kick with sword
        System.out.println("I kicked you with my sword");
    }
}
