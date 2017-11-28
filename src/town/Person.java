package town; //Puts this in the "town" package

import static java.lang.Math.abs; //Let me use absolute value operation
import static town.Rand.*; //Allow the use of the Rand class
import static town.Universe.persons; //Let me access other people

class Person {
    int personality; //Make a spot for me to hold my personality
    double opinions[] = new double[persons.length]; //Make spots for me to hold my opinions of others

    void genIndependent() { //create a function to generate independent things
        personality = randint(100); //Create my personality
        System.out.println("personality generated: " + personality); //Look, user, I made my personality!
    }

    void genDependent(int me) { //Create a function to generate
        for (int i = 0; i < opinions.length; i++) {
            if (abs(personality - persons[i].personality) == 0) {
                opinions[i] = 100;
            } else {
                opinions[i] = abs(persons[me].personality - persons[i].personality) * 100;
            }
            System.out.println(me + "'s personality (me) : " + personality);
            System.out.println(i + "'s personality: " + persons[i].personality);
            System.out.println("My opinion: " + opinions[i]);
        }
    }

    void interact(int who, double size, int me) {
        if (abs(opinions[who] - persons[who].opinions[me]) >= 40) {
            opinions[who] = persons[who].opinions[me];
            System.out.println("The truth came out: Due to wildly differing opinions, " + me + "'s opinion was changed to " + who + "'s, resulting in equal opinions of " + opinions[who]);
        }
        if (opinions[who] > 50) {
            opinions[who] = opinions[who] + randdouble() * size;
            System.out.println(me + " interacts +ly with " + who + " resulting in a new opinion of " + opinions[who]);
        } else {
            opinions[who] = opinions[who] - randdouble() * size;
            System.out.println(me + " interacts -ly with " + who + " resulting in a new opinion of " + opinions[who]);
        }
    }
}