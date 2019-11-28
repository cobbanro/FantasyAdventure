package players.fighters;

import items.Weapon;
import players.fighters.Fighter;

public class Dwarf extends Fighter {

    private int temperLevel;

    public Dwarf(String name, int healthPoints, Weapon weapon){
        super(name, healthPoints, weapon);
        this.temperLevel = 0;
    }

    public int getTemperLevel() {
        return temperLevel;

    }
}
