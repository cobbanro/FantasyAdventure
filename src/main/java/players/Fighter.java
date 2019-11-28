package players;

import items.Item;
import items.Weapon;
import items.WeaponType;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private WeaponType weapon;


    public Fighter(String name, int healthPoints, WeaponType weapon){
        super(name, healthPoints);
        this.weapon = weapon;

    }

    public WeaponType getWeaponType() {
        return weapon;
    }
}
