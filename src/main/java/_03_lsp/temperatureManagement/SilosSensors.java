package _03_lsp.temperatureManagement;

class SilosSensors {

    private Sensor[][] sensors = new Sensor[4][5];

    void setSensorAtPosition(Sensor sensor, int position, int level) {
        sensors[position][level] = sensor;
    }

    double getValueFromSensor(int position, int level) {
        return sensors[position][level].measure();
    }

}
