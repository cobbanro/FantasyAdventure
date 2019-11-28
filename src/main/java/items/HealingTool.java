package items;

public class HealingTool extends Item {

    private String thingThatHeals;
    private int healingAmount;

    public HealingTool(int weight, String thingThatHeals, int healingAmount){
        super(weight);
        this.thingThatHeals = thingThatHeals;
        this.healingAmount = healingAmount;
    }

}
