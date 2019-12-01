package players.spelldudes;

import players.Player;
import spell.Spell;

public class Warlock extends SpellDude {

    private Spell hellFire;
    private Spell darkBomb;
    private int mana;

    public Warlock(String name, int healthPoints){

        super(name, healthPoints);
        this.hellFire = new Spell("Hell Fire", 3, 3);
        this.darkBomb = new Spell("Dark Bomb", 1, 1);
        this.mana = 5;
    }

    public Spell getHellFire() {
        return hellFire;
    }

    public Spell getDarkBomb() {
        return darkBomb;
    }

    public int getMana() {
        return mana;
    }

    public void castSpell(Spell spell, Player player) {



        if (spell == this.hellFire  && mana >= 3){
            int updatedHealth = player.getHealthPoints() - spell.getSpellDamage();
            player.setHealthPoints(updatedHealth);
            setHealthPoints(updatedHealth - 1);
            mana -= 3;
        }

        if (spell == this.darkBomb && mana >= 1){
            int updatedHealth = player.getHealthPoints() - spell.getSpellDamage();
            player.setHealthPoints(updatedHealth);
            mana -= 1;
        }

        mana += 1;
    }

}
