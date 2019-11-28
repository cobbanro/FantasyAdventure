package players;

import items.Weapon;
import items.WeaponType;

public class Rogue extends Fighter {

    private int stealthLevel;

    public Rogue(String name, int healthPoints, WeaponType weapon, int stealthLevel) {
        super(name, healthPoints, weapon);
        this.stealthLevel = stealthLevel;
    }

    public int getStealthLevel() {
        return stealthLevel;
    }
}
