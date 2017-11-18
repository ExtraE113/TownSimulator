package town;
import java.util.Random;
import static town.Universe.persons;

public class Person {
	static int opinion[] = new int[10];
	static Random randomGenerator = new Random();
	static int personality;
	static int opinions[] = new int[persons.length];
	public static void main(String[] args) {
	}
	public static void genIndepentdent(){
			personality = randomGenerator.nextInt(100);
	}
	public static void genDependent() {

	}
}
