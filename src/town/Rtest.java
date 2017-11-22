package town;

import java.util.Random;

public class Rtest {
    public static int rand(int bound) {
        Random randomGenerator = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(randomGenerator.nextInt(bound));
        }
    }
}
