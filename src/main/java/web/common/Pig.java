package web.common;

public class Pig extends Animal {

    private int weight;

    public Pig() {
        super();
    }

    public Pig(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " " + weight + "kg";
    }
}
