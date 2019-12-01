package players.spelldudes;

import behaviours.ISpell;
import players.Player;
import spell.Spell;

import java.util.ArrayList;

public abstract class SpellDude extends Player implements ISpell {

    protected ArrayList<Spell> spells;
    protected ArrayList<String> mythicalCreatures;
    protected int mana;

    public SpellDude(String name, int healthPoints){
        super(name, healthPoints);
        this.spells = new ArrayList<Spell>();
        this.mythicalCreatures = new ArrayList<String>();
        this.mana = 5;
    }


}
