package players;

public class Monster extends Player{

    private String type;

    public Monster(String name, int healthPoints, String type) {
        super(name, healthPoints);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
