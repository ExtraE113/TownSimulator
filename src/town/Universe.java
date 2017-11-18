package town;

import java.util.Random;
import java.util.Scanner;

public class Universe {
	static Person[] persons;
	public static void main(String[] args) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("How many people exist in this Universe? ");
		int numPeople = in.nextInt();
		persons = new Person[numPeople];
		for(int i = 0; i < persons.length; i++) {
			persons[i].generate();
		}
		System.out.println("For how many epochs would you like this Universe to exist?");
		int numFrames = in.nextInt();
		for(int i = 0; i<numFrames; i++){
			int person1 = random.nextInt(200);
			int person2 = random.nextInt(200);
			int size = random.nextInt(5);
			persons[person1].interact(person2, size);
			persons[person2].interact(person1, size);
		}
	}

}

