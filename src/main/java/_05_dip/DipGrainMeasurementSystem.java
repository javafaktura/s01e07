package _05_dip;

import java.util.List;

public class DipGrainMeasurementSystem {

    private List<Measurable> sensors;

    public DipGrainMeasurementSystem(List<Measurable> sensors) {
        this.sensors = sensors;
    }

    public void mesure() {
        sensors.forEach($ -> $.measure());
    }

}

interface Measurable {

    void measure();

}

class DipHumiditySensor implements Measurable {

    @Override
    public void measure() {
        // measure humidity
    }

}

class DipTemperatureSensor implements Measurable {

    @Override
    public void measure() {
        // measure temperature
    }
}