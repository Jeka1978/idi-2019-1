package multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public class Child implements Mother, Father {

    @Override
    public void talkToChildren() {
        Mother.super.talkToChildren();
        Father.super.talkToChildren();
    }
}
