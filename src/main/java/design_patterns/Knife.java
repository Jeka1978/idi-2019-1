package design_patterns;

/**
 * @author Evgeny Borisov
 */
public class Knife implements Weapon {

    @Override
    public void kick() {
        // logic which kick with sword
        System.out.println("I kicked you with my knife");
    }
}
