package town;
import java.util.Random;
import static java.lang.Math.abs;
import static town.Universe.persons;

public class Person {
	static Random randomGenerator = new Random();
	static int personality;
	public static double opinions[] = new double[persons.length];
	static void genIndependent(){
			personality = randomGenerator.nextInt(100);
	}
	static void genDependent() {
		for (int i = 0; i < opinions.length; i++) {
			opinions[i] = abs(personality - persons[i].personality) * 100;
			System.out.println(personality);
			System.out.println(persons[i].personality);
			System.out.println(opinions[i]);
		}
	}
	public static void interact(int who, double size, int me){
		if(abs(opinions[who]-persons[who].opinions[me]) >=40){
			opinions[who]=persons[who].opinions[me];
			System.out.println("The truth came out: Due to wildly differing opinions, " + me + "'s opinion was changed to " + who + "'s, resulting in equal opinions of " + opinions[who]);
		}
		if(opinions[who] > 50) {
			opinions[who] = opinions[who] + randomGenerator.nextDouble()*size;
			System.out.println(me + " interacts +ly with " + who + " resulting in a new opinion of " + opinions[who]);
		}else{
			opinions[who] = opinions[who] - randomGenerator.nextDouble()*size;
			System.out.println(me + " interacts -ly with " + who + " resulting in a new opinion of " + opinions[who]);
		}
	}
}