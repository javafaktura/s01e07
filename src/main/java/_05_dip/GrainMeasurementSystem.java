package _05_dip;

public class GrainMeasurementSystem {

    private HumiditySensor humidityMeter = new HumiditySensor();
    private TemperatureSensor temperatureMeter = new TemperatureSensor();

    public void mesure() {
        humidityMeter.measureHumidity();
        temperatureMeter.measureTemperature();
    }

}

class HumiditySensor {

    void measureHumidity() {
        //Measure Humidity
    }
}

class TemperatureSensor {

    void measureTemperature() {
        // Measure Temperature
    }
}