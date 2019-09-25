package collectors_examples;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public enum Seniority {
    JUNIOR(0, 10), MIDDLE(11, 20), SENIOR(21, 30), ARCHITECT(31, Integer.MAX_VALUE);

    private final int min;
    private final int max;

    Seniority(int min, int max) {
        this.min=min;
        this.max=max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }


    public static Seniority findBySalary(int salary) {
       return Arrays.stream(values())
                .filter(seniority -> seniority.min<=salary)
                .filter(seniority -> seniority.max>=salary)
                .findAny()
                .get();
    }














}
