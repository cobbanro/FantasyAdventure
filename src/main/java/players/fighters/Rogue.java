package players.fighters;

import items.Weapon;
import items.WeaponType;
import players.Player;

public class Rogue extends Fighter {

    private int agility;

    public Rogue(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
        this.agility = 0;
    }

    public int getStealthLevel() {
        return agility;
    }

    public void attack(Player player) {

            int updatedHealth = player.getHealthPoints() - weapon.getDamage();
            player.setHealthPoints(updatedHealth);
        this.agility += 1;
            if (agility >= 5){
                updatedHealth = player.getHealthPoints() - weapon.getDamage();
                player.setHealthPoints(updatedHealth);
                this.agility = 0;
            }
    }
}
