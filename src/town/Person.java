package town;
import java.util.Random;
import static town.Universe.persons;

public class Person {
	static Random randomGenerator = new Random();
	static int personality;
	public static int opinions[] = new int[persons.length];
	public static void main(String[] args) {
	}
	public static void genIndependent(){
			personality = randomGenerator.nextInt(100);
	}
	public static void genDependent() {
		for(int i = 0; i < opinions.length; i++){
			opinions[i] = (1/personality - persons[i].personality)*100;
		}
	}
}
