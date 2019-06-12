package _03_lsp.temperatureManagement;

class MultipleSilosSensors extends SilosSensors {

    private Sensor[][][] multipleSilosSensors = new Sensor[4][5][4];

    public double getValueFromSensor(int position, int level, int silosNumber) {
        return multipleSilosSensors[position][level][silosNumber].measure();
    }

    public void setSensorForPosition(Sensor sensor, int position, int level, int silosNumber) {
        multipleSilosSensors[position][level][silosNumber] = sensor;
    }

}
