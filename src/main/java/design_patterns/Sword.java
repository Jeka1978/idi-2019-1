package design_patterns;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {

    @Override
    public void kick() {
        // logic which kick with sword
        System.out.println("I kicked you with my sword");
    }
}
