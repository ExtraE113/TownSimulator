package town;
public class Universe {
	static boolean thereWasLight = false; //has the Universe been run yet?
	static Person[] persons = new Person[10];
	public static void main(String[] args) {
		if(!thereWasLight) {
			for(int i = 0; i < persons.length; i++) {
				Universe universe = new Universe();
				persons[i].genIndepentdent();
				persons[i].genDependent();
			}
		}
	}
}
