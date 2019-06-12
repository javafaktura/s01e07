package _02_ocp;

public class Grain {

    private GrainType type;
    private int humidity;
    private int weight;

    public Grain(GrainType name, int humidity, int weight) {
        this.type = name;
        this.humidity = humidity;
        this.weight = weight;
    }

    public GrainType getType() {
        return type;
    }

    public void setType(GrainType type) {
        this.type = type;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Grain{" +
                "type=" + type +
                ", humidity=" + humidity +
                ", weight=" + weight +
                '}';
    }
}
