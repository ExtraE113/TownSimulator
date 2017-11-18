package town;
import java.util.Random;
import static java.lang.Math.abs;
import static town.Universe.persons;

public class Person {
	static Random randomGenerator = new Random();
	static int personality;
	public static double opinions[] = new double[persons.length];
	public static void main(String[] args) {
	}
	static void genIndependent(){
			personality = randomGenerator.nextInt(100);
	}
	static void genDependent() {
		for (int i = 0; i < opinions.length; i++) {
			opinions[i] = abs((1 / (personality - persons[i].personality)) * 100);
		}
	}
	public static void generate(){
		genIndependent();
		genDependent();
	}
	public static void interact(int who, double size){
		if(opinions[who] > 50) {
			opinions[who] = opinions[who] + randomGenerator.nextDouble(size);
		}else{
			opinions[who] = opinions[who] - randomGenerator.nextDouble(size);
		}
	}
}

