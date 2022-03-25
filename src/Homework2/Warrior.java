package Homework2;

public class Warrior extends Unit {
    private double KnifeDamage;

    public Warrior(String name, int health, int mana, double KnifeDamage) {
        super(name, health, mana);
        setDamage(KnifeDamage);
    }

    public void Death() {
        setHealth(0);
        System.out.println(getName() + " is dead");
    }
    public void Death( String reason) {
        setHealth(0);
        System.out.println(getName() + " is dead by " + reason);
    }

    public double getDamage() {
        return KnifeDamage;
    }

    public void setDamage(double newDamage) {
        if(newDamage >= 0.0) {
            KnifeDamage = newDamage;
        }
    }

    public double DoubleDamage() {
        System.out.println("Double damage " + getName());
        return KnifeDamage= KnifeDamage*2;
    }
}

class WarriorTest {

    public static void main(String [] args) {
        Warrior Jugg = new Warrior ("Jugg", 100, 30, 50);
        Jugg.UnitData();
        Jugg.Death("Fire");
        Jugg.UnitData();
        System.out.println(Jugg.getDamage());
        Jugg.DoubleDamage();
        System.out.println(Jugg.getDamage());
    }
}