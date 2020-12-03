import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Random;

public class Warrior {
    private String nickName = "unknown";
    private int lifeForce = 10;
    private int damage = 0;
    private boolean breathing = false;
        // list of weapons for
    String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"};

        // to set life to 10
    public void reSpawn() {
        lifeForce = 10;
    }

        // Calls the function print info, prints the name and the weapon.
    public void Allinfo(String name){
        Random r = new Random();
        System.out.println(name);
        printinfo();
        System.out.println( "Your weapon is an " + armory[r.nextInt(armory.length)]);

    }
        // to tell if the warrior is alive.
    public boolean Setbreathing(boolean breathing){
        this.breathing = breathing;
        return breathing;
    }
    public String SetName(String Name){
        this.nickName = Name;
        return Name;
    }
        // function to print everything health, onomatopoaeia, damage, health and if the warrior is alive.
        // line 38, since damage and health are set before printinfo is called, damage...
        // ... will never be more than 10, so adding the remaining life plus the damage will display 10

    public void printinfo(){
        System.out.println("Total Life points:  " + (this.lifeForce + this.damage));
        reaction();
        System.out.println("Total Damage Taken:  " + this.damage );
        System.out.println("Remaining life is: "+  (this.lifeForce));
        System.out.println("Is your warrior alive? " + this.breathing);

    }

    public void takeDamage(int n) {
        this.lifeForce-=n;
        this.damage=n;
    }
        // list of onomatopoaeias.
    public void reaction() {
        Random r = new Random();
        String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
        System.out.println(sound[r.nextInt(sound.length)]);
    }

    public boolean isDead() {
        if (lifeForce <= 0) return true;
        else return false;
    }

    public boolean isAlive() {
        if (lifeForce > 0) return true;
        else return false;
    }










}
