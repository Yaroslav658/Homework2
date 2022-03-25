package Homework2;

public abstract class Unit {

    private String name;
    private int health;
    private int mana;

    public Unit(String name, int health, int mana) {
        System.out.println("Unit added");
        this.name = name;
        this.health = health;
        this.mana = mana;
    }
    public void UnitData(){
        if(health > 0) {
            System.out.println("Stats: " + this.name + " " + this.health+ " " + this.mana);
        }
        else{
            System.out.println("Unit " + this.name + " is dead :(" );
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int newMana) {
        mana = newMana;
    }

}
