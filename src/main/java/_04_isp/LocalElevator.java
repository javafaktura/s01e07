package _04_isp;

import _02_ocp.Grain;

public class LocalElevator implements GrainProcessing {

    @Override
    public void clean(Grain grain) {
        throw new UnsupportedOperationException("clanging not supported in this facility");
    }

    @Override
    public void dry(Grain grain) {
        // Dry grain
    }

    @Override
    public void blend(Grain grain) {
        throw new UnsupportedOperationException("blending not supported in this facility");
    }

    @Override
    public void batch(Grain grain) {
        // batch grain
    }
}
