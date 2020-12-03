/////////////////////////////////////
//Derek McPeak
//CSC 160 Computer Science 1
//11/07/2020
//Warrior Array. 
/////////////////////////////////////



// importing random utility.
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Random r = new Random();
            // calling Warrior class and assigning it to "doug"
        Warrior doug = new Warrior();

        int DamageAmount;
            // list of five Warriors, each having their own name.
        String[] TheWarriors = {doug.SetName("Masamune"), doug.SetName("Motsumoto"), doug.SetName("Sun Tzu"), doug.SetName("Oda"), doug.SetName("Sanada")};
            // setting health to 10.
            // loop that will run through the length of items in the array.
            // calls the variable damage amount
            // calling the method takedamage from the Warrior class and passing DamageAmount through it.
            // calling the method Setbreathing from the Warrior Class and passing IsAlive to tell either if the warrior is dead or alive.
            // displaying the info every warrior, randomly chosen.

        for (int z = 0; z < TheWarriors.length; z++) {
            doug.Allinfo(TheWarriors[r.nextInt(TheWarriors.length)]);
            System.out.println(" ");
        }

    }

}
