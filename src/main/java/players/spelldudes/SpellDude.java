package players.spelldudes;

import behaviours.ISpell;
import players.Player;
import spell.Spell;

import java.util.ArrayList;

public abstract class SpellDude extends Player implements ISpell {

    private ArrayList<Spell> spells;
    private ArrayList<String> mythicalCreatures;

    public SpellDude(String name, int healthPoints){
        super(name, healthPoints);
        this.spells = new ArrayList<Spell>();
        this.mythicalCreatures = new ArrayList<String>();
    }


    public String castSpell(Spell spell) {
        if(spells.contains(spell)){
            return this.getName() +" casts " + spell.getSpellName() + " and hit for " + spell.getSpellDamage();
        }
        return this.getName() + " does not know this spell";
    }

    public void learnSpell(Spell spell){
        spells.add(spell);
    }
}
