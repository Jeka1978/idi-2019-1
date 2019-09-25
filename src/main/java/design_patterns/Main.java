package design_patterns;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Knight knight = new Knight();
        while (true)
        {
            knight.kick();
            Thread.sleep(500);
        }
    }
}
