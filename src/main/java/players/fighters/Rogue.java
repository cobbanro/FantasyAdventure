package players.fighters;

import items.Weapon;
import players.fighters.Fighter;

public class Rogue extends Fighter {

    private int stealthLevel;

    public Rogue(String name, int healthPoints, Weapon weapon, int stealthLevel) {
        super(name, healthPoints, weapon);
        this.stealthLevel = stealthLevel;
    }

    public int getStealthLevel() {
        return stealthLevel;
    }
}
