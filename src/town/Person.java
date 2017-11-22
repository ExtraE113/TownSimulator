package town;

import static java.lang.Math.abs;
import static town.Rand.*;
import static town.Universe.persons;

class Person {
    static int personality;
    static double opinions[] = new double[persons.length];

    static void genIndependent() {
        personality = randint(100);
        System.out.println("personality generated: " + personality);
    }

    static void genDependent(int me) {
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

    static void interact(int who, double size, int me) {
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