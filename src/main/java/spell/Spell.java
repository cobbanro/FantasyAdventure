package spell;

public class Spell {

    private String spellName;
    private int spellDamage;

    public Spell(String spellName, int spellDamage){
        this.spellName = spellName;
        this.spellDamage = spellDamage;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getSpellDamage() {
        return spellDamage;
    }
}
