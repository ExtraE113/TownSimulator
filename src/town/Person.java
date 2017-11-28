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

    void genDependent(int me) { //Create a function to generate dependent
        for (int i = 0; i < opinions.length; i++) { //Do this for everyone
            if (abs(personality - persons[i].personality) == 0) { //If we're exactly the same
                opinions[i] = 100; //have an opinion of 100
            } else { //Otherwise,
                opinions[i] = abs(persons[me].personality - persons[i].personality) * 100; //Calculate how close our personalities are and set our opinion to be greater if they're closer, and lower if they're further
            }
            System.out.println(me + "'s personality (me) : " + personality); //Look, user, I calculated an opinion!
            System.out.println(i + "'s personality: " + persons[i].personality);
            System.out.println("My opinion: " + opinions[i]);
        }
    }

    void interact(int who, double size, int me) { //Create function for interaction
        if (abs(opinions[who] - persons[who].opinions[me]) >= 40) { //If our opinions are very different set them to be equal
            opinions[who] = persons[who].opinions[me];
            System.out.println("The truth came out: Due to wildly differing opinions, " + me + "'s opinion was changed to " + who + "'s, resulting in equal opinions of " + opinions[who]); //Tell the user
        }
        if (opinions[who] > 50) { //If I like the person
            opinions[who] = opinions[who] + (randdouble() * size); //Interact positively
            System.out.println(me + " interacts +ly with " + who + " resulting in a new opinion of " + opinions[who]); //Tell the user
        } else { //I don't like the person
            opinions[who] = opinions[who] - (randdouble() * size); //Interact negatively
            System.out.println(me + " interacts -ly with " + who + " resulting in a new opinion of " + opinions[who]); //Tell the user
        }
    }
}