package _05_dip;

public class StillNotDipGrainMeasurementSystem {

    private HumiditySensor humiditySensor;
    private TemperatureSensor temperatureSensor;

    public StillNotDipGrainMeasurementSystem(HumiditySensor humidityMeter, TemperatureSensor temperatureMeter) {
        this.humiditySensor = humidityMeter;
        this.temperatureSensor = temperatureMeter;
    }

    public void mesure() {
        humiditySensor.measureHumidity();
        temperatureSensor.measureTemperature();
    }

}

