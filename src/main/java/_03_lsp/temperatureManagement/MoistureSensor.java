package _03_lsp.temperatureManagement;

import java.util.Random;

class MoistureSensor implements Sensor {

    private Random random = new Random();

    @Override
    public double measure() {
        return random.nextInt(20 - 5 + 1) + 20;
    }
}
