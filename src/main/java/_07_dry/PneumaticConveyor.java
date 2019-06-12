package _07_dry;

public class PneumaticConveyor {

    final static private int MAX_GRAIN_MASS = 30;

    public void transportGrain(int grainWeightInTons) {
        if (grainWeightInTons >= MAX_GRAIN_MASS) {
            throw new RuntimeException("Max 30 tons of grain allowed");
        } else {
            //...
        }
    }

}

class Weighbridge {

    final static private int MAX_GRAIN_MASS = 30;

    public void weightGrain(int grainWeightInTons) {
        if (grainWeightInTons >= MAX_GRAIN_MASS) {
            throw new RuntimeException("Max 30 tons of grain allowed");
        } else {
            //...
        }
    }

}

