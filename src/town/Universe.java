package town; //This exists inside package "town"

import java.util.Scanner; //Allow the use of Scanners
import town.Rand; //Allow the use of the Rand class

public class Universe extends Person{ //I honestly don't know what this means
	static Person[] persons; //make a new array of person objects called persons

	public static void main(String[] args) { //I honestly don't know what this means
		Scanner in = new Scanner(System.in); //Create new Scanner
		//System.out.println("How many people exist in this Universe?"); //Ask the user how many people to make
		//int numPeople = in.nextInt(); //Get user input
		int numPeople = 20;
		persons = new Person[numPeople]; //create the requested number of people
		for(int i = 0; i < numPeople-1; i++) {
			persons[i] = new Person();
			System.out.println(persons[i]);
			persons[i] = generate(persons[i]);
		}
		System.out.println("Persons is: " + persons[1]);
		System.out.println("For how many epochs would you like this Universe to exist?"); //Ask the user the number of frames
		int numFrames = in.nextInt(); //set the number of frames as requested
		for(int i = 0; i<numFrames; i++){ //Run the heart of the simulation
			int person1 = Rand.randint(numPeople); //pick a random person
			int person2 = Rand.randint(numPeople); //pick another random person
			int size = Rand.randint(5); //Decide how big the interaction is
			persons[person1].interact(person2, size, person1); //Have the people interact
			persons[person2].interact(person1, size, person2); //Have the people interact
		}
	}

}