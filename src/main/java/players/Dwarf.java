package players;

import items.Weapon;
import items.WeaponType;

public class Dwarf extends Fighter {

    private int temperLevel;

    public Dwarf(String name, int healthPoints, WeaponType weapon){
        super(name, healthPoints, weapon);
        this.temperLevel = 0;
    }


}
