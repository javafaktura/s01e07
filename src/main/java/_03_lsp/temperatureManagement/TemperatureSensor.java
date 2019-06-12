package _03_lsp.temperatureManagement;

import java.util.Random;

class TemperatureSensor implements Sensor {

    private Random random = new Random();

    @Override
    public double measure() {
        return random.nextInt(60 - 10 + 1) + 10;
    }
}
