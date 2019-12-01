package players.spelldudes;

import players.Player;
import spell.Spell;

import java.util.Random;

public class Wizard extends SpellDude {

    private Spell fireBall;
    private Spell ping;
    private int mana;


    public Wizard(String name, int healthPoints){
        super(name, healthPoints);
        this.fireBall = new Spell("Hell Fire", 6, 5);
        this.ping = new Spell("Ping", 1, 2);
        this.mana = 7;
    }

    public Spell getFireBall() {
        return fireBall;
    }

    public Spell getPing() {
        return ping;
    }

    public int getMana() {
        return mana;
    }

    public void castSpell(Spell spell, Player player) {
        Random randomNumber = new Random();
         int hitOrMiss =randomNumber.nextInt();

        if (spell == this.fireBall  && mana >= 5){
            if(hitOrMiss % 2 == 0){
            }
            else{
                int updatedHealth = player.getHealthPoints() - spell.getSpellDamage();
            player.setHealthPoints(updatedHealth);
            mana -= 3;
            }
        }

        if (spell == this.ping && mana >= 1){
            int updatedHealth = player.getHealthPoints() - spell.getSpellDamage();
            player.setHealthPoints(updatedHealth);
            mana -= 2;
        }

        mana += 1;
    }

}


