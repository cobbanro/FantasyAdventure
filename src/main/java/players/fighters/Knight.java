package players.fighters;

import behaviours.IFight;
import items.Weapon;
import items.WeaponType;
import players.Monster;
import players.Player;

import java.util.Random;

public class Knight extends Fighter implements IFight {

    private int armour;

    public Knight(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
        this.armour = 0;
    }

    public int getCharismaLevel() {
        return armour;
    }

    public void attack(Player player) {
        int updatedHealth = player.getHealthPoints() - weapon.getDamage();
        player.setHealthPoints(updatedHealth);
    }

    public void defend(Monster monster){
        Random randomNumber = new Random();
        armour = randomNumber.nextInt();
        if(armour % 2 == 0){
        }
        else {
            int updatedHealth = getHealthPoints() - monster.getWeapon().getDamage();
            setHealthPoints(updatedHealth);
        }
    }

}
