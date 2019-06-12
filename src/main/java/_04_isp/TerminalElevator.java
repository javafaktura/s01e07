package _04_isp;

import _02_ocp.Grain;

public class TerminalElevator implements GrainProcessing {

    @Override
    public void clean(Grain grain) {
        // clean grain
    }

    @Override
    public void dry(Grain grain) {
        // _07_dry grain
    }

    @Override
    public void blend(Grain grain) {
        // blend grain
    }

    @Override
    public void batch(Grain grain) {
        // batch grain
    }
}
