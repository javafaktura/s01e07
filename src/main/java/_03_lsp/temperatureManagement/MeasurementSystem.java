package _03_lsp.temperatureManagement;

class MeasurementSystem {

    public static void main(String... args) {
        MultipleSilosSensors measurementSystem = new MultipleSilosSensors();
        //LspMultipleSilosSensors measurementSystem = new LspMultipleSilosSensors();

        measurementSystem.setSensorForPosition(new TemperatureSensor(), 1, 1, 1);
        double temperatureFromSensor = measurementSystem.getValueFromSensor(1, 1);

        System.out.println(temperatureFromSensor);
    }
}
