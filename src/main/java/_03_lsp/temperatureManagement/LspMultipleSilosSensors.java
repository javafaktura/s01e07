package _03_lsp.temperatureManagement;

import java.util.Arrays;
import java.util.List;

class LspMultipleSilosSensors {

    private List<SilosSensors> multipleSilosSensors = Arrays.asList(
            new SilosSensors(),
            new SilosSensors(),
            new SilosSensors());

    double getTemperatureFromSensor(int position, int level, int silosNumber) {
        return multipleSilosSensors.get(silosNumber).getValueFromSensor(position, level);
    }

    void setSensorForPosition(Sensor sensor, int position, int level, int silosNumber) {
        multipleSilosSensors.get(silosNumber).setSensorAtPosition(sensor, position, level);
    }

}
