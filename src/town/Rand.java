package town;
import java.util.Random;

public class Rand {
    public static int randint(int bound) {
        Random randomGenerator = new Random();
        return (randomGenerator.nextInt(bound));
    }
    public static double randdouble() {
        Random randomGenerator = new Random();
        return (randomGenerator.nextDouble());
    }
}
