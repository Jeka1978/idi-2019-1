package design_patterns;

import lombok.Setter;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Knight implements Hero {

    private Weapon weapon = new Sword();

    @Override
    public void kick() {
        Random random = new Random();
        int i = random.nextInt(10);


        if (i < 3) {
            weapon = new Knife();
        }
        else {
            weapon = new Sword();
        }
        this.weapon.kick();
    }
}


