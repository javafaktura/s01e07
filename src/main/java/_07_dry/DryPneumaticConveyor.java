package _07_dry;

public class DryPneumaticConveyor {

    private WeightChecker weightChecker;

    public void transportGrain(int grainWeightInTons) {
        weightChecker.checkGrainWeight(grainWeightInTons);

        // transport grain
    }

}

class DryWeighbridge {

    private WeightChecker weightChecker;

    public void weightGrain(int grainWeightInTons) {
        weightChecker.checkGrainWeight(grainWeightInTons);

        //weight grain
    }

}

class WeightChecker {

    final static private int MAX_GRAIN_MASS = 30;

    void checkGrainWeight(int grainWeightInTons) {
        if (grainWeightInTons >= MAX_GRAIN_MASS) {
            throw new RuntimeException("Max 30 tons of grain allowed");
        }
    }

}
