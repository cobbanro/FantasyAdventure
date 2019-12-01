package spell;

public class Spell {

    private String spellName;
    private int spellDamage;
    private int manaCost;

    public Spell(String spellName, int spellDamage, int manaCost){
        this.spellName = spellName;
        this.spellDamage = spellDamage;
        this.manaCost = manaCost;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getSpellDamage() {
        return spellDamage;
    }
}
