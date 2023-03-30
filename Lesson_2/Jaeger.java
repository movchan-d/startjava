public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armour;

    public Jaeger() {

    }

    public Jaeger(String modelName, String mark, float height, float weight, int speed, int strength, int armour) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armour = armour;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }
}