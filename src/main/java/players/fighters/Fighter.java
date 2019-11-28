package players.fighters;

import items.Item;
import items.Weapon;
import items.WeaponType;
import players.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private Weapon weapon;

    public Fighter(String name, int healthPoints, Weapon weapon){
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
