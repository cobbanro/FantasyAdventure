package players.fighters;

import items.Weapon;
import players.fighters.Fighter;

public class Knight extends Fighter {

    private int charismaLevel;

    public Knight(String name, int healthPoints, Weapon weapon, int charismaLevel) {
        super(name, healthPoints, weapon);
        this.charismaLevel = charismaLevel;
    }

    public int getCharismaLevel() {
        return charismaLevel;
    }
}
