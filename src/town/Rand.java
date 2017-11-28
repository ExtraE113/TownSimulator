package town; //I'm in the town package
import java.util.Random; //Let me make random numbers

public class Rand { //I honestly don't know what this does
    public static int randint(int bound) { //create a function for generating random ints
        Random randomGenerator = new Random(); //create a random generator
        int randnum = randomGenerator.nextInt(bound);
        return (randnum); //and get a random number
    }
    public static double randdouble() { //create a function for generating random doubles
        Random randomGenerator = new Random(); //Create a random generator
        return (randomGenerator.nextDouble()); //and get a random double btwn 0 and 1
    }
}
