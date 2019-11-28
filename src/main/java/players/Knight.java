package players;

import items.Weapon;
import items.WeaponType;

public class Knight extends Fighter {

    private int charismaLevel;

    public Knight(String name, int healthPoints, WeaponType weapon, int charismaLevel) {
        super(name, healthPoints, weapon);
        this.charismaLevel = charismaLevel;
    }
}
